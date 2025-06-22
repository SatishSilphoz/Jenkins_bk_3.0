package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Capium_Bookkeeping_Purchase_Locators {

	
	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement EnterClientName_inSearchbar;
	
	@FindBy(xpath="//span[normalize-space()='Purchase']")
	@CacheLookup
	public WebElement Purchase_btn;
	
	@FindBy(xpath="//a[@href='/bookkeeping/purchases/default.aspx']")
	@CacheLookup
	public WebElement Purchase_dashboard;
	
	@FindBy(xpath="//a[@onclick='Default.SetDashboardLink(this, 0)']")
	@CacheLookup
	public WebElement Purchase_Addbtn;
	
	@FindBy(xpath="//a[@onclick='Default.SetDashboardLink(this, 1)']")
	@CacheLookup
	public WebElement ClickSupplierButton;
	
	@FindBy(xpath="//i[@class='fa fa-plus azure']")
	@CacheLookup
	public WebElement Suplier_Addbtn;

	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement enter_Suplier_name;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	public WebElement Save_Suplier;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/textarea")
	@CacheLookup
	public WebElement Description;
	
	@FindBy(xpath="//span[@class='buttonText']")
	@CacheLookup
	public WebElement FileUpload;
	
	@FindBy(xpath="//a[text()='Import']")
	@CacheLookup
	public WebElement ImportBtn;
	
	@FindBy(xpath="//a[@id='A2']")
	@CacheLookup
	public WebElement DownloadLink;
	
	@FindBy(xpath="//button[@id='btnImport']")
	@CacheLookup
	public WebElement ImportAfterUpload;
	
	@FindBy(xpath="//button[@title='Process Import']")
	@CacheLookup
	public WebElement ProcessImport;
	
	@FindBy(xpath="//input[@id='selectall']//parent::label")
	@CacheLookup
	public WebElement CheckBoxlist;
	
	@FindBy(xpath="//a[@id='saveall']")
	@CacheLookup
	public WebElement ApprovedBtn;
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	@CacheLookup
	public WebElement ConformationPopup;
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	@CacheLookup
	public WebElement SuccessPopup;
	
	@FindBy(xpath="//a[text()='Purchases']")
	@CacheLookup
	public WebElement ClickOnPurchase;
	
	@FindBy(xpath="//input[@id='txtFromDate']")
	@CacheLookup
	public WebElement EnterFormdate;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	@CacheLookup
	public WebElement SearchAfterEnterDate;
	
	@FindBy(xpath="//tbody[@role='alert']/tr[1]/td[2]/button")
	@CacheLookup
	public WebElement OpenPurchasebtn;
	
	@FindBy(xpath="//button[text()='×']")
	@CacheLookup
	public WebElement ClosePurchasepopup;
	
	@FindBy(xpath="//a[normalize-space()='Purchases']")
	@CacheLookup
	public WebElement RedirectToPurchase;
	
	@FindBy(xpath="(//a[normalize-space()='Purchases'])[1]")
	@CacheLookup
	public WebElement Purchases;
	
	@FindBy(xpath="//a[normalize-space()='Supplier']")
	@CacheLookup
	public WebElement ClickAddSupplierBtn;
	
	@FindBy(xpath="//a[@href='javascript:void(0);']")
	@CacheLookup
	public WebElement ClickAddNewSuplier;
	
	@FindBy(xpath="//a[text()='CapiScan']")
	@CacheLookup
	public WebElement ClickOnCapiscan;
	
	@FindBy(xpath="//a[text()='Recurring Purchases']")
	@CacheLookup
	public WebElement ClickOnRecuringPurchases;
	
	@FindBy(xpath="//a[@id='btnAddNew']")
	@CacheLookup
	public WebElement ClickOnAddRecuringPurchase;
	
	@FindBy(xpath="//button[@onclick='RecurringInvoice.OpenContactDialog(this)']")
	@CacheLookup
	public WebElement ClickOnAddSupplerbutton;
	
	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement InputSuplierName;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	public WebElement ClickOnSaveSuplier;
	
	@FindBy(xpath="//span[normalize-space()='Amount Including VAT']")
	@CacheLookup
	public WebElement AmountIncludingVAT;
	
	@FindBy(xpath="//button[normalize-space()='Save & Close']")
	@CacheLookup
	public WebElement ClickOnSaveCloseSuplierbtn;
	
	@FindBy(xpath="//a[normalize-space()='Payments']")
	@CacheLookup
	public WebElement ClickOnPayment;
	
	@FindBy(xpath="//a[@id='btnAddNew']")
	@CacheLookup
	public WebElement ClickOnAddNewbtn;
	
	@FindBy(xpath="//input[@id='txtVDate']")
	@CacheLookup
	public WebElement InputDate;
	
	@FindBy(xpath="//div[@class='form-inline']//div//a[contains(@class,'btn btn-azure dropdown-toggle')]//i[@class='fa fa-angle-down']")
	@CacheLookup
	public WebElement PurchaseDropdown;
	
	@FindBy(xpath="(//a[@href='invoice.aspx?id=-1&iType=0'])[2]")
	@CacheLookup
	public WebElement ClickOnNewPurchase;
	
	@FindBy(xpath="(//a[@href='invoice.aspx?id=-1&iType=1'])[1]")
	@CacheLookup
	public WebElement ClickOnNewCreditNote;
	
	@FindBy(xpath="//a[@href='invoice.aspx?id=-1&iType=2']")
	@CacheLookup
	public WebElement ClickOnCISInvoice;
	
	@FindBy(xpath="//a[@href='invoice.aspx?id=-1&iType=3']")
	@CacheLookup
	public WebElement ClickOnInventory;
	
	@FindBy(xpath="//a[@id='btnExport']")
	@CacheLookup
	public WebElement ClickOnExportButton;
	
	@FindBy(xpath="//a[@onclick=\"PurchasesList.Export('pdf');\"]")
	@CacheLookup
	public WebElement ClickExportAsPDF;
	
	@FindBy(xpath="//a[@onclick=\"PurchasesList.Export('excel');\"]")
	@CacheLookup
	public WebElement ClickExportAsExcel;
	
	@FindBy(xpath="//tbody[@role='alert']/tr[1]/td/select[@id='ddlaction']")
	@CacheLookup
	public WebElement ActionDropdown;
	
	
	@FindBy(xpath="//button[normalize-space()='Save & New']")
	@CacheLookup
	public WebElement ClickOnSaveAndNewButton;
	
	@FindBy(xpath="//input[@id='txtSearch']")
	public WebElement SearchforRecuringPurchase;
	
	@FindBy(xpath="//button[@id='btnSearch']")
	public WebElement ClickOnRecuringSearch;
	
	@FindBy(xpath="//table[@id='TblPayment']/tbody/tr/td[5]")
	public WebElement DueAmount;
	
	@FindBy(xpath="//table[@id='TblPayment']/tbody/tr/td[7]")
	public WebElement Amount;
	
	@FindBy(xpath="//div[@class='clearfix pull-right']//button[1]")
	public WebElement PaymentSaveandCloseButton;
	
	@FindBy(xpath="//button[2]")
	public WebElement PaymentSaveAndNewButton;
	
	@FindBy(xpath="//input[@id='chkMakeAdvance']//parent::label")
	public WebElement ClickAdvanceCheckbox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
