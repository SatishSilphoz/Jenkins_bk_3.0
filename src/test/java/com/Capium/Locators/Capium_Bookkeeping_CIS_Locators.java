package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_CIS_Locators {

	@FindBy(xpath = "(//span[@class='menu-text'])[15]")
	@CacheLookup
	public WebElement clickCISdropdown;

	@FindBy(xpath = "//a[contains(@href,'/bookkeeping/cis/subcontractor.aspx')]")
	@CacheLookup
	public WebElement clickSubcontractor;

	@FindBy(xpath = "(//a[contains(text(),'Subcontractor')])[3]")
	@CacheLookup
	public WebElement clickAddSubcontractor;

	// Enter all mandatory fields and click on save and verify sub contractor added
	// successfully or not

	@FindBy(xpath = "//input[@name='Name']")
	@CacheLookup
	public WebElement enterContactName;

	@FindBy(xpath = "//input[@name='Address1']")
	@CacheLookup
	public WebElement enterAddressLine1;

	@FindBy(xpath = "//input[@name='Address2']")
	@CacheLookup
	public WebElement enterAddressLine2;

	@FindBy(xpath = "//input[@id='txttown']")
	@CacheLookup
	public WebElement enterTown;

	@FindBy(xpath = "//input[@name='State']")
	@CacheLookup
	public WebElement enterCounty;

	@FindBy(xpath = "//input[@name='TradingName']")
	@CacheLookup
	public WebElement enterTradingName;

	@FindBy(xpath = "//input[@name='UTR']")
	@CacheLookup
	public WebElement enterUTR;

	@FindBy(xpath = "//input[@id='niNumber']")
	@CacheLookup
	public WebElement enterNINumber;

	@FindBy(xpath = "//input[@id='niNumber']")
	@CacheLookup
	public WebElement enterCompanyNumber;

	@FindBy(xpath = "//input[@name='WorksRef']")
	@CacheLookup
	public WebElement enterWorkReference;

	@FindBy(xpath = "//select[@name='IsManual']")
	@CacheLookup
	public WebElement selectVerifydropdown;

	// option value="true"

	@FindBy(xpath = "//i[@class='fa fa-check']")
	@CacheLookup
	public WebElement clickOKininformation;

	@FindBy(xpath = "//input[@name='VerificationNo']")
	@CacheLookup
	public WebElement enterVerificationNo;

	@FindBy(xpath = "//input[@name='LastVerifiedOnStr']")
	@CacheLookup
	public WebElement enterLastVerifieddate;

	@FindBy(xpath = "//select[@name='TaxTreatment']")
	@CacheLookup
	public WebElement selectTaxTreatment;

	// option value="net"

	@FindBy(xpath = "//button[@data-bb-handler='save']")
	@CacheLookup
	public WebElement clickSave;

	@FindBy(xpath = "//a[text()='Shareholder1']")
	@CacheLookup
	public WebElement verifysubcontractorcreatedsuccessfullyornot;

	// Verify Edit/Delete/Download sub contractor

	@FindBy(xpath = "//select[contains(@class,'ddlaactioncss')]")
	@CacheLookup
	public WebElement selectEdits;

	// option value="edit"

	@FindBy(xpath = "//select[contains(@class,'ddlaactioncss')]")
	@CacheLookup
	public WebElement clickDownload;

	// option value="edit"

	// Verify purchase drop down
	@FindBy(xpath = "(//span[@class='menu-text'])[4]")
	@CacheLookup
	public WebElement clickPurchasedropdown;

	// Verify Purchase Type as CIS Invoice with Save and Close
	@FindBy(xpath = "//a[text()='Purchases']")
	@CacheLookup
	public WebElement clickPurchases;

	@FindBy(xpath = "//a[@type='button']")
	@CacheLookup
	public WebElement clickAddpurchase;

	@FindBy(xpath = "//select[@name='TransactionType']") // select purchase type
	@CacheLookup
	public WebElement selectPurchasetype;
	// option by value=2

//		@FindBy(xpath="(//span[@aria-autocomplete='list'])[2]")// click on supplier list
//		@CacheLookup
//	    public WebElement clickSupplierlist;
	//
//		@FindBy(xpath="//input[@role='textbox']")// search supplier name
//		@CacheLookup
//	    public WebElement searchSupplierName;
	//
//		@FindBy(xpath="//span[text()='shareholder1']")// select supplier name
//		@CacheLookup
//	    public WebElement selectSupplierName;

	@FindBy(xpath = "//select[@id='cboCustomer']")
	@CacheLookup
	public WebElement selectSupplierName;

	@FindBy(xpath = "//input[@name='VDateStr']") // enter date
	@CacheLookup
	public WebElement enterDate;

	@FindBy(xpath = "//input[@id='txtNote']") // Enter Notes
	@CacheLookup
	public WebElement enterNotes;

	@FindBy(xpath = "//textarea[contains(@class,'Desc')]") // Enter Description
	@CacheLookup
	public WebElement enterDescription;

	@FindBy(xpath = "//select[@id='cisdrpdown']") // Click select supply type drop down
	@CacheLookup
	public WebElement clickSelectTypedropdown;
	// option by value="0"

	@FindBy(xpath = "(//input[@type='text'])[5]") // Enter amount
	@CacheLookup
	public WebElement enterAmount;

	@FindBy(xpath = "(//input[@type='text'])[7]") // Click on to select account type
	@CacheLookup
	public WebElement clickAccount;

	@FindBy(xpath = "//a[contains(text(),'1270 - Sub-Contract Cost ')]") // select account account code
	@CacheLookup
	public WebElement selectaccountcode;

	@FindBy(xpath = "(//th[contains(text(),'Account')])[1]")
	@CacheLookup
	public WebElement clickoutsideaccount;

	@FindBy(xpath = "(//select[@class='form-control input-sm'])[2]") // click on select vat rate
	@CacheLookup
	public WebElement clickselectacvatrate;
	// option by value value="5"

	@FindBy(xpath = "//div[@class='clearfix form-footer']//div[@class='clearfix pull-right']//button[1]") // click save&close
	@CacheLookup
	public WebElement clicksaveandclose;

	// Verify Add Payment in select action drop down using cash in hand or bank
	@FindBy(xpath = "(//select[@id='ddlaction'])[1]") // click on select action drop down
	@CacheLookup
	public WebElement clickselectactiondropdown;
	// option by value="payment"

	@FindBy(xpath = "//select[@id='F_AccountMaster']") // Select account in add payment pop up
	@CacheLookup
	public WebElement clickonAccount;
	// option by value="244"

	@FindBy(xpath = "//input[@id='txtAmount']") // Enter some labour amount
	@CacheLookup
	public WebElement enteramount;

	@FindBy(xpath = "//input[@id='txtDesc']") // Enter reference
	@CacheLookup
	public WebElement enterreference;

	@FindBy(xpath = "//button[@data-bb-handler='save']") // Click on save
	@CacheLookup
	public WebElement clickPaymentSave;

	// Verify Add Payment in select action drop down using CIS Control account

	@FindBy(xpath = "(//select[@id='ddlaction'])[1]") // click on select action drop down
	@CacheLookup
	public WebElement clickselectactiondropdown1;
	// option by value="payment"

	@FindBy(xpath = "//input[@name='VDateStr']") // Enter payment date
	@CacheLookup
	public WebElement enterpaymentdate;

	@FindBy(xpath = "//select[@id='F_AccountMaster']") // Select account code in add payment pop up
	@CacheLookup
	public WebElement clickonAccount1;
	// option by value="618"

	@FindBy(xpath = "//input[@id='txtAmount']") // Enter some amount
	@CacheLookup
	public WebElement enteramount1;

	@FindBy(xpath = "//input[@id='txtDesc']") // Enter reference
	@CacheLookup
	public WebElement enterreference1;

	@FindBy(xpath = "//button[@data-bb-handler='save']") // Click on save
	@CacheLookup
	public WebElement clickPaymentSave1;

	// Verify CIS dropdown after creating CIS purchase----Already written

	// Verify CIS300 Submission
	@FindBy(xpath = "//a[text()='CIS300']") // Click on CIS300
	@CacheLookup
	public WebElement clickCIS300;

	@FindBy(xpath = "//a[@role='button']") // Click on Add CIS Monthly Return
	@CacheLookup
	public WebElement clickAddCISMonthlyReturn;

	@FindBy(xpath = "//select[@name='Month']") // First period CIS Return Details select month
	@CacheLookup
	public WebElement selectMonth;
	// option value="4"

	@FindBy(xpath = "//select[@name='Year']") // First period CIS Return Details select year
	@CacheLookup
	public WebElement selectYear;
	// option value="2025"

	@FindBy(xpath = "(//button[@type='button'])[2]") // Click on Next
	@CacheLookup
	public WebElement clickNext;

	@FindBy(xpath = "//button[text()='Submit to Capium']") // Click on submit to capium
	@CacheLookup
	public WebElement clickSubmitCapium;

	@FindBy(xpath = "(//button[@type='button'])[4]") // Click on Close
	@CacheLookup
	public WebElement clickClose;

	@FindBy(xpath = "//span[text()='Capium Submitted']") // verify CIS300 submission return
	@CacheLookup
	public WebElement verifyCIS300submissionreturn;

	// Verify Edit in Select Action drop down in Add CIS Monthly Return
	@FindBy(xpath = "//select[@class='input-xs ddlaction']") // click on Select action drop down
	@CacheLookup
	public WebElement clickselectactionDD;
	// option value="edit"

	// Verify Download Detail in Select Action drop down in Add CIS Monthly Return
	@FindBy(xpath = "//select[@class='input-xs ddlaction']") // click on Select action drop down
	@CacheLookup
	public WebElement clickDownloaddetail;
	// option value="detail"

	// Verify SMS in Select Action drop down in Add CIS Monthly Return
	@FindBy(xpath = "//select[@class='input-xs ddlaction']") // click on Select action drop down
	@CacheLookup
	public WebElement clickSMS;
	// option value="sms"

	// Verify CIS Submission Report
	@FindBy(xpath = "(//i[@class='menu-expand'])[11]") // click on reports drop down
	@CacheLookup
	public WebElement clickCISreportDD;

	@FindBy(xpath = "//a[text()='CIS Submission']") // click on CIS submission reports drop down
	@CacheLookup
	public WebElement clickCISsubmission;

	@FindBy(xpath = "//i[@class='fa fa-file-pdf-o azure']") // click on pdf icon
	@CacheLookup
	public WebElement clickPDFicon;

	@FindBy(xpath = "//i[@class='fa icon azure fa-plus-square']") // click on period
	@CacheLookup
	public WebElement clickperiod;

	@FindBy(xpath = "(//i[@class='fa fa-file-pdf-o azure'])[1]") // click on PDF icon inside period
	@CacheLookup
	public WebElement clickPDFicon1insideperiod;

	@FindBy(xpath = "(//i[@class='fa fa-file-pdf-o azure'])[2]") // click on PDF icon inside period
	@CacheLookup
	public WebElement clickPDFicon2insideperiod;

	// Verify Subcontractor Contractor YTD Details Report
	@FindBy(xpath = "//a[text()='Sub contractor YTD Details']") // click on subcontractor YTD details report
	@CacheLookup
	public WebElement clickSubcontractorYTD;

	@FindBy(xpath = "//span[@title='All']") // select All sub contractor
	@CacheLookup
	public WebElement selectAllsubcontractor;

	@FindBy(xpath = "//select[@id='cboperiod']") // select Period
	@CacheLookup
	public WebElement selectPeriod;
	// option value="All"

	@FindBy(xpath = "//input[@name='txtDateFrom']") // select Period
	@CacheLookup
	public WebElement selectFromdate;

	@FindBy(xpath = "//input[@id='txtDateTo']") // select Period
	@CacheLookup
	public WebElement selectTodate;

	@FindBy(xpath = "(//div[@style='text-align:left;'])[1]") // verify record displayed or not as per selected
	@CacheLookup
	public WebElement verifySubcontractorYTDdetailsreport;

	@FindBy(xpath = "//a[@id='btnExport']") // Click on export
	@CacheLookup
	public WebElement clickExport;

	@FindBy(xpath = "//a[contains(text(),'Export As PDF')]") // Click on export as PDF
	@CacheLookup
	public WebElement clickExportPDF;

	@FindBy(xpath = "//a[contains(text(),'Export As Excel')]") // Click on export as Excel
	@CacheLookup
	public WebElement clickExportExcel;

	// Verify CIS Invoice report
	@FindBy(xpath = "//a[text()='CIS Invoice']") // Click on CIS Invoice
	@CacheLookup
	public WebElement clickCISInvoice;

	@FindBy(xpath = "//h1[text()='CIS Invoice']") // Verify CIS Invoice page displayed or not
	@CacheLookup
	public WebElement verifyCISInvoicepage;

	@FindBy(xpath = "//span[@title='All']") // Select All subcontractors
	@CacheLookup
	public WebElement selectAllsubcontractors;

	@FindBy(xpath = "//select[@id='cboperiod']") // Select All period
	@CacheLookup
	public WebElement selectPeriodAll;
	// option value="All"

	@FindBy(xpath = "//input[@name='txtDateFrom']") // Select From date
	@CacheLookup
	public WebElement selectCISFromdate;

	@FindBy(xpath = "//input[@name='txtDateTo']") // Select To date
	@CacheLookup
	public WebElement selectCISTodate;

	@FindBy(xpath = "//div[contains(@style,'text-align:left;')]") // Verify CIS Invoice displayed as selected or not
	@CacheLookup
	public WebElement verifyCISInvoicedisplayedasselectedornot;

	@FindBy(xpath = "//i[@class='fa fa-file-pdf-o azure']") // click PDF icon in CIS Invoice
	@CacheLookup
	public WebElement clickPDFiconinCISInvoice;

	// Verify Contractor Settings
	@FindBy(xpath = "//a[text()='Contractor Settings']") // click PDF icon in CIS Invoice
	@CacheLookup
	public WebElement clickContractorsettings;

	@FindBy(xpath = "//h1[text()='Contractor Settings']") // Verify contractor settings page
	@CacheLookup
	public WebElement verifyContractorsettingspage;

	// Verify Delete subcontractor
	@FindBy(xpath = "//h1[text()='Contractor Settings']") // Verify delete subcontractor
	@CacheLookup
	public WebElement verifyDeletesubcontractor;
	// option value="del"

	@FindBy(xpath = "//div[@class='modal-title']") // Verify delete subcontractor confirmation
	@CacheLookup
	public WebElement verifyDeletesubcontractorconfirmation;

	// Verify Delete in Select Action drop down in Add CIS Monthly Return
	@FindBy(xpath = "//select[@class='input-xs ddlaction']]") // select Delete in select action drop down
	@CacheLookup
	public WebElement verifyDeleteinCISMonthlyReturn;
	// option value="delete"

	@FindBy(xpath = "//i[@class='fa fa-check']") // click OK in delete confirmation
	@CacheLookup
	public WebElement clickOKinDeleteconfirmation;

	@FindBy(xpath = "//td[text()='No monthly return to display']") // verify CIS Monthly Return Deleted successfully or
	@CacheLookup
	public WebElement verifyCISMonthlyReturnDeletedornot;

}
