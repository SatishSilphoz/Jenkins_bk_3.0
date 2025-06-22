package com.Capium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Sales_Locators {
	
	
	@FindBy(xpath="//span[normalize-space()='Sales']")
	@CacheLookup
	public WebElement ClickonSales;
	
	@FindBy(xpath="//a[normalize-space()='Dashboard'][@id='mnuSalesLeft']")
	@CacheLookup
	public static By ClickOnSalesDashboard;
	
	@FindBy(xpath="//a[@onclick='Default.SetDashboardLink(this, 0)']")
	@CacheLookup
	public WebElement AddSalesbtn;
	
	@FindBy(xpath="//a[@onclick='Default.SetDashboardLink(this, 2)']")
	@CacheLookup
	public WebElement ClickAddCoustomeronDashboard;
	
	@FindBy(xpath="//a[@onclick='Default.SetDashboardLink(this, 1)']")
	@CacheLookup
	public WebElement ClickAddQuoteOnSalesDashboard;
	
	@FindBy(xpath="//div[@class='page-content']//div[2]//div[1]//div[1]//div[1]//a[1]//i[1]")
	@CacheLookup
	public WebElement SalesChartMinimize;
	
	@FindBy(xpath="//div[@class='row']//div[3]//div[1]//div[1]//div[1]//a[1]//i[1]")
	@CacheLookup
	public WebElement DebtorsChatMinimize;
	
	@FindBy(xpath="//div[normalize-space()='Current Debtors List']/div")
	@CacheLookup
	public WebElement CurrentDebtorsListMinimize;
	
	@FindBy(xpath="//div[normalize-space()='Recent Sales List']/div")
	@CacheLookup
	public WebElement RecentSalesListMinimize;
	
	@FindBy(xpath="//select[@id='cboInvType']")
	@CacheLookup
	public WebElement SelectInvoiceType;
	
	@FindBy(xpath="//button[@onclick='Invoice.OpenContactDialog(this)']")
	@CacheLookup
	public WebElement ClickonAddCoustmer;
	
	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement InputCoustmerName;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	public WebElement Savecoustomerbtn;
	
	@FindBy(xpath="//input[@id='chkIsVatInclude']//parent::label")
	@CacheLookup
	public WebElement CheckAmountIncludingVAT;
	
	@FindBy(xpath="//input[@name='DiscountAsRate']//parent::label")
	@CacheLookup
	public WebElement CheckDiscount;
	
	@FindBy(xpath="//input[@name='IsDomestic']//parent::label")
	@CacheLookup
	public WebElement CheckDomesticVAT;
	
	@FindBy(xpath="//input[@id='txtVDate']")
	@CacheLookup
	public WebElement InputDate;
	
	@FindBy(xpath="//input[@id='txtDueDate']")
	@CacheLookup
	public WebElement InputDueDate;
	
	@FindBy(xpath="//input[@id='txtNote']")
	@CacheLookup
	public WebElement InputNote;
	
	@FindBy(xpath="//button[text()='Item']")
	@CacheLookup
	public WebElement ClickAddItem;
	
	@FindBy(xpath="//input[@id='txtItemName']")
	@CacheLookup
	public WebElement InputItemName;
	
	@FindBy(xpath="//select[@id='F_TaxCodeMaster']")
	@CacheLookup
	public WebElement SelectVATCode;
	
	@FindBy(xpath="//input[@name='Price']")
	@CacheLookup
	public WebElement InputPrice;
	
	@FindBy(xpath="//input[@id='txtOpQuantity']")
	@CacheLookup
	public WebElement InputQut;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	public WebElement SaveItem;
	
	@FindBy(xpath="//select[@name='Items[0].F_ItemMaster']")
	@CacheLookup
	public WebElement SelectTeam;
	
	@FindBy(xpath="//div[@class='clearfix form-footer']//div[@class='clearfix pull-right']//button[2]")
	@CacheLookup
	public WebElement ClickOnSaveClose;
	
	@FindBy(xpath="//select[@name='Receipts[0].F_AccountMaster']")
	@CacheLookup
	public WebElement ClickonSelectAccountDropdown;
	
	@FindBy(xpath="//tbody[@role='alert']/tr[1]/td/select[@id='ddlaction']")
	public WebElement SelectActionDropdpwn;
	
	@FindBy(xpath="//input[@name='Items[0].Debit']")
	public WebElement InputDebit;
	
	@FindBy(xpath="//input[@name='Items[0].Credit']")
	public WebElement InputCredit;
	
	@FindBy(xpath="//div[@id='divAddRow']")
	public WebElement ClickAddRow;
	
	@FindBy(xpath="//button[normalize-space()='Save & Close']")
	@CacheLookup
	public WebElement ClickOnSaveAndClose;
	
	@FindBy(xpath="//a[contains(text(),'Quotations')]")
	@CacheLookup
	public WebElement ClickOnQuotations;
	
	@FindBy(xpath="//div[@id='DivFilter']/div/a")
	@CacheLookup
	public WebElement AddQuotation;
	
	
	
	
	
	
	

}
