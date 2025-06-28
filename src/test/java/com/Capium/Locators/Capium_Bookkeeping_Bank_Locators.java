package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Bank_Locators {

	
	@FindBy(xpath="//span[text()='Bank ']")
	@CacheLookup
	public WebElement Bank ;
	
	@FindBy(xpath="//a[@id='mnuBankLeft']")
	@CacheLookup
	public WebElement Dashboard ;
	
	@FindBy(xpath="//h1[text()='Bank Dashboard']")
	@CacheLookup
	public WebElement BankDashboard ;
	
	@FindBy(xpath="//button[@id='btnAddNew']")
	@CacheLookup
	public WebElement AddBank ;
	
	@FindBy(xpath="//input[@id='txtBankName']")
	@CacheLookup
	public WebElement BankName ;
	
	@FindBy(xpath="//input[@id='txtSortBranchCode']")
	@CacheLookup
	public WebElement SortBranchCode;
	
	@FindBy(xpath="//input[@id='txtBankAccountNo']")
	@CacheLookup
	public WebElement AccountNO;
	
	@FindBy(xpath="//button[text()=' Save']")
	@CacheLookup
	public WebElement SaveBank;
	
	@FindBy(xpath="(//td[@class='text-left']/a)[1]")
	@CacheLookup
	public WebElement CreatedBank;
	
	@FindBy(xpath="//button[text()='No']")
	@CacheLookup
	public WebElement ImportNO;
	
	@FindBy(xpath="//a[text()='Continue']")
	@CacheLookup
	public WebElement Continue;
	
	@FindBy(xpath="//i[@class='fa fa-arrow-left']")
	@CacheLookup
	public WebElement Backbutton1;
	
	@FindBy(xpath="//i[@class='fa fa-arrow-left']")
	@CacheLookup
	public WebElement Backbutton2;
	
	@FindBy(xpath="(//a[@type='button'])[2]")
	@CacheLookup
	public WebElement Manualimport;
	
	@FindBy(xpath="//a[@id='A1']")
	@CacheLookup
	public WebElement Downloadtemplate;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	@CacheLookup
	public WebElement Typebox1;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement Typebox2;
	
	@FindBy(xpath="(//td[@class='col-action']/textarea)[1]")
	@CacheLookup
	public WebElement Description1;
	
	@FindBy(xpath="(//td[@class='col-action']/textarea)[2]")
	@CacheLookup
	public WebElement Description2;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	@CacheLookup
	public WebElement Paidout;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement Paidin;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement SavecloseManualimport;
	
	@FindBy(xpath="(//a[@type='button'])[1]")
	@CacheLookup
	public WebElement Bankimport;
	
	@FindBy(xpath="//span[text()='Choose file']")
	@CacheLookup
	public WebElement UploadBankimport;
	
	@FindBy(xpath="//a[@class='btn btn-azure']/i")
	@CacheLookup
	public WebElement Clickimport;
	
	@FindBy(xpath="//button[text()='Ok']")
	@CacheLookup
	public WebElement alertok;
	
	@FindBy(xpath="")
	@CacheLookup
	public WebElement DownloadBankimport;
	
	@FindBy(xpath="//a[text()='Quick Entry']")
	@CacheLookup
	public WebElement Quickentry;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement CustomerSupplier;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement QuickentryAccount1;
	
	@FindBy(xpath="(//textarea[@class='input-sm form-control'])[1]")
	@CacheLookup
	public WebElement QuickentryDes1;
	
	@FindBy(xpath="(//input[@type='text'])[16]")
	@CacheLookup
	public WebElement QuickentryAccount2;
	
	@FindBy(xpath="(//textarea[@class='input-sm form-control'])[2]")
	@CacheLookup
	public WebElement QuickentryDes2;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	@CacheLookup
	public WebElement InvoiceDate1;
	
	@FindBy(xpath="(//input[@type='text'])[17]")
	@CacheLookup
	public WebElement InvoiceDate2;
	
	@FindBy(xpath="(//div[@class='clearfix'])[5]")
	@CacheLookup
	public WebElement outsideclick;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement QuickentrySave;
	
	@FindBy(xpath="(//a[text()='Quick Journal'])[1]")
	@CacheLookup
	public WebElement QuickJournal;
	
	@FindBy(xpath="//input[@id='txtAmount_Quick']")
	@CacheLookup
	public WebElement QuickJournalAmountText;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	@CacheLookup
	public WebElement SaveQuickJournal;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	@CacheLookup
	public WebElement JournalAccountText;
	
	@FindBy(xpath="(//td[@class='col-action'])[2]")
	@CacheLookup
	public WebElement JournalDescriptionText;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement JournalSave;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	@CacheLookup
	public WebElement Addsupplierinsupplieraccount;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	@CacheLookup
	public WebElement Savesupplierinsupllieraccount;
	
	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement Suppliername;
	
	@FindBy(xpath="//span[text()='Make Advance Payment']")
	@CacheLookup
	public WebElement MakeadvancePayment;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveSupplierAccount;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveTransfer;
	
	@FindBy(xpath="(//button[@class='btn btn-azure'])[2]")
	@CacheLookup
	public WebElement SaveMultipleTransaction;
	
	@FindBy(xpath="//input[@name='amount']")
	@CacheLookup
	public WebElement MultipletransactionsAmount;
	
	@FindBy(xpath="//input[@name='amount']")
	@CacheLookup
	public WebElement ADDMultipletransaction;
	
	@FindBy(xpath="")
	@CacheLookup
	public WebElement DesMultipletransaction;
	
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveMultipletransaction;
	
	@FindBy(xpath="//i[@class='fa fa-plus azure']")
	@CacheLookup
	public WebElement Addsupplier;
	
	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement supplierNameText;
	
	@FindBy(xpath="(//i[@class='fa fa-save'])[2]")
	@CacheLookup
	public WebElement Savesupplier;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	@CacheLookup
	public WebElement ADDItem;
	
	@FindBy(xpath="//input[@id='txtItemName']")
	@CacheLookup
	public WebElement ItemName;
	
	@FindBy(xpath="//input[@name='Price']")
	@CacheLookup
	public WebElement ItemPrice;
	
	@FindBy(xpath="(//button[@type='button'])[15]")
	@CacheLookup
	public WebElement SaveItem;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveInvoice;
	
	@FindBy(xpath="//button[text()='New Credit Note']")
	@CacheLookup
	public WebElement ADDNewcreditnote;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement ADDNewCreditNoteSave;
	
	@FindBy(xpath="//a[text()='Bank Transfer']")
	@CacheLookup
	public WebElement BankTransfer;
	
	@FindBy(xpath="(//i[@class='fa fa-plus'])[2]")
	@CacheLookup
	public WebElement ADDBankTransfer;
	
	@FindBy(xpath="//input[@name='TotalAmount']")
	@CacheLookup
	public WebElement AmountADDBankTransfer;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveADDBankTransfer;
	
	@FindBy(xpath="//td[@class='col-action']/textarea")
	@CacheLookup
	public WebElement Journaldescription;
	
	@FindBy(xpath="(//button[@type='button']/i)[3]")
	@CacheLookup
	public WebElement Directjournalsave;
	
	@FindBy(xpath="//td[@class='col-action']/textarea")
	@CacheLookup
	public WebElement Despurchase;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement Amountpurchase;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	@CacheLookup
	public WebElement Savepurchase;
	
	
	
}
