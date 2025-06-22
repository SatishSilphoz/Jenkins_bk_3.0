package com.Capium.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_Bookkeeping_QuickEntry_Locators;
import com.Capium.Utilies.ExcelUtils;
import com.Capium.Utilies.HelperClass;

public class Capium_Bookkeeping_QuickEntery_Actions {

	Capium_Bookkeeping_QuickEntry_Locators QuickEnteryLocators = null;

	public Capium_Bookkeeping_QuickEntery_Actions() {
		this.QuickEnteryLocators = new Capium_Bookkeeping_QuickEntry_Locators();
		PageFactory.initElements(HelperClass.getDriver(), QuickEnteryLocators);
	}

	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();

	String ContactsPath = "D:\\Core Modules\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";

	public void ClickQuickentry() throws InterruptedException {
		QuickEnteryLocators.clickQuickEntry.click();

		String actualtext = HelperClass.getText(By.xpath("//h1[text()='Quick Entries']"));
		String expected = "Quick Entries";

		if (actualtext == expected) {
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}

	public void ClickAddQuickentry() throws InterruptedException {
		Thread.sleep(2000);
		QuickEnteryLocators.clickAddQE.click();

		String actualtext = HelperClass.getText(By.xpath("//div[text()='Add Quick Entry']"));
		String expected = "Add Quick Entry";

		if (actualtext == expected) {
			System.out.println("Verified");
		} else

		{
			System.out.println("Not Matched");
		}
	}

	public void createReceiptEntry() throws InterruptedException {
		QuickEnteryLocators = PageFactory.initElements(driver, Capium_Bookkeeping_QuickEntry_Locators.class);

		String[][] data = ExcelUtils.getSheetData(ContactsPath, "QuickEntry");

		for (String[] row : data) {
			if ("Receipt".equalsIgnoreCase(row[0])) {
				Select typeDropdown = new Select(driver.findElement(By.xpath("//select[@name='Items[0].Type']")));
				typeDropdown.selectByVisibleText("Receipt");

				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].ContactName']"), row[1]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].Reference']"), row[2]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].AccountName']"), row[3]);
				HelperClass.sendKeys(By.xpath("//textarea[@name='Items[0].Note']"), row[4]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].VDateStr']"), row[5]);
				HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[0].NetAmount']"), row[6]);
				HelperClass.selectOptionByValue(By.xpath("//select[@id='qetaxrate']"), row[7]);
				HelperClass.setValueUsingJS(By.xpath("//input[@id='qepaydate_0']"), row[8]);
				HelperClass.selectOptionByVisibleText(By.xpath("//select[@name='Items[0].F_AccountMaster_Pay']"),
						row[9]);

				Thread.sleep(1000);
				HelperClass.ClickUsingJS(driver, By.xpath("//button[contains(text(),'Save & Close')]"));
				Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSearch']")));
				HelperClass.sendKeys(By.xpath("//input[@id='txtSearch']"), row[5]);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-search']")));
				Thread.sleep(1000);
				break;
			}
		}
	}

	public void createPaymentEntry() throws InterruptedException {
		QuickEnteryLocators = PageFactory.initElements(driver, Capium_Bookkeeping_QuickEntry_Locators.class);

		String[][] data = ExcelUtils.getSheetData(ContactsPath, "QuickEntry");
Thread.sleep(2000);
		for (String[] row : data) {
			if ("Payment".equalsIgnoreCase(row[0])) {
				Select typeDropdown = new Select(driver.findElement(By.xpath("//select[@name='Items[0].Type']")));
				typeDropdown.selectByVisibleText("Payment");

				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].ContactName']"), row[1]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].Reference']"), row[2]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].AccountName']"), row[3]);
				HelperClass.sendKeys(By.xpath("//textarea[@name='Items[0].Note']"), row[4]);
				HelperClass.sendKeys(By.xpath("//input[@name='Items[0].VDateStr']"), row[5]);
				HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[0].NetAmount']"), row[6]);
				HelperClass.selectOptionByValue(By.xpath("//select[@id='qetaxrate']"), row[7]);
				HelperClass.setValueUsingJS(By.xpath("//input[@id='qepaydate_0']"), row[8]);
				HelperClass.selectOptionByVisibleText(By.xpath("//select[@name='Items[0].F_AccountMaster_Pay']"),
						row[9]);

				Thread.sleep(1000);
				HelperClass.ClickUsingJS(driver, By.xpath("//button[contains(text(),'Save & Close')]"));
				Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSearch']")));
				HelperClass.sendKeys(By.xpath("//input[@id='txtSearch']"), row[5]);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-search']")));
				Thread.sleep(1000);
				break;
			}
		}
	}

	public void editAndAddQuickEntryRow() throws InterruptedException {
	    QuickEnteryLocators = PageFactory.initElements(driver, Capium_Bookkeeping_QuickEntry_Locators.class);
	    String[][] data = ExcelUtils.getSheetData(ContactsPath, "QuickEntry");

	    for (String[] row : data) {
	        String entryType = row[0].trim();
	        if ("Receipt".equalsIgnoreCase(entryType) || "Payment".equalsIgnoreCase(entryType)) {

	           Thread.sleep(2000);
	            List<WebElement> rowsBefore = driver.findElements(By.xpath("//tr[starts-with(@id, 'qe_row_')]"));
	            int rowIndex = rowsBefore.size(); 
	            Thread.sleep(2000);
	            HelperClass.ClickUsingJS(driver, By.xpath("//a[contains(text(), 'Add a row')]"));

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            String expectedRowId = "qe_row_" + rowIndex;
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(expectedRowId)));

	            String prefix = "//tr[@id='qe_row_" + rowIndex + "']";

	            Select typeDropdown = new Select(driver.findElement(By.xpath(prefix + "//select[contains(@name, '.Type')]")));
	            typeDropdown.selectByVisibleText(entryType);

	            HelperClass.sendKeys(By.xpath(prefix + "//input[contains(@name, '.ContactName')]"), row[1]);
	            HelperClass.sendKeys(By.xpath(prefix + "//input[contains(@name, '.Reference')]"), row[2]);
	            HelperClass.sendKeys(By.xpath(prefix + "//input[contains(@name, '.AccountName')]"), row[3]);
	            HelperClass.sendKeys(By.xpath(prefix + "//textarea[contains(@name, '.Note')]"), row[4]);
	            HelperClass.setValueUsingJS(By.xpath(prefix + "//input[contains(@name, '.VDateStr')]"), row[5]);
	            HelperClass.setValueUsingJS(By.xpath(prefix + "//input[contains(@name, '.NetAmount')]"), row[6]);

	            try {
	                HelperClass.selectOptionByValue(By.xpath(prefix + "//select[contains(@name, '.F_TaxCodeMaster')]"), row[7]);
	            } catch (Exception e) {
	                HelperClass.selectOptionByValue(By.xpath(prefix + "//select[contains(@name,'TaxRate')]"), row[7]);
	            }

	            HelperClass.setValueUsingJS(By.xpath("//input[@id='qepaydate_" + rowIndex + "']"), row[8]);

	            HelperClass.selectOptionByVisibleText(
	                By.xpath("//select[@name='Items[" + rowIndex + "].F_AccountMaster_Pay']"), row[9]);

	            Thread.sleep(1000);
	            HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save & Close']"));
	            Thread.sleep(2000);
	            break;
	        }
	    }
	}




	public void ClickOnEdit() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@id='ddlaction'])[1]")));
		HelperClass.selectOptionByVisibleText(By.xpath("(//select[@id='ddlaction'])[1]"), "Edit");
	}

	public void ClickOnDelete() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@id='ddlaction'])[1]")));
		HelperClass.selectOptionByVisibleText(By.xpath("(//select[@id='ddlaction'])[1]"), "Delete");
	}

	public void ClickOnPDFDownload() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@id='ddlaction'])[1]")));
		HelperClass.selectOptionByVisibleText(By.xpath("(//select[@id='ddlaction'])[1]"), "PDF");
	}

	public void DeleteRow() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick='quickEntry.deleteRow(0)']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@onclick='quickEntry.deleteRow(0)']"));
	}

	public void ClickOnsaveAndNew() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save & New')]")));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[contains(text(),'Save & New')]"));
		Thread.sleep(2000);
	}

	public void VerifyConfirmationMsg() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(text(),'Are you sure you want to delete the row?')]")));

		WebElement ConfirmationMsg = driver
				.findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete the row?')]"));
		String Actual = ConfirmationMsg.getText();
		String Expected = "Are you sure you want to delete the row?";
		if (Actual == Expected) {
			HelperClass.ClickUsingJS(driver, By.xpath("//button[text()='Ok']"));
			Thread.sleep(2000);
		} else {
			System.out.println("Confirmation message not matched");
		}
	}

}