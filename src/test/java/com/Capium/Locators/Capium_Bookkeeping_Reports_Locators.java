package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Reports_Locators {
	
	@FindBy(xpath="(//a[@class='menu-dropdown'])[11]")
		@CacheLookup
		public WebElement Reports;
		
		@FindBy(xpath="//a[@id='mnuReportsLeft']")
		@CacheLookup
		public WebElement ReportsDashboard;
		
		@FindBy(xpath="(//a[@class='menu-dropdown l2'])[2]")
		@CacheLookup
		public WebElement customer;
		
		@FindBy(xpath="(//a[text()='Advance Report'])[1]")
		@CacheLookup
		public WebElement Advancereport;
		
		@FindBy(xpath="(//a[text()='Sales Report'])[1]")
		@CacheLookup
		public WebElement salesreport;
		
		@FindBy(xpath="(//a[text()='Customer List'])[1]")
		@CacheLookup
		public WebElement customerlist;
		
		@FindBy(xpath="(//a[text()='Customer Ageing List'])[1]")
		@CacheLookup
		public WebElement customerageeninglist;
		
		@FindBy(xpath="(//a[text()='Transactions'])[1]")
		@CacheLookup
		public WebElement transactions;
		
		@FindBy(xpath="(//a[text()='Sales Product List'])[1]")
		@CacheLookup
		public WebElement salesproductlist;
		
		@FindBy(xpath="(//a[text()='Customer Receipts'])[1]")
		@CacheLookup
		public WebElement customerreceipts;
		
		@FindBy(xpath="(//a[text()='Debtors List'])[1]")
		@CacheLookup
		public WebElement debtorslist;
		
		@FindBy(xpath="(//a[text()='Customer Statement'])[1]")
		@CacheLookup
		public WebElement customerstatement;
		
		@FindBy(xpath="(//a[text()='Sales Invoice list'])[1]")
		@CacheLookup
		public WebElement salesinvoicelist;
		
		@FindBy(xpath="(//a[@class='menu-dropdown l2'])[3]")
		@CacheLookup
		public WebElement supplier;
		
		@FindBy(xpath="(//a[text()='Advance Report'])[1]")
		@CacheLookup
		public WebElement supplieradvancereport;
		
		@FindBy(xpath="(//a[text()='Purchases Report'])[1]")
		@CacheLookup
		public WebElement supplierpurchsereport;
		
		@FindBy(xpath="(//a[text()='Purchases Report'])[1]")
		@CacheLookup
		public WebElement supplierlist;
		
		@FindBy(xpath="(//a[text()='Supplier Ageing List'])[1]")
		@CacheLookup
		public WebElement supplierageinglist;
		
		@FindBy(xpath="(//a[text()='Transactions'])[1]")
		@CacheLookup
		public WebElement suppliertransactions;
		
		@FindBy(xpath="(//a[text()='Transactions'])[1]")
		@CacheLookup
		public WebElement paymentstosupplier;
		
		@FindBy(xpath="//a[text()='Creditors List']")
		@CacheLookup
		public WebElement suppliercreditorslist;
		
		@FindBy(xpath="//a[text()='Creditors List']")
		@CacheLookup
		public WebElement supliercreditorslist;
		
		@FindBy(xpath="//a[text()='Supplier Statement']")
		@CacheLookup
		public WebElement suplierstatements;
		
		@FindBy(xpath="//a[text()='Purchases Invoice List']")
		@CacheLookup
		public WebElement purchaseinvoicelist;
		
		@FindBy(xpath="(//a[@class='menu-dropdown l2'])[4]")
		@CacheLookup
		public WebElement financials;
		
		@FindBy(xpath="(//a[text()='Profit & Loss'])[1]")
		@CacheLookup
		public WebElement profitloss;
		
		@FindBy(xpath="(//a[text()='Balance Sheet'])[1]")
		@CacheLookup
		public WebElement balancesheet;
		
		@FindBy(xpath="(//a[text()='Trial Balance'])[1]")
		@CacheLookup
		public WebElement trailbalance;
		
		@FindBy(xpath="(//a[text()='Comparative Reports'])[1]")
		@CacheLookup
		public WebElement comparativereports;
		
		@FindBy(xpath="(//a[text()='Budget Report'])[1]")
		@CacheLookup
		public WebElement budgetreport;
		
		@FindBy(xpath="(//a[text()='Day-Book'])[1]")
		@CacheLookup
		public WebElement daybook;
		
		@FindBy(xpath="(//a[text()='Cash Flow'])[1]")
		@CacheLookup
		public WebElement cashflow;
		
		@FindBy(xpath="(//span[@class='menu-text'])[21]")
		@CacheLookup
		public WebElement additional;
		
		@FindBy(xpath="//a[text()='Recent Transaction']")
		@CacheLookup
		public WebElement recenttransactions;
		
		@FindBy(xpath="(//a[text()='Account Details'])[1]")
		@CacheLookup
		public WebElement accountdetail;
		
		@FindBy(xpath="(//a[text()='Nominal Ledger'])[1]")
		@CacheLookup
		public WebElement nominalledger;
		
		
		@FindBy(xpath="(//a[text()='Cash and Bank Report'])[1]")
		@CacheLookup
		public WebElement cashandbankimport;
		
		@FindBy(xpath="//div[text()='Receipt Details']")
		@CacheLookup
		public WebElement displaycustomeradvancereport;
		
		@FindBy(xpath="(//button[@type='button'])[1]")
		@CacheLookup
		public WebElement clickrecordcustomeradvancereport;
		
		@FindBy(xpath="(//button[text()='×'])[1]")
		@CacheLookup
		public WebElement cancelreceipt;
		
		@FindBy(xpath="//a[text()='Apr-2025']")
		@CacheLookup
		public WebElement clicksalesreport;
		
		@FindBy(xpath="//div[@class='modal-title']")
		@CacheLookup
		public WebElement displayedsalesreport;
		
		@FindBy(xpath="(//button[text()='×'])[2]")
		@CacheLookup
		public WebElement cancelsalesreport;
		
		@FindBy(xpath="(//button[text()='×'])[2]")
		@CacheLookup
		public WebElement cancelcustomeradavancereport;
		
		@FindBy(xpath="//td[@class='ClickClass sorting_1']")
		@CacheLookup
		public WebElement displaycustomerlist;
		
		@FindBy(xpath="//a[@title='View contact detail']")
		@CacheLookup
		public WebElement displaycustomerageinglist;
		
		@FindBy(xpath="(//a[@class='azure'])[1]")
		@CacheLookup
		public WebElement transactionsdisplay;
		
		@FindBy(xpath="//td[@class='text-left']")
		@CacheLookup
		public WebElement salesproductlistdisplay;
		
		@FindBy(xpath="//a[text()='Apr-2025']")
		@CacheLookup
		public WebElement recordclicksalesreport;
		
		@FindBy(xpath="//td[@class='text-center']")
		@CacheLookup
		public WebElement customerreceiptlistdisplay;
		
		@FindBy(xpath="//i[@class='fa fa-plus-square']")
		@CacheLookup
		public WebElement debtorslistopenlistdisplay;
		
		@FindBy(xpath="(//a[@class='azure'])[1]")
		@CacheLookup
		public WebElement customerstatementsreport1display;
		
		@FindBy(xpath="(//a[@class='azure'])[2]")
		@CacheLookup
		public WebElement customerstatementsreport2display;
		
		@FindBy(xpath="//a[@class='azure']")
		@CacheLookup
		public WebElement detailedsalesinvoicelistdisplay;
		
		@FindBy(xpath="//button[@class='btn btn-link']")
		@CacheLookup
		public WebElement supplieradvancereportdisplay;
		
		@FindBy(xpath="//a[@class='azure']")
		@CacheLookup
		public WebElement purchasereport;
		
		@FindBy(xpath="//td[@class='ClickClass sorting_1']")
		@CacheLookup
		public WebElement supplierlistinsupplier;
		
		@FindBy(xpath="//a[@title='View contact detail']")
		@CacheLookup
		public WebElement supplierageninglist;
		
		@FindBy(xpath="//a[text()='Cash and Bank Report']")
		@CacheLookup
		public WebElement cashandbankreport;

}
