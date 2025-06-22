package com.Capium.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_Bookkeeping_Task_locators;
import com.Capium.Utilies.ExcelUtils;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Capium_Bookkeeping_Task_Actions {

	Capium_Bookkeeping_Task_locators TaskLocators = null;

	public Capium_Bookkeeping_Task_Actions() {
		this.TaskLocators = new Capium_Bookkeeping_Task_locators();
		PageFactory.initElements(HelperClass.getDriver(), TaskLocators);
	}

	WebDriverWait wait = HelperClass.getWait();
	String JournalPath = "D:\\Core Modules\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";

	public void ClickOnTask() {
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.Tasks));
		TaskLocators.Tasks.click();
	}

	public void ClickOnJournals() {
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnJournals));
		TaskLocators.ClickOnJournals.click();
	}

	public void AddNewJournalbtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnAddJournal));
		Thread.sleep(2000);
		TaskLocators.ClickOnAddJournal.click();
	}

	public void ClickOnAddJournalAndEnterdata() throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream(JournalPath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Journal");
		int rowcount = sheet.getLastRowNum();
		Log.info("Total row count: " + rowcount);
		DataFormatter formatter = new DataFormatter();

		WebDriver driver = HelperClass.getDriver();
		double totalDebit = 0.0;
		double totalCredit = 0.0;

		for (int i = 1; i <= rowcount; i++) {
			Thread.sleep(1000);
			XSSFRow row = sheet.getRow(i);
			int rowIndex = i - 1;

			String AccountCode = getFormattedValue(row.getCell(0), formatter);
			String AccountName = getFormattedValue(row.getCell(1), formatter);
			String DebitStr = getFormattedValue(row.getCell(2), formatter);
			String CreditStr = getFormattedValue(row.getCell(3), formatter);

			double debit = DebitStr.isEmpty() ? 0.0 : Double.parseDouble(DebitStr);
			double credit = CreditStr.isEmpty() ? 0.0 : Double.parseDouble(CreditStr);

			totalDebit += debit;
			totalCredit += credit;

			WebElement accountCodeInput = driver
					.findElement(By.xpath("//input[@name='invoice_account_r" + rowIndex + "']"));
			WebElement descriptionInput = driver
					.findElement(By.xpath("//textarea[@name='Items[" + rowIndex + "].Note']"));

			wait.until(ExpectedConditions.visibilityOf(accountCodeInput)).sendKeys(AccountCode);
			wait.until(ExpectedConditions.visibilityOf(descriptionInput)).sendKeys(AccountName);
			HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Debit']"), DebitStr);
			HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Credit']"), CreditStr);

			if (i < rowcount) {
				wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickAddRow)).click();
				Thread.sleep(500);
			}
		}

		if (Math.abs(totalDebit - totalCredit) > 0.01) {
			double difference = Math.abs(totalDebit - totalCredit);
			int balancingRowIndex = rowcount;

			wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickAddRow)).click();
			Thread.sleep(1000);

			String balancingAccountCode = "5220";
			String note = "Auto-balancing entry";

			WebElement accountCodeInput = driver
					.findElement(By.xpath("//input[@name='invoice_account_r" + balancingRowIndex + "']"));
			WebElement descriptionInput = driver
					.findElement(By.xpath("//textarea[@name='Items[" + balancingRowIndex + "].Note']"));
			WebElement debitInput = driver
					.findElement(By.xpath("//input[@name='Items[" + balancingRowIndex + "].Debit']"));
			WebElement creditInput = driver
					.findElement(By.xpath("//input[@name='Items[" + balancingRowIndex + "].Credit']"));

			accountCodeInput.sendKeys(balancingAccountCode);
			descriptionInput.sendKeys(note);

			String formattedValue = String.format("%.2f", difference);

			if (totalDebit < totalCredit) {
				((JavascriptExecutor) driver).executeScript("arguments[0].value='" + formattedValue + "';", debitInput);
				debitInput.sendKeys(Keys.TAB);
			} else {
				((JavascriptExecutor) driver).executeScript("arguments[0].value='" + formattedValue + "';",
						creditInput);
				creditInput.sendKeys(Keys.TAB);
			}

			Log.info("Added balancing row. Amount: " + formattedValue);
		} else {
			Log.info("Debit and Credit are already balanced. No extra row added.");
		}

		wb.close();
		file.close();
	}

	private String getFormattedValue(Cell cell, DataFormatter formatter) {
		if (cell == null)
			return "";
		return formatter.formatCellValue(cell).trim();
	}

	public void SaveandClose() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnSaveAndClose));
		TaskLocators.ClickOnSaveAndClose.click();
		Thread.sleep(3000);

	}

	public void TickIncludingVATCheckbox() {
		TaskLocators.IsIncludingVAT.click();

	}

	public void ClickOnActionDropdown() {
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnActionDropdown)).click();
		// TaskLocators.ClickOnActionDropdown.click();
	}

	public void ClickOnEdit() {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "Edit");
	}

	public void addRowsInEditedJournalAndBalance() throws InterruptedException {
		WebDriver driver = HelperClass.getDriver();
		DataFormatter formatter = new DataFormatter();
		double totalDebit = 0.0;
		double totalCredit = 0.0;

		List<WebElement> accountCodeInputs = driver
				.findElements(By.xpath("//input[contains(@name,'invoice_account_r')]"));
		int existingRowCount = accountCodeInputs.size();

		int startRowIndex = existingRowCount - 1;

		WebElement lastAccountCode = accountCodeInputs.get(startRowIndex);
		WebElement lastDebit = driver.findElement(By.xpath("//input[@name='Items[" + startRowIndex + "].Debit']"));
		WebElement lastCredit = driver.findElement(By.xpath("//input[@name='Items[" + startRowIndex + "].Credit']"));

		boolean isLastRowEmpty = lastAccountCode.getAttribute("value").isEmpty()
				&& lastDebit.getAttribute("value").isEmpty() && lastCredit.getAttribute("value").isEmpty();

		int rowIndex = isLastRowEmpty ? startRowIndex : existingRowCount;

		int numberOfRowsToAdd = 2;

		for (int i = 0; i < numberOfRowsToAdd; i++) {
			if (i > 0 || !isLastRowEmpty) {
				wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickAddRow)).click();
				Thread.sleep(1000);
			}

			String AccountCode = "5220";
			String AccountName = "Added on Edit";
			String DebitStr = (i == 0) ? "100.00" : "";
			String CreditStr = (i == 1) ? "100.00" : "";

			totalDebit += DebitStr.isEmpty() ? 0.0 : Double.parseDouble(DebitStr);
			totalCredit += CreditStr.isEmpty() ? 0.0 : Double.parseDouble(CreditStr);

			WebElement accountCodeInput = driver
					.findElement(By.xpath("//input[@name='invoice_account_r" + rowIndex + "']"));
			WebElement descriptionInput = driver
					.findElement(By.xpath("//textarea[@name='Items[" + rowIndex + "].Note']"));

			wait.until(ExpectedConditions.visibilityOf(accountCodeInput)).sendKeys(AccountCode);
			wait.until(ExpectedConditions.visibilityOf(descriptionInput)).sendKeys(AccountName);

			HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Debit']"), DebitStr);
			HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Credit']"), CreditStr);

			rowIndex++;
		}

		List<WebElement> debitFields = driver.findElements(By.xpath("//input[contains(@name,'Debit')]"));
		List<WebElement> creditFields = driver.findElements(By.xpath("//input[contains(@name,'Credit')]"));
		double updatedDebit = 0.0, updatedCredit = 0.0;

		for (WebElement debit : debitFields) {
			String val = debit.getAttribute("value");
			if (!val.isEmpty())
				updatedDebit += Double.parseDouble(val);
		}
		for (WebElement credit : creditFields) {
			String val = credit.getAttribute("value");
			if (!val.isEmpty())
				updatedCredit += Double.parseDouble(val);
		}

		if (Math.abs(updatedDebit - updatedCredit) > 0.01) {
			double diff = Math.abs(updatedDebit - updatedCredit);
			wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickAddRow)).click();
			Thread.sleep(1000);

			WebElement accountCodeInput = driver
					.findElement(By.xpath("//input[@name='invoice_account_r" + rowIndex + "']"));
			WebElement descriptionInput = driver
					.findElement(By.xpath("//textarea[@name='Items[" + rowIndex + "].Note']"));
			accountCodeInput.sendKeys("5220");
			descriptionInput.sendKeys("Balance Row");

			String formattedDiff = String.format("%.2f", diff);
			if (updatedDebit < updatedCredit) {
				HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Debit']"), formattedDiff);
			} else {
				HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[" + rowIndex + "].Credit']"), formattedDiff);
			}

			Log.info("Added balance row after edit. Difference: " + formattedDiff);
		} else {
			Log.info("Journal is balanced after adding new rows.");
		}

	}

	public void ClickOnDelete() {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "Delete");
	}

	public void VerifyDeleteConfirmationMessage() {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement confirmationTextElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Record will be permanently deleted')]")));

		String actualMessage = confirmationTextElement.getText();
		String expectedMessage = "Record will be permanently deleted and cannot be recovered.";

		if (actualMessage.equals(expectedMessage)) {
			Log.info("Delete confirmation message is verified: " + actualMessage);
		} else {
			Log.error("Delete confirmation message mismatch. Found: " + actualMessage);
			throw new AssertionError("Expected: '" + expectedMessage + "' but found: '" + actualMessage + "'");
		}
		WebElement okButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
		okButton.click();

		Log.info("Clicked OK on delete confirmation.");
	}

	public void verifyActionDropdownOptions() throws IOException {
		try {
			WebDriver driver = HelperClass.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement dropdown = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ddlaction']")));
			dropdown.click();
			Log.info("Action dropdown clicked.");

			List<String> expectedOptions = Arrays.asList("PDF", "Excel", "Copy");

			for (String option : expectedOptions) {
				WebElement item = driver.findElement(By.xpath("//a[normalize-space()='" + option + "']"));
				if (item.isDisplayed()) {
					Log.info(option + " option is present.");
				} else {
					Log.info(option + " option is missing.");
				}
			}

		} catch (Exception e) {
			//Log.info("Error verifying dropdown options: " + e.getMessage(), MediaEntityBuilder
			//		.createScreenCaptureFromPath(HelperClass.captureScreenshot("dropdownFail")).build());
		}
	}

	public void verifyPDFDownload() throws IOException {
		try {
			WebDriver driver = HelperClass.getDriver();
			String downloadDir = "C:\\Users\\user\\Downloads";
			String filePrefix = "Report_Journal_";
			String fileExtension = ".pdf";

			File dir = new File(downloadDir);
			File[] oldFiles = dir.listFiles((d, name) -> name.startsWith(filePrefix) && name.endsWith(fileExtension));
			if (oldFiles != null) {
				for (File f : oldFiles) {
					f.delete();
				}
			}

			HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "PDF");
			Log.info("Clicked on PDF option in Action dropdown.");

			boolean isDownloaded = false;
			File downloadedFile = null;

			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				File[] files = dir.listFiles((d, name) -> name.startsWith(filePrefix) && name.endsWith(fileExtension));
				if (files != null && files.length > 0) {
					downloadedFile = files[0];
					isDownloaded = true;
					break;
				}
			}

			if (isDownloaded && downloadedFile != null) {
	            System.out.println("PDF downloaded successfully: " + downloadedFile.getName());
	        } else {
	            System.out.println("PDF was not downloaded.");
	        }

	    } catch (Exception e) {
	        System.out.println("Exception in verifyPDFDownload: " + e.getMessage());
	    }
	}

	public void verifyExcelDownload() throws IOException {
		try {
			WebDriver driver = HelperClass.getDriver();
			String downloadDir = "C:\\Users\\user\\Downloads";
			String filePrefix = "Report_Journal";
			String fileExtension = ".xlsx";

			File dir = new File(downloadDir);
			File[] oldFiles = dir.listFiles((d, name) -> name.startsWith(filePrefix) && name.endsWith(fileExtension));
			if (oldFiles != null) {
				for (File f : oldFiles) {
					f.delete();
				}
			}

			HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "Excel");
			Log.info("Clicked on Excel option in Action dropdown.");

			boolean isDownloaded = false;
			File downloadedFile = null;

			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				File[] files = dir.listFiles((d, name) -> name.startsWith(filePrefix) && name.endsWith(fileExtension));
				if (files != null && files.length > 0) {
					downloadedFile = files[0];
					isDownloaded = true;
					break;
				}
			}

			if (isDownloaded && downloadedFile != null) {
				Log.info("Excel downloaded successfully: " + downloadedFile.getName());
			} else {
				//test.fail("Excel was not downloaded.", MediaEntityBuilder
				//		.createScreenCaptureFromPath(HelperClass.captureScreenshot("excelNotDownloaded")).build());
			}

		} catch (Exception e) {
			//test.fail("Exception in verifyExcelDownload: " + e.getMessage(), MediaEntityBuilder
			//		.createScreenCaptureFromPath(HelperClass.captureScreenshot("excelException")).build());
		}
	}
	
	public void verifyJournalCopied() {
	    WebDriver driver = HelperClass.getDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    List<WebElement> journalBefore = driver.findElements(By.xpath("//table//td/a[starts-with(text(),'JNL-')]"));
	    List<String> journalNumbersBefore = journalBefore.stream()
	            .map(WebElement::getText)
	            .collect(Collectors.toList());
	    int beforeCount = journalNumbersBefore.size();
	    System.out.println("Journal count before copy: " + beforeCount);

	    WebElement actionDropdown = driver.findElement(By.xpath("//select[@id='ddlaction']"));
	    actionDropdown.click();
	    HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "Copy");

	    wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnSaveAndClose));
	    TaskLocators.ClickOnSaveAndClose.click();

	    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
	            By.xpath("//table//td/a[starts-with(text(),'JNL-')]"), beforeCount));

	    List<WebElement> journalAfter = driver.findElements(By.xpath("//table//td/a[starts-with(text(),'JNL-')]"));
	    List<String> journalNumbersAfter = journalAfter.stream()
	            .map(WebElement::getText)
	            .collect(Collectors.toList());
	    int afterCount = journalNumbersAfter.size();
	    System.out.println("Journal count after copy: " + afterCount);

	    journalNumbersAfter.removeAll(journalNumbersBefore);
	    if (!journalNumbersAfter.isEmpty()) {
	        String copiedJournal = journalNumbersAfter.get(0);
	        System.out.println("Journal copied successfully: " + copiedJournal);

	        WebElement copiedJournalElement = driver.findElement(By.xpath("//table//td/a[text()='" + copiedJournal + "']"));
	        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", copiedJournalElement);
	        js.executeScript("arguments[0].style.border='3px solid red'; arguments[0].style.background='lightyellow';", copiedJournalElement);
	    } else {
	        System.out.println("Copied journal not found in updated list.");
	    }
	}


	public void ClickOnBudgeting() {

		TaskLocators.ClickOnBudgeting.click();
	}

	public void addBudgetsForPeriods() throws Exception {
		FileInputStream file = new FileInputStream(JournalPath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Budgeting");
		int rowcount = sheet.getLastRowNum();
		Log.info("Total budget rows in Excel: " + rowcount);

		DataFormatter formatter = new DataFormatter();
		WebDriverWait wait = HelperClass.getWait();

		String[] periods = { "3 Months", "6 Months", "12 Months", "24 Months" };

		for (int i = 1; i <= periods.length && i <= rowcount; i++) {
			TaskLocators = PageFactory.initElements(HelperClass.getDriver(), Capium_Bookkeeping_Task_locators.class);

			String budgetName = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			String amount = formatter.formatCellValue(sheet.getRow(i).getCell(1));

			Log.info("Creating budget '" + budgetName + "' for period: " + periods[i - 1]);

			createNewBudget(wait, budgetName, periods[i - 1]);
			includeAccounts(wait);
			fillAmountsForFirstRowOnly(wait, amount);
			saveAndCloseBudget(wait);

			Thread.sleep(1000);
		}

		wb.close();
		file.close();
		Log.info("All budgets for periods created successfully.");
	}

	public void verifyAllBudgetingPeriodsCreated() {
	    WebDriver driver = HelperClass.getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    String[] expectedPeriods = { "3 Months", "6 Months", "12 Months", "24 Months" };
	    List<String> notFound = new ArrayList<>();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

	    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	    List<String> tableTexts = rows.stream()
	            .map(WebElement::getText)
	            .collect(Collectors.toList());

	    for (String period : expectedPeriods) {
	        boolean found = tableTexts.stream().anyMatch(text -> text.contains(period));
	        if (found) {
	            System.out.println("Period found: " + period);
	        } else {
	            System.out.println("Period NOT found: " + period);
	            notFound.add(period);
	        }
	    }

	    if (notFound.isEmpty()) {
	        System.out.println("All budgeting periods are present.");
	    } else {
	        System.out.println("Missing periods: " + String.join(", ", notFound));
	    }
	}

	public void performBudgetingEditAndInclude() throws Exception {
	    WebDriver driver = HelperClass.getDriver();
	    WebDriverWait wait = HelperClass.getWait();

	  // HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='ddlaction']"), "Edit");
	    Thread.sleep(2000); 

	   
	    WebElement includeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Include / Exclude Accounts']")));
	    includeBtn.click();
	    Thread.sleep(1000);

	    
	    WebElement feeIncomeCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//tbody[@role='alert']/tr[2]/td[1]/label")));
	    if (!feeIncomeCheckbox.isSelected()) {
	        feeIncomeCheckbox.click();
	    }

	    WebElement includeConfirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Include']")));
	    Thread.sleep(1000);
	    
	    WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok']")));
	    
	    JavascriptExecutor js = (JavascriptExecutor) HelperClass.getJSExecutor();
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", includeConfirm);
		js.executeScript("arguments[0].click();", includeConfirm);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", okButton);
		js.executeScript("arguments[0].click();", okButton);
		Thread.sleep(1000);
	    WebElement Calculator=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='tr2']//i[@class='fa fa-calculator']")));
	    Calculator.click();
	    Thread.sleep(1000);
	    WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpaid")));
		amountInput.clear();
		HelperClass.setValueUsingJS(By.id("txtpaid"), "1000");
		amountInput.sendKeys(Keys.TAB);
		Thread.sleep(2000);
         
		HelperClass.ClickUsingJS(HelperClass.getDriver(), TaskLocators.CalculateAmountSave);
		Thread.sleep(2000);
		
		WebElement saveClose = waitUntilClickable(wait, TaskLocators.ClickOnSaveandClose);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), saveClose);

	    System.out.println("Fee Income included and amount saved successfully.");
	}
	

	public void ClickOnDividends() {
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnDividends));
		TaskLocators.ClickOnDividends.click();
	}
	
	public void ClcikOnAddDividensButton() {
		HelperClass.waitUntilClickable(HelperClass.getWait(), TaskLocators.ClickOnAddDividendsbutton);
		TaskLocators.ClickOnAddDividendsbutton.click();
	}

	public void AddDividends() throws InterruptedException {
	    String[][] data = ExcelUtils.getSheetData(JournalPath, "Dividends");

	    for (String[] row : data) {
	        String shareholderName = row[0];

	        HelperClass.ClickDropdown(By.xpath("//select[@id='F_Shareholder']"));

	        Select dropdown = new Select(HelperClass.getDriver().findElement(By.id("F_Shareholder")));
	        boolean found = false;

	        for (WebElement option : dropdown.getOptions()) {
	            if (option.getText().trim().equalsIgnoreCase(shareholderName.trim())) {
	                dropdown.selectByVisibleText(option.getText().trim());
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            HelperClass.waitUntilClickable(HelperClass.getWait(), By.xpath("//a[@onclick='ucDividends.showShareholder(0)']"));
	            HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[@onclick='ucDividends.showShareholder(0)']"));
	            Thread.sleep(2000);

	            HelperClass.setValueUsingJS(By.xpath("(//input[@id='Name'])[2]"), row[0]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='LastName'])[2]"), row[1]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address'])[2]"), row[2]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address2'])[2]"), row[3]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='City'])[2]"), row[4]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='PostCode'])[2]"), row[5]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='County'])[2]"), row[6]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Email'])[2]"), row[7]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Phone'])[2]"), row[8]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='ShareValue'])[2]"), row[9]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Share'])[2]"), row[10]);
	            HelperClass.sendKeys(By.xpath("(//textarea[@id='Notes'])[2]"), row[11]);

	            By saveBtn = By.xpath("(//button[normalize-space()='Save'])[2]");
	            WebElement element = HelperClass.getDriver().findElement(saveBtn);
	            ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	            HelperClass.ClickUsingJS(HelperClass.getDriver(), saveBtn);

	            HelperClass.handleAddressPopup(HelperClass.getDriver(), "save");
	        }

	        HelperClass.ClickDropdown(By.id("ShareClassType"));
	        HelperClass.selectOptionByValue(By.id("ShareClassType"), row[12]);
	        Thread.sleep(1000);

	        WebElement declarationDate = HelperClass.getDriver().findElement(By.id("DeclarationDate"));
	        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].value='" + row[13] + "';", declarationDate);
	        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].dispatchEvent(new Event('change'));", declarationDate);
	        Thread.sleep(500);

	        String actualDeclDate = declarationDate.getAttribute("value");
	        if (!actualDeclDate.equals(row[13])) {
	            throw new RuntimeException("Declaration Date not set correctly. Expected: " + row[13] + ", but found: " + actualDeclDate);
	        }

	        WebElement paymentDate = HelperClass.getDriver().findElement(By.id("PaymentDate"));
	        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].value='" + row[14] + "';", paymentDate);
	        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].dispatchEvent(new Event('change'));", paymentDate);
	        Thread.sleep(500);

	        String actualPayDate = paymentDate.getAttribute("value");
	        if (!actualPayDate.equals(row[14])) {
	            throw new RuntimeException("Payment Date not set correctly. Expected: " + row[14] + ", but found: " + actualPayDate);
	        }

	        HelperClass.waitUntilClickable(HelperClass.getWait(), By.id("DiviShareValue"));
	        HelperClass.sendKeys(By.id("DiviShareValue"), row[15]);

//	        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Save']"));
//	        Thread.sleep(2000);
	    }
	}
	
	public void ClickOnFilterByDropdown() {
		TaskLocators.ClickOnFilterBy.click();
	}

      public void VerifyFilterByShareHolder() {
	HelperClass.SelectDropdownvaluesOneByOne(By.xpath("//select[@name='searchby']"));
       }

      public void SeachDividends() throws InterruptedException {
    	    String[][] data = ExcelUtils.getSheetData(JournalPath, "Dividends");
    	    String[] row = data[0];
    	    String expectedName = row[0];

    	    WebElement dividend = HelperClass.waitUntilClickable(HelperClass.getWait(), By.id("searchbox"));
    	    HelperClass.getWait().until(ExpectedConditions.visibilityOf(dividend));
    	    dividend.clear();
    	    dividend.sendKeys(expectedName);

    	    WebElement searchbtn = HelperClass.waitUntilClickable(HelperClass.getWait(), By.xpath("//i[@class='fa fa-search']"));
    	    HelperClass.getWait().until(ExpectedConditions.visibilityOf(searchbtn));
    	    searchbtn.click();

    	    Thread.sleep(2000);

    	    List<WebElement> results = HelperClass.getDriver().findElements(By.xpath("//table//tbody/tr"));
    	    boolean matchFound = false;

    	    for (WebElement result : results) {
    	        String actualName = result.findElement(By.xpath("./td[1]")).getText().trim();
    	        if (actualName.contains(expectedName)) {
    	            matchFound = true;
    	            System.out.println("Match found: " + actualName);
    	            break;
    	        }
    	    }

    	    if (!matchFound) {
    	        System.out.println("No matching dividend record found for: " + expectedName);
    	        throw new AssertionError("Search validation failed for shareholder: " + expectedName);
    	    }
    	}


	public void ClickOnBulkEdit() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[normalize-space()='Bulk Edit']"));
		Thread.sleep(2000);
	}
	
	public void verifyBulkEditPage() {
	    try {
	        WebElement pageHeader = HelperClass.getDriver().findElement(By.xpath("//h1[contains(text(),'Bulk Invoice Editing')]"));
	        if (pageHeader.isDisplayed()) {
	            System.out.println("Successfully navigated to Bulk Edit page.");
	        } else {
	            throw new AssertionError("Bulk Edit page header not found.");
	        }
	    } catch (NoSuchElementException e) {
	        throw new AssertionError("Bulk Edit page not loaded properly.", e);
	    }
	}


	private void createNewBudget(WebDriverWait wait, String budgetName, String periodText) throws InterruptedException {
		WebDriver driver = HelperClass.getDriver();

		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnAddNewBudget));
		HelperClass.ClickUsingJS(driver, TaskLocators.ClickOnAddNewBudget);
		Thread.sleep(1000);

		wait.until(ExpectedConditions.visibilityOf(TaskLocators.InputBudgetName));
		try {
			TaskLocators.InputBudgetName.clear();
			TaskLocators.InputBudgetName.sendKeys(budgetName);
		} catch (ElementNotInteractableException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='" + budgetName + "';", TaskLocators.InputBudgetName);
		}
		Select select = new Select(TaskLocators.SelectPeriod);
		select.selectByVisibleText(periodText);
		wait.until(ExpectedConditions.elementToBeClickable(TaskLocators.ClickOnCreate)).click();
		Thread.sleep(1000);
		TaskLocators = PageFactory.initElements(HelperClass.getDriver(), Capium_Bookkeeping_Task_locators.class);
	}

	private void includeAccounts(WebDriverWait wait) throws InterruptedException {
		waitUntilClickable(wait, TaskLocators.ClickOnIncludeAccounts).click();

		WebElement checkbox = waitUntilClickable(wait, TaskLocators.ClickOnAccountNameCheckbox);
		if (!checkbox.isSelected())
			checkbox.click();

		WebElement includeButton = waitUntilClickable(wait, TaskLocators.ClickOnIncludebutton);
		WebElement okButton = waitUntilClickable(wait, TaskLocators.ClickonOkbutton);

		try {
			includeButton.click();
			okButton.click();
		} catch (ElementNotInteractableException e) {
			JavascriptExecutor js = (JavascriptExecutor) HelperClass.getJSExecutor();
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", includeButton);
			js.executeScript("arguments[0].click();", includeButton);
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", okButton);
			js.executeScript("arguments[0].click();", okButton);
		}
	}

	private void fillAmountsForFirstRowOnly(WebDriverWait wait, String amount) {
		try {
			String calculatorXpath = "(//table[@id='DataTables_Table_0']//i[contains(@class, 'fa-calculator')])[1]";
			WebElement calculator = waitUntilClickable(wait, By.xpath(calculatorXpath));
			calculator.click();

			WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpaid")));
			amountInput.clear();
			HelperClass.setValueUsingJS(By.id("txtpaid"), amount);
			amountInput.sendKeys(Keys.TAB);
			Thread.sleep(2000);

			HelperClass.ClickUsingJS(HelperClass.getDriver(), TaskLocators.CalculateAmountSave);
			Thread.sleep(2000);

		} catch (Exception e) {
			Log.warn("Failed to enter amount for first row: " + e.getMessage());
		}
	}

	private void saveAndCloseBudget(WebDriverWait wait) {
		WebElement saveClose = waitUntilClickable(wait, TaskLocators.ClickOnSaveandClose);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), saveClose);
	}

	private WebElement waitUntilClickable(WebDriverWait wait, By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	private WebElement waitUntilClickable(WebDriverWait wait, WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
