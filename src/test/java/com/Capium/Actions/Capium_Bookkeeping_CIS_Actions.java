package com.Capium.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_Bookkeeping_CIS_Locators;
import com.Capium.Utilies.ExcelUtils;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;

import lombok.experimental.Helper;

public class Capium_Bookkeeping_CIS_Actions {

	Capium_Bookkeeping_CIS_Locators CISLocators = null;

	public Capium_Bookkeeping_CIS_Actions() {
		this.CISLocators = new Capium_Bookkeeping_CIS_Locators();
		PageFactory.initElements(HelperClass.getDriver(), CISLocators);
	}
	
	 public static String contractorName;

	String SubContractor = "D:\\Core Modules\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";
	WebDriverWait wait = HelperClass.getWait();
	WebDriver driver = HelperClass.getDriver();

	public void ClickCISdropdown() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		Thread.sleep(2000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), CISLocators.clickCISdropdown);
		CISLocators.clickCISdropdown.click();
		String actualtext = HelperClass.getText(By.xpath("//a[text()='Subcontractor']"));
		String expected = "Subcontractor";
		if (actualtext == expected) {
			System.out.println("Verified");
		} else

		{
			System.out.println("Not Matched");
		}
	}

	public void ClickSubcontractor() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);

		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), CISLocators.clickSubcontractor);
		CISLocators.clickSubcontractor.click();
		String actualtext = HelperClass.getText(By.xpath("//h1[text()='Subcontractors']"));

		String expected = "Subcontractors";

		if (actualtext == expected) {

			System.out.println("Verified");
		} else

		{
			System.out.println("Not Matched");
		}
	}

	public void ClickAddSubcontractor() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.elementToBeClickable(CISLocators.clickAddSubcontractor));
		CISLocators.clickAddSubcontractor.click();
	}

	public void Entersubcontractordetails() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    String[][] data = ExcelUtils.getSheetData(SubContractor, "SubContractor");
	    String[] row = data[0];

	    WebDriver driver = HelperClass.getDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	    String baseName = row[0];
	    String contractorName = baseName;
	    int suffix = 1;

	    By nameField = By.xpath("//input[@id='txtName']");
	    By addressField = By.xpath("//input[@id='txtAddress1']");
	    By errorLabel = By.xpath("//span[contains(text(),'Name already exists')]");

	    while (true) {
	        WebElement nameInput = driver.findElement(nameField);
	        Thread.sleep(500);
	        nameInput.clear();
	        Thread.sleep(500);
	        nameInput.sendKeys(contractorName);  
	        Thread.sleep(1000);
	        HelperClass.waitUntilClickable(wait, By.xpath("//input[@id='txtAddress1']")).click();
	        Thread.sleep(1000); 
	        List<WebElement> errorElements = driver.findElements(errorLabel);
	        if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
	            System.out.println("Name already exists: " + contractorName);
	            contractorName = baseName + suffix;
	            suffix++;
	        } else {
	            break;
	        }
	    }
	    Capium_Bookkeeping_CIS_Actions.contractorName = contractorName;

	    HelperClass.sendKeys(nameField, contractorName);
	    HelperClass.sendKeys(addressField, row[1]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtAddress2']"), row[2]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txttown']"), row[3]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtZip']"), row[4]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtState']"), row[5]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtEmail']"), row[6]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtPhone']"), row[7]);
	    HelperClass.sendKeys(By.xpath("//textarea[@id='txtNotes']"), row[8]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txttradingname']"), row[9]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtutr']"), row[10]);
	    HelperClass.sendKeys(By.xpath("//input[@id='niNumber']"), row[11]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtcompanyno']"), row[12]);
	    HelperClass.sendKeys(By.xpath("//input[@id='txtworksref']"), row[13]);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cboIsManually']")));
	    HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboIsManually']"), "Already Verified");

	    Thread.sleep(2000);
	    HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='OK']"));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Text1']")));
	    HelperClass.sendKeys(By.xpath("//input[@id='Text1']"), row[14]);
	    HelperClass.setValueUsingJS(By.xpath("//input[@id='Text2']"), row[15]);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='Select2']")));
	    HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='Select2']"), "Net");

	    HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save']"));
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchbox']")));
	    WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchbox']"));
	    searchBox.sendKeys(contractorName);
	    HelperClass.ClickUsingJS(driver, By.xpath("//i[@class='fa fa-search']"));
	}
	    
	public void ClickOnActionsInSubcontractor() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ddlaactioncss input-xs']")));
		HelperClass.waitUntilClickable(wait, By.xpath("//select[@class='ddlaactioncss input-xs']")).click();
		
	}

	public void SelectEdits() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.selectOptionByVisibleText(By.xpath("//select[contains(@class,'ddlaactioncss')]"), "Edit");
		
	}

	public void Clickdownload() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.selectOptionByVisibleText(By.xpath("//select[contains(@class,'ddlaactioncss')]"), "Download Certificate");
		Thread.sleep(1000);
	}

	public void AddCISPurchase() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    String[][] data = ExcelUtils.getSheetData(SubContractor, "SubContractor");
	    String contractorName = data[0][0];

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cboInvType']")));
	    HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "CIS Invoice");

	    HelperClass.waitUntilClickable(wait, By.xpath("//select[@id='cboCustomer']"));
	    HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboCustomer']"), contractorName);
	    
	    HelperClass.setValueUsingJS(CISLocators.enterDate, "01/05/2025");
	    //CISLocators.enterDate.sendKeys("01/05/2025");

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cboDueDay']")));
	    //HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboDueDay']"), "90 Days");

	    CISLocators.enterNotes.sendKeys("CISPURCHASE");
	    CISLocators.enterDescription.sendKeys("Description");
	    HelperClass.selectOptionByValue(By.xpath("//select[@id='cisdrpdown']"), "0");
	    HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[5]"), "1000");
	    HelperClass.sendKeys(By.xpath("(//input[@type='text'])[7]"), "1270");

	    HelperClass.selectOptionByValue(By.xpath("(//select[@class='form-control input-sm'])[2]"), "5");
	    CISLocators.clicksaveandclose.click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSearch']")));
	    HelperClass.sendKeys(By.xpath("//input[@id='txtSearch']"), contractorName);
	    Thread.sleep(2000);
	}
	
	public void SelectPaymentMethod() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    WebDriverWait wait = HelperClass.getWait();

	    List<WebElement> rows = driver.findElements(By.xpath("//tbody[@role='alert']/tr"));
	    int rowCount = rows.size();
	    Log.info("Total rows found: " + rowCount);

	    boolean actionTaken = false;

	    for (int i = 1; i <= rowCount; i++) {

	        By statusCellLocator = By.xpath("//tbody[@role='alert']/tr[" + i + "]/td[9]");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(statusCellLocator));

	        WebElement statusCell = driver.findElement(statusCellLocator);
	        String statusText = statusCell.getText().trim();
	        Log.info("Row " + i + " status: " + statusText);

	        if (!statusText.equalsIgnoreCase("Paid")) {
	       
	            By dropdownLocator = By.xpath("//tbody[@role='alert']/tr[" + i + "]/td/select[@id='ddlaction']");
	            wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

	            HelperClass.selectOptionByVisibleText(dropdownLocator, "Add Payment");
	            Log.info("'Add Payment' selected in row " + i);

	            actionTaken = true;
	            break; 
	        }
	    }

	    if (!actionTaken) {
	        Log.info("All rows are already paid. No action taken.");
	    }
	}



	public void fillAddPaymentForm() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    By dateField = By.xpath("//input[contains(@name,'VDate') or contains(@id,'VDate')]");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(dateField));
	    HelperClass.setValueUsingJS(dateField, "13/06/2025");

	    closeDatePickerPopup();

	    By accountDropdown = By.id("F_AccountMaster"); 
	    wait.until(ExpectedConditions.elementToBeClickable(accountDropdown));
	    Select dropdown = new Select(driver.findElement(accountDropdown));
	    dropdown.selectByVisibleText("Cash in Hand (5220)");

	    By amountField = By.name("RAmount");
	    WebElement amountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(amountField));
	    double fullAmount = Double.parseDouble(amountElement.getAttribute("value"));
	    double halfAmount = fullAmount / 2;
	    HelperClass.setValueUsingJS(amountField, String.format("%.2f", halfAmount));


	    By saveBtn = By.xpath("//button[normalize-space()='Save']");
	    wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	}

	public void closeDatePickerPopup() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.activeElement.blur();");
	    Log.info("Closed date picker popup by blurring active element.");
	}


	
//	public void EditPaymentCISAndSave() throws InterruptedException {
//	    CISLocators = PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
//
//	    By accountDropdown = By.xpath("//select[@id='F_AccountMaster']");
//	    wait.until(ExpectedConditions.refreshed(
//	        ExpectedConditions.elementToBeClickable(accountDropdown)
//	    )).click();
//	    Thread.sleep(2000);
//	    HelperClass.selectOptionByValue(accountDropdown, "244");
//
//	    By amountInput = By.xpath("//input[@name='RAmount']");
//	    wait.until(ExpectedConditions.refreshed(
//	        ExpectedConditions.visibilityOfElementLocated(amountInput)
//	    ));
//	    Thread.sleep(2000);
//	    HelperClass.setValueUsingJS(amountInput, "600");
//	    Thread.sleep(2000);
//	    By saveButton = By.xpath("//button[normalize-space()='Save']");
//	    wait.until(ExpectedConditions.refreshed(
//	        ExpectedConditions.elementToBeClickable(saveButton)
//	    ));
//	    driver.findElement(saveButton).click();
//	}
	
	public void EditPaymentCISAndSave() throws InterruptedException {
	    CISLocators = PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    By dateField = By.id("VDate");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(dateField));
	    HelperClass.setValueUsingJS(dateField, "01/05/2025");

	    closeDatePickerPopup();
	    Thread.sleep(1000);

	    By accountDropdown = By.id("F_AccountMaster");
	    wait.until(ExpectedConditions.elementToBeClickable(accountDropdown));
	    WebElement dropdownElement = driver.findElement(accountDropdown);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement);
	    dropdownElement.click();

	    wait.until(driver -> {
	        Select tempDropdown = new Select(driver.findElement(accountDropdown));
	        return tempDropdown.getOptions().size() > 1;
	    });

	    Select dropdown = new Select(dropdownElement);
	    boolean found = false;
	    for (WebElement option : dropdown.getOptions()) {
	        String text = option.getText().trim();
	        if (text.equalsIgnoreCase("CIS Control Account (5435)")) {
	            dropdown.selectByVisibleText(text);
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        throw new RuntimeException("'CIS Control Account (5435)' option not found.");
	    }

	    wait.until(driver -> {
	        Select s = new Select(driver.findElement(accountDropdown));
	        String selected = s.getFirstSelectedOption().getText().trim();
	        return selected.equalsIgnoreCase("CIS Control Account (5435)");
	    });

	    By amountInput = By.name("RAmount");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(amountInput));
	    WebElement amountElement = driver.findElement(amountInput);
	    String currentAmountStr = amountElement.getAttribute("value").trim();
	    double currentAmount = Double.parseDouble(currentAmountStr.isEmpty() ? "0" : currentAmountStr);
	    double halfAmount = currentAmount / 2;
	    HelperClass.setValueUsingJS(amountInput, String.format("%.2f", halfAmount));

	    By saveButton = By.xpath("//button[normalize-space()='Save']");
	    wait.until(ExpectedConditions.elementToBeClickable(saveButton));
	    WebElement saveBtn = driver.findElement(saveButton);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveBtn);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);

	    Thread.sleep(1500);
	}


	
	
	public void ClickOnCIS300() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.waitUntilClickable(wait, By.xpath("//a[normalize-space()='CIS300']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[normalize-space()='CIS300']"));
		
	}
	
	public void ClickOnCISMonthlyReturn() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.waitUntilClickable(wait, By.xpath("//a[@role='button']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@role='button']"));
	}
	
	public void EnterRequireddataforSubmit() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.waitUntilClickable(wait, By.xpath("//select[@id='cbomonths']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//select[@id='cbomonths']"));
		Thread.sleep(1000);
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cbomonths']"), "May");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Next']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Next']"));
		
		HelperClass.waitUntilClickable(wait, By.xpath("//button[normalize-space()='Submit to Capium']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Submit to Capium']"));
		
		HelperClass.waitUntilClickable(wait, By.xpath("//button[normalize-space()='Close']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Close']"));
		
	}
	
	public void VerifyCISMonthlyReturnCratedOrNot() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='cisreturnstbl']/tbody/tr[1]/td[3]")));
		WebElement status=driver.findElement(By.xpath("//table[@id='cisreturnstbl']/tbody/tr[1]/td[3]"));
		
		String Actual=status.getText();
		String expected="Capium Submitted";
		
		if(Actual==expected) {
			System.out.println("Status Matched" +Actual);
		}
		else {
			System.out.println("Status not matched");
		}
		
	}
	
	public void CISActionDropDown() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='input-xs ddlaction']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//select[@class='input-xs ddlaction']"));
		Thread.sleep(2000);
	}
	
	public void CISEdit() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@class='input-xs ddlaction']"), "Edit");
		
		HelperClass.waitUntilClickable(wait, By.xpath("//select[@id='cbomonths']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//select[@id='cbomonths']"));
		Thread.sleep(1000);
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cbomonths']"), "Apr");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Next']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Next']"));
		
		HelperClass.waitUntilClickable(wait, By.xpath("//button[normalize-space()='Submit to Capium']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Submit to Capium']"));
		
		HelperClass.waitUntilClickable(wait, By.xpath("//button[normalize-space()='Close']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Close']"));
		
	}
	
	public void CISDownloadDetails() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='input-xs ddlaction']")));
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@class='input-xs ddlaction']"), "Download Detail");
		Thread.sleep(1000);
	}

	public void CISSMS() throws InterruptedException {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='input-xs ddlaction']")));
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@class='input-xs ddlaction']"), "SMS");
		Thread.sleep(1000);
		
		WebElement SMS=driver.findElement(By.xpath("//div[normalize-space()='New SMS']"));
		String Actual=SMS.getText();
		System.out.println(Actual);
		String Expected="New SMS";
		
		if(Actual==Expected) {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='×']")));
			HelperClass.ClickUsingJS(driver, By.xpath("//button[text()='×']"));
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
	}
	
	public void SubContractorYTDDetails() {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cboperiod']")));
		HelperClass.SelectDropdownvaluesOneByOne(By.xpath("//select[@id='cboperiod']"));
	}
		
	public void clickContractorSettings(WebDriver driver) {
		CISLocators=PageFactory.initElements(driver, Capium_Bookkeeping_CIS_Locators.class);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    By contractorSettingsLocator = By.xpath("//a[normalize-space()='Contractor Settings']");

	    try {

	        wait.until(ExpectedConditions.visibilityOfElementLocated(contractorSettingsLocator));
	        wait.until(ExpectedConditions.elementToBeClickable(contractorSettingsLocator));

	        WebElement settingsLink = driver.findElement(contractorSettingsLocator);

	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", settingsLink);
	        Thread.sleep(500); 

	        try {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", settingsLink);
	            System.out.println("Clicked 'Contractor Settings' using JS.");
	        } catch (Exception jsEx) {
	            System.out.println("JS click failed, trying Actions click.");

	            Actions actions = new Actions(driver);
	            actions.moveToElement(settingsLink).pause(Duration.ofMillis(300)).click().perform();
	            System.out.println("Clicked 'Contractor Settings' using Actions.");
	        }

	    } catch (Exception e) {
	        System.out.println("Failed to click 'Contractor Settings': " + e.getMessage());
	        e.printStackTrace();
	    }
	}

}
