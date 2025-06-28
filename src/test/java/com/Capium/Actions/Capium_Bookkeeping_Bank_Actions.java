package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Bookkeeping_Bank_Locators;
import com.Capium.Utilies.HelperClass;

public class Capium_Bookkeeping_Bank_Actions {

	Capium_Bookkeeping_Bank_Locators bankLocators = null;

	public Capium_Bookkeeping_Bank_Actions() {
		this.bankLocators = new Capium_Bookkeeping_Bank_Locators();
		PageFactory.initElements(HelperClass.getDriver(), bankLocators);
	}

public void Verifybankdashboard() throws InterruptedException {
		
		Thread.sleep(5000);
		HelperClass.Searchclient("Test Client", By.xpath("(//a[@class='azure'])[1]"));
		bankLocators.Bank.click();
		bankLocators.Dashboard.click();
		
		
		String actualtext=HelperClass.getText(By.xpath("//h1[text()='Bank Dashboard']"));
		String expected="Add Contact Detail";
	if (actualtext == expected) {
		
		System.out.println("Bank Dashboard");
	}else
	{
		System.out.println("Bank Dashboard");
	}
		
	}
	
	public void Clickonbankandverifybankpage() {
		
        bankLocators.AddBank.click();
		String actualtext=HelperClass.getText(By.xpath("//div[text()='Add Bank Account']"));
		String expected="Add Bank Account";
	if (actualtext == expected) {
		
		System.out.println("Verified");
	}else
	{
		System.out.println("Not matched");
	}
	}
	public void Entervalidecredtentialsandsavebank() {
		
		bankLocators.BankName.sendKeys("HDFC");
		bankLocators.SortBranchCode.sendKeys("040003");
		bankLocators.AccountNO.sendKeys("19258181");
		bankLocators.SaveBank.click();
		
	}
	public void Clickandverifythebankwhichwecreated() {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='HDFC']"));
		
		String actualtext=HelperClass.getText(By.xpath("//h1[text()='Bank Details']"));
		String expected="Bank Details";
	if (actualtext == expected) {
		
		System.out.println("Verified");
	}else
	{
		System.out.println("Not matched");
	}		
	}
	public void Clickonmanualimportandentermandatorydetailsandsaveandclose() {
		
		
		bankLocators.Manualimport.click();
		bankLocators.Typebox1.sendKeys("type1");
		bankLocators.Description1.sendKeys("des1");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[3]"), "1000");
		bankLocators.Typebox2.sendKeys("type2");
		bankLocators.Description2.sendKeys("des2");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[8]"), "1000");
		bankLocators.SavecloseManualimport.click();
	}
	
	public void Clickonmanualimportandentermandatorydetailsandsaveandnew() {
		
		bankLocators.Manualimport.click();
		bankLocators.Typebox1.sendKeys("type3");
		bankLocators.Description1.sendKeys("des3");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[3]"), "1000");
		bankLocators.Typebox2.sendKeys("type4");
		bankLocators.Description2.sendKeys("des4");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[8]"), "1000");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-save'])[2]"));
	
	}
	public void Clickonmanualimportandentermandatorydetailsandaddrow() {
		
		bankLocators.Manualimport.click();
		bankLocators.Typebox1.sendKeys("type5");
		bankLocators.Description1.sendKeys("des5");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[3]"), "1000");
		bankLocators.Typebox2.sendKeys("type6");
		bankLocators.Description2.sendKeys("des6");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[8]"), "1000");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-plus'])[2]"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-arrow-left']"));
	}
	public void Clickonbankimportandimportbanksusingexcelfile() throws InterruptedException, AWTException, IOException {
		
		bankLocators.Bankimport.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Choose file']"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		StringSelection stringSelection = new StringSelection("C:\\Users\\user\\OneDrive - Default Directory\\Bank_Import_Template.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@class='btn btn-azure']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Continue']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='No']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Ok']"));
		
		HelperClass.captureScreenshot("Imported records");
		
}
	public void Clickonquickentryandennterallmandatorydetailsandsave() throws InterruptedException {
		
		bankLocators.Quickentry.click();
		HelperClass.sendKeys(By.xpath("//input[@name='Items[0].Reference']"), "reference1");
		HelperClass.sendKeys(By.xpath("//input[@name='Items[0].AccountName']"), "1000");
		HelperClass.sendKeys(By.xpath("//textarea[@name='Items[0].Note']"), "des1");
		HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[0].VDateStr']"), "24/05/2025");
		HelperClass.selectOptionByValue(By.xpath("(//select[@id='qetaxrate'])[1]"), "5");
		
		HelperClass.sendKeys(By.xpath("//input[@name='Items[1].Reference']"), "reference1");
		HelperClass.sendKeys(By.xpath("//input[@name='Items[1].AccountName']"), "1000");
		HelperClass.sendKeys(By.xpath("//textarea[@name='Items[1].Note']"), "des1");
		HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[1].VDateStr']"), "24/05/2025");
		HelperClass.selectOptionByValue(By.xpath("(//select[@id='qetaxrate'])[2]"), "5");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		
	}
	public void Clickonjournalsandennterallmandatorydetailsandsave() throws InterruptedException {
		
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Quick Journal'])[1]"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Quick Journal']"));
		
		HelperClass.setValueUsingJS(By.xpath("//input[@id='txtAmount_Quick']"), "1000");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[4]"));
		
		
	}
	public void Clickonactiondropdownandennterallmandatorydetailsindirectpaymentandsave() throws InterruptedException
	{
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "post");
		HelperClass.sendKeys(By.xpath("//input[@name='invoice_account_r0']"), "1000");
		
		HelperClass.sendKeys(By.xpath("//textarea[@name='invoice_desc_r0']"), "des3");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[5]"));	
		
	}
	public void Clickonactiondropdownandennterallmandatorydetailsinsupplieraccountandsave() {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "assign");
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboCustomer']"), "John Smit");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Make Advance Payment']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
			
	}
	public void Clickonactiondropdownandennterallmandatorydetailsintransferandsave() {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "transfer");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[4]"));
		
	
	}
	public void Clickonactiondropdownandennterallmandatorydetailsinmultipletransactionsandsave() throws InterruptedException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "multitrans");
		
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='form-control input-sm'])[3]"), "5");
		
		HelperClass.sendKeys(By.xpath("//input[@id='ml_contact']"), "Hardik");
		
		HelperClass.setValueUsingJS(By.xpath("//input[@name='amount']"), "1000");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-save'])[2]"));
		
		
		
		
	}
	public void Clickonactiondropdownandennterallmandatorydetailsinnewpurchaseandsave() throws InterruptedException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "invoice");
		
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboCustomer']"), "John Smit");
		
		Thread.sleep(2000);
		
		HelperClass.sendKeys(By.xpath("//textarea[@name='Items[0].Note']"), "des4");
		
		HelperClass.setValueUsingJS(By.xpath("//input[@name='Items[0].Price']"), "1000");
		
		HelperClass.sendKeys(By.xpath("(//input[@type='text'])[10]"), "1210");
		
		HelperClass.selectOptionByValue(By.xpath("//select[@name='Items[0].F_TaxCodeMaster']"), "5");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
	}
	public void Clickonactiondropdownandennterallmandatorydetailsincustomeraccountandsave() {
		
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
		HelperClass.selectOptionByValue(By.xpath("//select[@class='ddlaactioncss input-xs'])[2]"), "assign");
		
		HelperClass.selectOptionByVisibleText(By.xpath("sriram"), "sriram");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Make Advance Receipt']"));
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		
	}
	public void Clickonactiondropdownandennterallmandatorydetailsindirectrecipetandsave() throws InterruptedException {
		
		
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
			
			HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[2]"), "post");
			
		HelperClass.sendKeys(By.xpath("//input[@name='invoice_account_r0']"), "1000");
 
		HelperClass.sendKeys(By.xpath("//textarea[@name='invoice_desc_r0']"), "des4");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[5]"));	
	}
	public void Validaterefundfunctionalityinactiondropdown() {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "refund");
		
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cbocontanctrrefund']"), "Sriram");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[5]"));
	}
	
	public void Validateexportspdforexcel() {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
		
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='btnExport']"));
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-file-excel-o']"));
		
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='btnExport']"));
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-file-pdf-o']"));
		
		
	}
	
	public void Validatedeletefromaactiondropdown() {
		
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='azure'])[1]"));
			
			HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[2]"), "delete");
			
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[3]"));
		
	}
	public void Clickonbanktransferandverifypage() {
		
		bankLocators.BankTransfer.click();
		
		String actualtext=HelperClass.getText(By.xpath("//h1[text()='Bank Dashboard']"));
		String expected="Add Contact Detail";
	if (actualtext == expected) {
		
		System.out.println("Bank Dashboard");
	}else
	{
		System.out.println("Bank Dashboard");
	}
	}
public void Clickonbanktransferentermandatorydetails() throws InterruptedException {
	
	bankLocators.BankTransfer.click();
	
	bankLocators.ADDBankTransfer.click();
	
	Thread.sleep(2000);	
	
	String actualtext=HelperClass.getText(By.xpath("//div[text()='Add Bank Transfer']"));
	String expected="Add Bank Transfer";
if (actualtext == expected) {
	
	System.out.println("Add Bank Transfer Verified");
}else
{
	System.out.println("Not Matched");
}
}
	public void clickonbanktransferandentermandatoryfieldsandsave() throws InterruptedException {
		
		bankLocators.BankTransfer.click();
		
		bankLocators.ADDBankTransfer.click();
		
		Thread.sleep(2000);	
		
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='F_AccountMaster']"), "HDFC");
		
		bankLocators.AmountADDBankTransfer.sendKeys("1000");
		
		bankLocators.SaveADDBankTransfer.click();
			
	}
}