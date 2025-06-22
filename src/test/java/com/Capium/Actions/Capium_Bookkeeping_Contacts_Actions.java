package com.Capium.Actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_Bookkeeping_Contacts_locators;
import com.Capium.Utilies.ExcelUtils;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;

public class Capium_Bookkeeping_Contacts_Actions {

	Capium_Bookkeeping_Contacts_locators contactlocators = null;

	public Capium_Bookkeeping_Contacts_Actions() {
		this.contactlocators = new Capium_Bookkeeping_Contacts_locators();
		PageFactory.initElements(HelperClass.getDriver(), contactlocators);
	}

	String ContactsPath = "D:\\Core Modules\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";
	WebDriverWait wait = HelperClass.getWait();
	WebDriver driver = HelperClass.getDriver();

	public void Clickcontactpage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(contactlocators.Contacts));
		contactlocators.Contacts.click();
	}

	public void ClickOnCustomer() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Customers'])[1]")));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[normalize-space()='Customers'])[1]"));
	}

	public void ClickOnAddCustomer() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-azure addcontact input-sm']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@class='btn btn-azure addcontact input-sm']"));
	}

//	public void EnterCustomerdataandclickOnSave() throws InterruptedException {
//	    String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");
//
//	    for (String[] row : data) {
//	        if ("Customer1".equalsIgnoreCase(row[0])) {
//	            HelperClass.sendKeys(By.xpath("//input[@id='txtName']"), row[0]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txttradingname0']"), row[1]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txtAddress1']"), row[2]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txtAddress2']"), row[3]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txttown']"), row[4]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txtZip']"), row[5]);
//	            HelperClass.sendKeys(By.xpath("//input[@id='txtEmail']"), row[6]);
//	            Thread.sleep(1000);
//	            HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save']"));
//	            break;
//	        }
//	    }
//	}

	public void EnterCustomerdataandclickOnSave() throws InterruptedException {
		String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		for (String[] row : data) {
			if (row[0].toLowerCase().startsWith("customer")) {
				String baseName = row[0];
				String customerName = baseName;
				int suffix = 1;

				By nameField = By.xpath("//input[@id='txtName']");
				By addressTrigger = By.xpath("//input[@id='txttradingname0']");
				By errorLabel = By.xpath(
						"//input[@id='txtName']/following-sibling::span[contains(text(),'Name already exists')]");

				while (true) {
					WebElement nameInput = driver.findElement(nameField);
					Thread.sleep(500);
					nameInput.clear();
					Thread.sleep(500);
					nameInput.sendKeys(customerName);
					Thread.sleep(1000);

					HelperClass.waitUntilClickable(wait, addressTrigger).click();
					Thread.sleep(1000);

					List<WebElement> errorElements = driver.findElements(errorLabel);
					if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
						System.out.println("Customer name already exists: " + customerName);
						customerName = baseName + suffix;
						suffix++;
					} else {
						break;
					}
				}
				Capium_Bookkeeping_CIS_Actions.contractorName = customerName;
				HelperClass.sendKeys(nameField, customerName);
				HelperClass.sendKeys(By.xpath("//input[@id='txttradingname0']"), row[1]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtAddress1']"), row[2]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtAddress2']"), row[3]);
				HelperClass.sendKeys(By.xpath("//input[@id='txttown']"), row[4]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtZip']"), row[5]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtEmail']"), row[6]);

				Thread.sleep(1000);
				HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save']"));
				Log.info("Customer '" + customerName + "' created successfully.");
				break;
			}
		}
	}

	public boolean isDuplicateCustomerNameDisplayed() {
		try {
			WebElement error = HelperClass.getDriver().findElement(
					By.xpath("//input[@id='txtName']/following-sibling::span[contains(text(),'Name already exists')]"));
			return error.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void ValidateCustomerCreatedorNot() throws InterruptedException {
		String customerName = Capium_Bookkeeping_CIS_Actions.contractorName;
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		By searchBox = By.xpath("//input[@id='searchbox']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
		HelperClass.ClearElement(searchBox);
		HelperClass.sendKeys(searchBox, customerName);
		Thread.sleep(2000);

		By resultName = By.xpath("//table//td[contains(text(),'" + customerName + "')]");
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(resultName));
			Log.info("Customer '" + customerName + "' found in search results.");
		} catch (TimeoutException e) {
			Log.error("Customer '" + customerName + "' NOT found in search results.");
		}
	}

	public void ClickOnSupplier() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		
		try {
			By supplierLink = By.xpath("(//a[normalize-space()='Suppliers'])[1]");
			WebElement directorElement = wait.until(ExpectedConditions.presenceOfElementLocated(supplierLink));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", directorElement);
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(directorElement));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", directorElement);

			System.out.println("Clicked on Directors tab successfully.");
		} catch (Exception e) {
			System.out.println("Failed to click on Directors tab: " + e.getMessage());
		}
	}

	public void ClickOnAddSupplierButton() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-azure addcontact input-sm']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@class='btn btn-azure addcontact input-sm']"));
	}

	public void EnterSupplierDetailsClickSave() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");

		for (String[] row : data) {
			if ("SupplierOne".equalsIgnoreCase(row[0])) {
				String baseName = row[0];
				String supplierName = baseName;
				int suffix = 1;

				By nameField = By.xpath("//input[@id='txtName']");
				By addressTrigger = By.xpath("//input[@id='txttradingname0']");
				By errorLabel = By.xpath(
						"//input[@id='txtName']/following-sibling::span[contains(text(),'Name already exists')]");

				while (true) {
					WebElement nameInput = driver.findElement(nameField);
					Thread.sleep(500);
					nameInput.clear();
					Thread.sleep(500);
					nameInput.sendKeys(supplierName);
					Thread.sleep(1000);

					HelperClass.waitUntilClickable(wait, addressTrigger).click();
					Thread.sleep(1000);

					List<WebElement> errorElements = driver.findElements(errorLabel);
					if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
						System.out.println("Supplier name already exists: " + supplierName);
						supplierName = baseName + suffix;
						suffix++;
					} else {
						break;
					}
				}

				Capium_Bookkeeping_CIS_Actions.contractorName = supplierName;

				HelperClass.sendKeys(nameField, supplierName);
				HelperClass.sendKeys(By.xpath("//input[@id='txttradingname0']"), row[1]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtAddress1']"), row[2]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtAddress2']"), row[3]);
				HelperClass.sendKeys(By.xpath("//input[@id='txttown']"), row[4]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtZip']"), row[5]);
				HelperClass.sendKeys(By.xpath("//input[@id='txtEmail']"), row[6]);

				Thread.sleep(1000);
				HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save']"));
				Log.info("Supplier '" + supplierName + "' created successfully.");
				break;
			}
		}
	}

	public void ValidateSupplierCreatedorNot() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		String supplierName = Capium_Bookkeeping_CIS_Actions.contractorName;

		By searchBox = By.xpath("//input[@id='searchbox']");
		By resultRow = By.xpath("//table//td[contains(text(),'" + supplierName + "')]");

		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
		HelperClass.ClearElement(searchBox);
		HelperClass.sendKeys(searchBox, supplierName);
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(resultRow));
			Log.info("Supplier '" + supplierName + "' found in search results.");
		} catch (TimeoutException e) {
			Log.error("Supplier '" + supplierName + "' NOT found in search results.");
		}
	}

	public void ClickOnDirectors() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		try {
			By directorsTab = By.xpath("(//a[normalize-space()='Directors'])[1]");
			WebElement directorElement = wait.until(ExpectedConditions.presenceOfElementLocated(directorsTab));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", directorElement);
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(directorElement));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", directorElement);

			System.out.println("Clicked on Directors tab successfully.");
		} catch (Exception e) {
			System.out.println("Failed to click on Directors tab: " + e.getMessage());
		}
	}

	public void ClickOnAddDirectorbutton() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='btn btn-azure input-sm']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//span[@class='btn btn-azure input-sm']"));
	}

//	public void EnterDirectorDetailsClickSave() throws InterruptedException {
//		String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");
//
//		for (String[] row : data) {
//			if ("Director".equalsIgnoreCase(row[0])) {
//				Thread.sleep(1000);
//
//				HelperClass.sendKeys(By.xpath("(//input[@id='Name'])[2]"), row[0]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='LastName'])[2]"), row[1]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='Address'])[2]"), row[2]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='Address2'])[2]"), row[3]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='City'])[2]"), row[4]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='PostCode'])[2]"), row[5]);
//				HelperClass.sendKeys(By.xpath("(//input[@id='Email'])[2]"), row[6]);
//
//				WebElement dateField = driver.findElement(By.xpath("(//input[@id='DateStart'])[2]"));
//				dateField.sendKeys("10/10/2015");
//
//				WebElement saveBtn = wait.until(
//						ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']")));
//				HelperClass.scrollUntilElementVisible(driver, saveBtn);
//				wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
//				wait.until(ExpectedConditions.visibilityOf(saveBtn));
//				Thread.sleep(1000);
//				HelperClass.ClickUsingJS(driver, saveBtn);
//
//				Thread.sleep(4000);
//
//				break;
//			}
//		}
//	}
	
	public void EnterDirectorDetailsClickSave() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
	    String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	    for (String[] row : data) {
	        if ("Director".equalsIgnoreCase(row[0])) {
	            String baseName = row[0];
	            String directorName = baseName;
	            int suffix = 1;

	            By nameField = By.xpath("(//input[@id='Name'])[2]");
	            By lastNameField = By.xpath("(//input[@id='LastName'])[2]");
	            By addressTrigger = By.xpath("(//input[@id='Address'])[2]");
	            By errorLabel = By.xpath("(//input[@id='Name'])[2]/following-sibling::span[contains(text(),'already exists')]");

	            while (true) {
	                WebElement nameInput = driver.findElement(nameField);
	                Thread.sleep(500);
	                nameInput.clear();
	                Thread.sleep(500);
	                nameInput.sendKeys(directorName);
	                Thread.sleep(500);
	                driver.findElement(addressTrigger).click(); // trigger validation
	                Thread.sleep(1000);

	                List<WebElement> errorElements = driver.findElements(errorLabel);
	                if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
	                    System.out.println("Director name already exists: " + directorName);
	                    directorName = baseName + suffix;
	                    suffix++;
	                } else {
	                    break;
	                }
	            }

	            Capium_Bookkeeping_CIS_Actions.contractorName = directorName;

	            HelperClass.sendKeys(nameField, directorName);
	            HelperClass.sendKeys(lastNameField, row[1]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address'])[2]"), row[2]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address2'])[2]"), row[3]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='City'])[2]"), row[4]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='PostCode'])[2]"), row[5]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Email'])[2]"), row[6]);

	            WebElement dateField = driver.findElement(By.xpath("(//input[@id='DateStart'])[2]"));
	            dateField.sendKeys("10/10/2015");

	 
	            By saveButtonLocator = By.xpath("//button[normalize-space()='Save']");
	            wait.until(ExpectedConditions.visibilityOfElementLocated(saveButtonLocator));

	            WebElement saveBtn = driver.findElement(saveButtonLocator);
	            HelperClass.scrollUntilElementVisible(driver, saveBtn);

	            wait.until(driver1 -> saveBtn.isDisplayed() && saveBtn.isEnabled());

	            try {
	                HelperClass.ClickUsingJS(driver, saveBtn);
	                Log.info("Clicked on Save button successfully.");
	            } catch (Exception e) {
	                Log.error("Failed to click Save button using JS: " + e.getMessage());
	            }

	            Log.info("Director '" + directorName + "' created successfully.");
	            Thread.sleep(4000);
	            break;
	        }
	    }
	}



	public void ValidateDirectorCreatedorNot() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    String directorName = Capium_Bookkeeping_CIS_Actions.contractorName;

	    By searchBox = By.xpath("//input[@id='searchbox']");
	    By resultRow = By.xpath("//table//td[contains(text(),'" + directorName + "')]");

	    wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
	    HelperClass.ClearElement(searchBox);
	    HelperClass.sendKeys(searchBox, directorName);
	    Thread.sleep(2000);
	    // HelperClass.ClickUsingJS(driver, By.xpath("//i[@class='fa fa-search']"));

	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(resultRow));
	        Log.info("Director '" + directorName + "' found in search results.");
	    } catch (TimeoutException e) {
	        Log.error("Director '" + directorName + "' NOT found in search results.");
	    }
	}


	public void ClickOnShareholder() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		try {
			By directorsTab = By.xpath("(//a[normalize-space()='Shareholders'])[1]");
			WebElement directorElement = wait.until(ExpectedConditions.presenceOfElementLocated(directorsTab));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", directorElement);
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(directorElement));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", directorElement);

			System.out.println("Clicked on Directors tab successfully.");
		} catch (Exception e) {
			System.out.println("Failed to click on Directors tab: " + e.getMessage());
		}
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Shareholders'])[1]")));
		// HelperClass.ClickUsingJS(driver,
		// By.xpath("(//a[normalize-space()='Shareholders'])[1]"));
	}

	public void ClickAddShareholderButton() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='btn btn-azure input-sm']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//span[@class='btn btn-azure input-sm']"));
	}

	public void EnterShareholderDetailsClickSave() throws InterruptedException {
	    contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
	    String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");

	    for (String[] row : data) {
	        if ("ShareHolder".equalsIgnoreCase(row[0])) {
	            String shareholderName = row[0];

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	            By searchBox = By.xpath("//input[@id='searchbox']");
//
//	            wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
//	            WebElement searchInput = driver.findElement(searchBox);
//	            searchInput.clear();
//	            searchInput.sendKeys(shareholderName);
//	            Thread.sleep(2000);

	         
	            List<WebElement> resultList = driver.findElements(By.xpath("//table[@id='tbl-records-directors']//td[contains(text(),'" + shareholderName + "')]"));

	            if (!resultList.isEmpty()) {
	                Log.info("Shareholder '" + shareholderName + "' already exists. Skipping creation.");
	                break;
	            }

	            Log.info("Creating new Shareholder: " + shareholderName);

	            HelperClass.sendKeys(By.xpath("(//input[@id='Name'])[2]"), row[0]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='LastName'])[2]"), row[1]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address'])[2]"), row[2]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Address2'])[2]"), row[3]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='City'])[2]"), row[4]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='PostCode'])[2]"), row[5]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Email'])[2]"), row[6]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='ShareValue'])[2]"), row[7]);
	            HelperClass.sendKeys(By.xpath("(//input[@id='Share'])[2]"), row[8]);

	            Thread.sleep(1000);

	            WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save']")));
	            HelperClass.ClickUsingJS(driver, saveBtn);

	            Log.info("Shareholder '" + shareholderName + "' created successfully.");
	            break;
	        }
	    }
	}


	public void ValidateShareholderCreatedorNot() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		String[][] data = ExcelUtils.getSheetData(ContactsPath, "Contacts");

		for (String[] row : data) {
			if ("ShareHolder".equalsIgnoreCase(row[0])) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchbox']")));
				HelperClass.sendKeys(By.xpath("//input[@id='searchbox']"), row[0]);
				Thread.sleep(2000);
				HelperClass.ClickUsingJS(driver, By.xpath("//i[@class='fa fa-search']"));
				break;
			}
		}
	}

	public void ClickOnExport() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='btnExport']"))).click();
		Thread.sleep(1000);
	}

	public void ClickAsPDFExport() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnpdf']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='btnpdf']"))).click();
	}

	public void ClickAsExcelExport() {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnexcel']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='btnexcel']"))).click();
	}

	public void DirectorExport() throws InterruptedException {
		contactlocators = PageFactory.initElements(driver, Capium_Bookkeeping_Contacts_locators.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='A1']"))).click();
		Thread.sleep(1000);
	}

}
