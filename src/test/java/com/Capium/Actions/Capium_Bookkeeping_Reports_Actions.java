package com.Capium.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Bookkeeping_Reports_Locators;
import com.Capium.Utilies.HelperClass;


public class Capium_Bookkeeping_Reports_Actions {
	
	Capium_Bookkeeping_Reports_Locators ReportLocators=null;
	
	public Capium_Bookkeeping_Reports_Actions() {
		this.ReportLocators=new Capium_Bookkeeping_Reports_Locators();
		PageFactory.initElements(HelperClass.getDriver(), ReportLocators);
	}
	
public void ValidateReportsdashbaord() throws InterruptedException {
		
		
		//HelperClass.Searchclient("Test client", By.xpath("(//a[@class='azure'])[1]"));
		Thread.sleep(2000);
	   HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), ReportLocators.Reports);
	   ReportLocators.Reports.click();
	   ReportLocators.ReportsDashboard.click();
	
	    String actualtext=HelperClass.getText(By.xpath("//h1[text()='All Reports']"));
	
		String expected="All Reports";
	
	if (actualtext == expected) {
	
		System.out.println("Verified");
	}else
	{
		System.out.println("Not Matched");
	}
		}
		
		public void Verifyadavancereportofcustomer() throws InterruptedException, IOException
		{
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Advance Report'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Customer Advance Report Verified");
			
			
		}
		public void Verifyadavancesalesreportofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Sales Report'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Sales Report");	
		}
		public void Verifycustomerlistofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Customer List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Customer List");	
		}
		public void Verifycustomerageinglistofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Customer Ageing List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Customer Ageing List");	
		}
		
		
		public void Verifytransactionsofcustomer() throws InterruptedException, IOException {
			
 
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Transactions By Customer']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Transactions By Customer");
			
		}
		public void Verifyssalesproductlistofcustomer() throws InterruptedException, IOException
		{
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Sales Product List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Sales Product List verified");
			
		}
		
		public void Verifycustomerreceieptsofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Customer Receipts'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Customer Receipts");
	
		}
		
		public void Verifydebtorslistofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Debtors']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Debtors");
		}
		public void Verifycustomerstatementofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Customer Statement'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Customer Statement");
		}
		public void Verifysalesinvoicelistofcustomer() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Sales Invoice List']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Sales Invoice List Verified");
		
		}
		public void Verifyadavancereportofsupplier() throws InterruptedException, IOException {
		
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Sales Invoice List']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Sales Invoice List Verified");
			
		}
		public void Verifypurchasereportofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Purchases Report'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Purchases Report");	
		}
		public void Verifysupplierlistofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Supplier List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Supplier List");		
		}
		
		public void Verifysupplierageinglistofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Supplier Ageing List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Supplier Ageing List");		
		}
		public void Verifytransactionsofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Transactions By Supplier']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Transactions By Supplier");			
		}
		public void Verifypayementtosupllierofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Payment To Supplier']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Payment To Supplier");				
		}
		public void Verifycreditorslistofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Creditors']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Creditors List Verified");			
		}
		public void Verifysupplierstatementofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Supplier Statement'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Supplier Statement");			
		}
		public void Verifypurachaseinvoicelistofsupplier() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Purchases Invoice List'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Purchases Invoice List");			
		}
		public void Verifyprofitandlossoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Profit & Loss'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Profit & Loss Verified");	
		}
		public void Verifybalancesheetoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Balance Sheet'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Balance Sheet");		
		}
		
		public void Verifytrailbalanceoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Trial Balance'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Trial Balance");			
		}
		public void Verifycomparativereportsoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Comparative Report']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Comparative Report");				
		}
		
		public void Verifybudgetreportsoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Budget Report'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Budget Report");	
		}
		public void Verifydaybookoffinancials() throws InterruptedException, IOException {
			
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Day-Book'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Day-Book Verified");		
		}
		
		public void Verifycashflowoffinancials() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Cash Flow'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Cash Flow Verified");		
		}
		public void Verifyrecentofadditonal() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Recent Transactions']"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Recent Transactions Verified");	
		}
		
		public void Verifyaccountdetailsadditonal() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Account Details'])[3]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Account Details verified");	
		}
		public void Verifynominalledgeradditonal() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Nominal Ledger'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Nominal Ledger Verified");	
		}
		public void Verifycashandreportadditonal() throws InterruptedException, IOException {
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[text()='Cash and Bank Report'])[2]"));
			
		     Thread.sleep(2000);
			
			HelperClass.captureScreenshot("Cash and Bank Report Verified");	
		}

}
