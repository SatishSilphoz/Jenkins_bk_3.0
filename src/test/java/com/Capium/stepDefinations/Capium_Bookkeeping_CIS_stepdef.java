package com.Capium.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Actions.Capium_Bookkeeping_CIS_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Capium_Bookkeeping_CIS_stepdef {

	Capium_Bookkeeping_CIS_Actions CISActions = new Capium_Bookkeeping_CIS_Actions();
	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();

	@Given("Click on CIS drop down and verify CIS dropdown list displayed or not")
	public void click_on_cis_drop_down_and_verify_cis_dropdown_list_displayed_or_not() throws InterruptedException {
		CISActions.ClickCISdropdown();
		StepTracker.setCurrentStep("Click on CIS drop down and verify CIS dropdown list displayed or not");
		Log.info("Click on CIS drop down and verify CIS dropdown list displayed or not");
	}

	@Given("Click on Subcontractor")
	public void click_on_subcontractor() throws InterruptedException {
		CISActions.ClickSubcontractor();
		StepTracker.setCurrentStep("Click on Subcontractor");
		Log.info("Click on Subcontractor");
	}

	@Given("Click on Add Subcontractor")
	public void click_on_add_subcontractor() throws InterruptedException {
		CISActions.ClickAddSubcontractor();
		StepTracker.setCurrentStep("Click on Add Subcontractor");
		Log.info("Click on Add Subcontractor");
	}

	@Given("Enter all manditory fields and click on save and verify subcontractor added successfully or not")
	public void enter_all_manditory_fields_and_click_on_save_and_verify_subcontractor_added_successfully_or_not()
			throws InterruptedException {
		CISActions.Entersubcontractordetails();
		StepTracker.setCurrentStep(
				"Enter all manditory fields and click on save and verify subcontractor added successfully or not");
		Log.info("Enter all manditory fields and click on save and verify subcontractor added successfully or not");
	}

	@When("Click on Actions dropdown in Subcontractor")
	public void click_on_actions_dropdown_in_subcontractor() {
		CISActions.ClickOnActionsInSubcontractor();
		StepTracker.setCurrentStep("Click on Actions dropdown in Subcontractor");
		Log.info("Click on Actions dropdown in Subcontractor");
	}

	@Given("Click on Edit subcontractor")
	public void click_on_edit_subcontractor() throws InterruptedException {
		CISActions.SelectEdits();
		StepTracker.setCurrentStep("Click on Edit subcontractor");
		Log.info("Click on Edit subcontractor");
	}

	@Given("Click on save")
	public void click_on_save() throws InterruptedException {
		HelperClass.waitUntilClickable(wait, By.xpath("//button[normalize-space()='Save']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//button[normalize-space()='Save']"));
		StepTracker.setCurrentStep("Click on save");
		Log.info("Click on save");
	}

	@Given("Click on Download certificate and verify certificate downloaded successfully or not")
	public void click_on_download_certificate_and_verify_certificate_downloaded_successfully_or_not()
			throws InterruptedException {
		CISActions.Clickdownload();
		StepTracker
				.setCurrentStep("Click on Download certificate and verify certificate downloaded successfully or not");
		Log.info("Click on Download certificate and verify certificate downloaded successfully or not");
	}

	@Given("Select Purchase Type as CIS Invoice and Select supplier as subcontractor created and enter all manditory fields and click on Save and Close")
	public void select_purchase_type_as_cis_invoice_and_select_supplier_as_subcontractor_created_and_enter_all_manditory_fields_and_click_on_save_and_close()
			throws InterruptedException {
		CISActions.AddCISPurchase();
		StepTracker.setCurrentStep(
				"Select Purchase Type as CIS Invoice and Select supplier as subcontractor created and enter all manditory fields and click on Save and Close");
		Log.info("Select Purchase Type as CIS Invoice and Select supplier as subcontractor created and enter all manditory fields and click on Save and Close");
	}

	@Given("Click on Select Action drop down and Select Add payment")
	public void click_on_select_action_drop_down_and_select_add_payment() {
		CISActions.SelectPaymentMethod();
		StepTracker.setCurrentStep("Click on Select Action drop down and Select Add payment");
		Log.info("Click on Select Action drop down and Select Add payment");
	}

	@Given("Select Account type as cash in hand or bank and Enter some amount and all manditory fields and click on Save")
	public void select_account_type_as_cash_in_hand_or_bank_and_enter_some_amount_and_all_manditory_fields_and_click_on_save() {
		CISActions.fillAddPaymentForm();
		StepTracker.setCurrentStep(
				"Select Account type as cash in hand or bank and Enter some amount and all manditory fields and click on Save");
		Log.info("Select Account type as cash in hand or bank and Enter some amount and all manditory fields and click on Save");
		
	}

	@Given("Select Account type as CIS Control account and Enter total balance amount and all manditory fields and click on Save")
	public void select_account_type_as_cis_control_account_and_enter_total_balance_amount_and_all_manditory_fields_and_click_on_save() throws InterruptedException {
		CISActions.EditPaymentCISAndSave();
		StepTracker.setCurrentStep(
				"Select Account type as CIS Control account and Enter total balance amount and all manditory fields and click on Save");
		Log.info("Select Account type as CIS Control account and Enter total balance amount and all manditory fields and click on Save");
		
	}

	@Given("Click on CIS300")
	public void click_on_cis300() {
		CISActions.ClickOnCIS300();
		StepTracker.setCurrentStep("Click on CIS300");
		Log.info("Click on CIS300");
	}

	@Given("Click on Add CIS Monthly Return")
	public void click_on_add_cis_monthly_return() {
		CISActions.ClickOnCISMonthlyReturn();
		StepTracker.setCurrentStep("Click on Add CIS Monthly Return");
		Log.info("Click on Add CIS Monthly Return");
	}

	@Given("Select required fields and submit to capium")
	public void select_required_fields_and_submit_to_capium() throws InterruptedException {
		CISActions.EnterRequireddataforSubmit();
		StepTracker.setCurrentStep("Select required fields and submit to capium");
		Log.info("Select required fields and submit to capium");
	}

	@Given("Verify CIS Monthly Return created successfully or not")
	public void verify_cis_monthly_return_created_successfully_or_not() {
		CISActions.VerifyCISMonthlyReturnCratedOrNot();
		StepTracker.setCurrentStep("Verify CIS Monthly Return created successfully or not");
		Log.info("Verify CIS Monthly Return created successfully or not");
	}

	@When("Click on CIS Action dropdown")
	public void click_on_cis_action_dropdown() throws InterruptedException {
		CISActions.CISActionDropDown();
		StepTracker.setCurrentStep("Click on CIS Action dropdown");
		Log.info("Click on CIS Action dropdown");
	}

	@Given("Click on CISEdit")
	public void click_on_cisedit() throws InterruptedException {
		CISActions.CISEdit();
		StepTracker.setCurrentStep("Click onEdit");
		Log.info("Click on CISEdit");
	}

	@Given("Change manditory fields as required and submit to capium")
	public void change_manditory_fields_as_required_and_submit_to_capium() {

		StepTracker.setCurrentStep("Change manditory fields as required and submit to capium");
		Log.info("Change manditory fields as required and submit to capium");
	}

	@Given("Click on Download Detail and verify CIS300 Monthly Return downloaded successfully or not")
	public void click_on_download_detail_and_verify_cis300_monthly_return_downloaded_successfully_or_not()
			throws InterruptedException {
		CISActions.CISDownloadDetails();
		StepTracker.setCurrentStep(
				"Click on Download Detail and verify CIS300 Monthly Return downloaded successfully or not");
		Log.info("Click on Download Detail and verify CIS300 Monthly Return downloaded successfully or not");
	}

	@Given("Click on SMS and verify New SMS page displayed or not")
	public void click_on_sms_and_verify_new_sms_page_displayed_or_not() throws InterruptedException {
		CISActions.CISSMS();
		StepTracker.setCurrentStep("Click on SMS and verify New SMS page displayed or not");
		Log.info("Click on SMS and verify New SMS page displayed or not");
	}

	@Given("Click on Reports")
	public void click_on_reports() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='Reports'])[1]")));
		HelperClass.ClickUsingJS(driver, By.xpath("(//span[normalize-space()='Reports'])[1]"));
		StepTracker.setCurrentStep("Click on Reports");
		Log.info("Click on Reports");
	}

	@Given("Click on CIS Submission report")
	public void click_on_cis_submission_report() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='CIS Submission']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[normalize-space()='CIS Submission']"));
		StepTracker.setCurrentStep("Click on CIS Submission report");
		Log.info("Click on CIS Submission report");
	}

	@Given("Click on pdf icon and verify pdf downloaded successfully or not")
	public void click_on_pdf_icon_and_verify_pdf_downloaded_successfully_or_not() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-file-pdf-o azure']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//i[@class='fa fa-file-pdf-o azure']"));
		StepTracker.setCurrentStep("Click on pdf icon and verify pdf downloaded successfully or not");
		Log.info("Click on pdf icon and verify pdf downloaded successfully or not");
	}

	@Given("Click on period and click on pdf icon and verify downloaded successfully or not")
	public void click_on_period_and_click_on_pdf_icon_and_verify_downloaded_successfully_or_not() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-file-pdf-o azure']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//i[@class='fa fa-file-pdf-o azure']"));
		StepTracker.setCurrentStep("Click on period and click on pdf icon and verify downloaded successfully or not");
		Log.info("Click on period and click on pdf icon and verify downloaded successfully or not");
	}

	@Given("Click on Subcontractor YTD Details")
	public void click_on_subcontractor_ytd_details() {

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sub contractor YTD Details']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[normalize-space()='Sub contractor YTD Details']"));
		StepTracker.setCurrentStep("Click on Subcontractor YTD Details");
		Log.info("Click on Subcontractor YTD Details");
	}

	@Given("Select Subcotractor,period and from and to date and verify records displaying or not")
	public void select_subcotractor_period_and_from_and_to_date_and_verify_records_displaying_or_not() {
		CISActions.SubContractorYTDDetails();
		StepTracker
				.setCurrentStep("Select Subcotractor,period and from and to date and verify records displaying or not");
		Log.info("Select Subcotractor,period and from and to date and verify records displaying or not");
	}

	@Given("Click on Export>>Export as pdf and verify pdf exported successfully or not")
	public void click_on_export_export_as_pdf_and_verify_pdf_exported_successfully_or_not()
			throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnExport']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@id='btnExport']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@id='A1']"));
		StepTracker.setCurrentStep("Click on Export>>Export as pdf and verify pdf exported successfully or not");
		Log.info("Click on Export>>Export as pdf and verify pdf exported successfully or not");
	}

	@Given("Click on Export>>Export as excel and verify excel exported successfully or not")
	public void click_on_export_export_as_excel_and_verify_excel_exported_successfully_or_not() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnExport']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@id='btnExport']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@id='A2']"));
		StepTracker.setCurrentStep("Click on Export>>Export as excel and verify excel exported successfully or not");
		Log.info("Click on Export>>Export as excel and verify excel exported successfully or not");
	}

	@Given("Click on CIS Invoice and verify CIS Invoice page displaying or not")
	public void click_on_cis_invoice_and_verify_cis_invoice_page_displaying_or_not() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='CIS Invoice']")));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[normalize-space()='CIS Invoice']"));
		StepTracker.setCurrentStep("Click on CIS Invoice and verify CIS Invoice page displaying or not");
		Log.info("Click on CIS Invoice and verify CIS Invoice page displaying or not");
	}

	@Given("Select subcontractor,period,from and to date and click on search and verify records displaying successfully or not")
	public void select_subcontractor_period_from_and_to_date_and_click_on_search_and_verify_records_displaying_successfully_or_not() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cboperiod']")));
		HelperClass.SelectDropdownvaluesOneByOne(By.xpath("//select[@id='cboperiod']"));
		StepTracker.setCurrentStep("Select subcontractor,period,from and to date and click on search and verify records displaying successfully or not");
		Log.info("Select subcontractor,period,from and to date and click on search and verify records displaying successfully or not");
	}

	@Given("Click on Contractor Settings and verify Contractor Settings page displaying successfully or not")
	public void click_on_contractor_settings_and_verify_contractor_settings_page_displaying_successfully_or_not() throws InterruptedException {
		CISActions.clickContractorSettings(driver);
		StepTracker.setCurrentStep("Click on Contractor Settings and verify Contractor Settings page displaying successfully or not");
		Log.info("Click on Contractor Settings and verify Contractor Settings page displaying successfully or not");
	}

	
}
