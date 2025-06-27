package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Actions.Capium_Bookkeeping_Purchase_Actions;
import com.Capium.Actions.Capium_ClientCreation_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_Bookkeeping_Purchase_stepdef {

	Capium_Bookkeeping_Purchase_Actions purchase = new Capium_Bookkeeping_Purchase_Actions();
	Capium_ClientCreation_Actions client = new Capium_ClientCreation_Actions();
	WebDriverWait wait = HelperClass.getWait();
	WebDriver driver = HelperClass.getDriver();

	@Given("Validate Click on Purchase")
	public void validate_click_on_purchase() throws IOException, InterruptedException {
		purchase.click_purchase_btn();
		StepTracker.setCurrentStep("Validate Click on Purchase");
		Log.info("Sucessfully Clicked on Purchase button");
	}

	@Given("Click Dashboard in Purchase")
	public void click_dashboard_in_purchase() {
		purchase.click_purchase_dashboard();
	}

	@Given("Validate Purchases summary board")
	public void validate_purchases_summary_board() {
		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[1]//a[1]"));
	}

	@Given("Click on Purchases button it should navigate to Create New Purchase page")
	public void click_on_purchases_button_it_should_navigate_to_create_new_purchase_page() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(),
				By.xpath("//a[@onclick='Default.SetDashboardLink(this, 0)']"));
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "New Purchase page screenshot");
	}

	@Given("Redirect to Purchase dashboard page")
	public void redirect_to_purchase_dashboard_page() {
		purchase.openPurchaseDashboard();
	}

	@Given("Click on Supplier button it should navigate to Contact list page")
	public void click_on_supplier_button_it_should_navigate_to_contact_list_page() {
		purchase.ClickSupplierButton();
		Log.info("Successfully navigated to Contact list page");
	}

	@When("Click on All Purchases link it should navigate to purchases page")
	public void click_on_all_purchases_link_it_should_navigate_to_purchases_page() {

		HelperClass.waitUntilClickable(wait, By.xpath("(//a[text()='All Purchases'])[1]"));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[text()='All Purchases'])[1]"));

	}

	@When("Click on All Supplier link it should navigate to Contact list page")
	public void click_on_all_supplier_link_it_should_navigate_to_contact_list_page() {
		HelperClass.waitUntilVisible(wait, By.xpath("(//a[text()='All Supplier'])[1]"));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[text()='All Supplier'])[1]"));
	}

	@Given("Validate Purchases chart")
	public void validate_purchases_chart() throws InterruptedException {
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[29]"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[29]"));
	}

	@When("Validate Creditors Chart")
	public void validate_creditors_chart() throws InterruptedException {
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[30]"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[30]"));
	}

	@When("Validate Current Creditors list")
	public void validate_current_creditors_list() throws InterruptedException {
		HelperClass.waitUntilClickable(wait, By.xpath("(//a[@href='#'])[31]"));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[31]"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[31]"));
	}

	@Then("Click on All creditors link it should navigate to creditors list page")
	public void click_on_all_creditors_link_it_should_navigate_to_creditors_list_page() {
		HelperClass.waitUntilClickable(wait, By.xpath("//a[text()='All Creditors']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[text()='All Creditors']"));

	}

	@Then("Validate Recent Purchases list")
	public void validate_recent_purchases_list() throws InterruptedException {
		HelperClass.waitUntilClickable(wait, By.xpath("(//a[@href='#'])[32]"));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[32]"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[@href='#'])[32]"));
	}

	@Then("Click on All purchaes link in Recent Purchase list it should navigate to Purchases page")
	public void click_on_all_purchaes_link_in_recent_purchase_list_it_should_navigate_to_purchases_page() {
		HelperClass.waitUntilClickable(wait, By.xpath("(//a[text()='All Purchases'])[2]"));
		HelperClass.ClickUsingJS(driver, By.xpath("(//a[text()='All Purchases'])[2]"));
	}

	@Given("Click on Purchases")
	public void click_on_purchases() {
		purchase.ClickOnPurchases();
		StepTracker.setCurrentStep("Click on Purchases");
	}

	@Given("Click on New Purchase button it should it should display Create new purchase page and create purchase items")
	public void click_on_new_purchase_button_it_should_it_should_display_create_new_purchase_page_and_create_purchase_items() {
		HelperClass.waitUntilClickable(wait, By.xpath("//a[@type='button']"));
		HelperClass.ClickUsingJS(driver, By.xpath("//a[@type='button']"));
		StepTracker.setCurrentStep(
				"Click on New Purchase button it should it should display Create new purchase page and create purchase items");
	}

	@When("Create Purchase Invoice")
	public void create_purchase_invoice() throws InterruptedException, IOException {
		purchase.AddPurchaseInvoice();
		StepTracker.setCurrentStep("Create Purchase Invoice");
	}

	@When("Click on Purchase type dropdown")
	public void click_on_purchase_type_dropdown() {
		purchase.ClickOnPurchaseTypeDropdown();
		StepTracker.setCurrentStep("Click on Purchase type dropdown");

	}

	@Then("Select each type from dropdown")
	public void select_each_type_from_dropdown() throws InterruptedException {
		purchase.ValidatePurchaseType_Dropdown();
		StepTracker.setCurrentStep("Select each type from dropdown");
	}
	
	@When("Click on Select Action dropdown")
	public void click_on_select_action_dropdown() throws InterruptedException {
        purchase.ActionDropdown();
        StepTracker.setCurrentStep("Click on Select Action dropdown");
	}

	@When("Click on Edit")
	public void click_on_edit() throws InterruptedException {
		purchase.Edit();
		StepTracker.setCurrentStep("Click on Edit");
	}

	@When("click on Export")
	public void click_on_export() {
		purchase.ClickOnExport();
		StepTracker.setCurrentStep("click on Export");
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Export Option screenshot");
	}

	@When("Click Export as PDF")
	public void click_export_as_pdf() throws InterruptedException {
		purchase.ClickOnExportPDF();
		StepTracker.setCurrentStep("Click Export as PDF");
	}

	@Then("Click Export as Excel")
	public void click_export_as_excel() throws InterruptedException {
		purchase.ClickOnExportExcel();
		StepTracker.setCurrentStep("Click Export as Excel");
	}

	@Then("Click on Capiscan")
	public void click_on_capiscan() throws InterruptedException {
		purchase.ClickOnCapiScan();
		StepTracker.setCurrentStep("Click on Capiscan");
	}

	@When("Click on Recuring Purchases")
	public void click_on_recuring_purchases() throws InterruptedException {
		purchase.ClickOnRecuringPurchases();
		StepTracker.setCurrentStep("Click on Recuring Purchases");
	}

	@When("Click on Add Recuring Purchase")
	public void click_on_add_recuring_purchase() throws InterruptedException {
		purchase.ClickOnAddRecuringPurchaseButton();
		StepTracker.setCurrentStep("Click on Add Recuring Purchase");
	}

	@When("Enter the recuring purchase details")
	public void enter_the_recuring_purchase_details() throws InterruptedException {
		purchase.EnterRecurringPurchaseDetails();
		StepTracker.setCurrentStep("Enter the recuring purchase details");
	}

	@Then("Click on Save and close")
	public void click_on_save_and_close() {
		purchase.ClickOnSaveAndCloseButton();
		purchase.SearchRecurringPurchaseBySupplierFromExcel();
		purchase.ClickOnSearchButton();
		StepTracker.setCurrentStep("Click on Save and close");
	}

	@Then("Click on Save and New")
	public void click_on_save_and_new() throws InterruptedException {
		purchase.ClickOnSaveAndNewButton();
		Thread.sleep(2000);
		purchase.ClickOnRecuringPurchases();
		purchase.SearchRecurringPurchaseBySupplierFromExcel();
		purchase.ClickOnSearchButton();
		StepTracker.setCurrentStep("Click on Save and New");
	}

	@When("Enter supplier name in Search area")
	public void enter_supplier_name_in_search_area() {
		purchase.SearchRecurringPurchaseBySupplierFromExcel();
		StepTracker.setCurrentStep("Enter supplier name in Search area");
	}

	@Then("Click on search button")
	public void click_on_search_button() {
		purchase.ClickOnSearchButton();
		StepTracker.setCurrentStep("Click on search button");
	}

	@When("Click on Payments")
	public void click_on_payments() throws InterruptedException {
		purchase.ClickOnPayments();
		StepTracker.setCurrentStep("Click on Payments");
	}

	@When("Click on Add payment")
	public void click_on_add_payment() {
		purchase.ClickOnAddPayment();
		StepTracker.setCurrentStep("Click on Add payment");
	}

	@When("Add supplier from dropdown")
	public void add_supplier_from_dropdown() throws InterruptedException {
		purchase.AddSupplierfromDropdown();
		StepTracker.setCurrentStep("Add supplier from dropdown");
	}

	@Then("Enter amount")
	public void enter_amount() {
		purchase.EnterAmount();
		StepTracker.setCurrentStep("Enter amount");
	}
	
	@Then("Click on Payments Save and close")
	public void click_on_payments_save_and_close() {
	   purchase.ClickOnPaymentsSaveandClose();
	   StepTracker.setCurrentStep("Click on Payments Save and close");
	}

	@When("Click on Checkbox Make advance payment")
	public void click_on_checkbox_make_advance_payment() {
      purchase.ClickAdvancePaymentCheckbox();
      StepTracker.setCurrentStep("Click on Checkbox Make advance payment");
	}

	
	@Then("Click on Payments Save and New")
	public void click_on_payments_save_and_new() {
	   purchase.ClickOnSaveandNewButton();
	   StepTracker.setCurrentStep("Click on Payments Save and New");
	}
	
	@Then("Click on Import button")
	public void click_on_import_button() {
		purchase.ClickOn_import();
		 StepTracker.setCurrentStep("Click on Import button");
		 Log.info("Successfully Clicked on import button");
		
	}
    
	@Then("Click on Download template file")
	public void click_on_download_template_file() {
	   purchase.ClickOn_Download();
	   StepTracker.setCurrentStep("Click on Download template file");
	   Log.info("Sucessfully Clicked on download template file");
	}
    
	@Then("Upload the file")
	public void upload_the_file() throws InterruptedException, IOException {
		purchase.UploadFile1();
		StepTracker.setCurrentStep("Upload the file");
		Log.info("Successfully uploaded the file");
	}
    
	@When("After Upload click on Import")
	public void after_upload_click_on_import() throws InterruptedException {
		purchase.ClickOnImportAfterUpload();
	}
    
	@When("Click on process import")
	public void click_on_process_import() {
		purchase.ClickOnProcessImport();
	}
    
	@Then("Click on continue button")
	public void click_on_continue_button() {
		purchase.ClickCheckbox();
	}
    
	@Then("Click on checkbox and approved")
	public void click_on_checkbox_and_approved() {
		purchase.ClickOnApprovedBtn();
	}
    
	@Then("Click on Conformation OK")
	public void click_on_conformation_ok() throws InterruptedException {
		purchase.ConformationPopup();
	}

	@Then("Open created puchase and verify")
	public void open_created_puchase_and_verify() throws InterruptedException {
		purchase.SearchandCaptureScreenshofPurchase();
		purchase.SelectPurchase();
	}


//	@Given("Validate Dashboard in Purchase")
//	public void validate_dashboard_in_purchase() {
//		purchase.click_purchase_dashboard();
//		StepTracker.setCurrentStep("Validate Dashboard in Purchase");
//		Log.info("Successfully Clicked on Dasgboard button");
//		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Purchase Dashboard");
//	}
//	
//	@Given("Validate Purchase Add button")
//	public void validate_purchase_add_button() {
//	   purchase.click_add_purchases_btn();
//	   StepTracker.setCurrentStep("Validate Purchase Add button");
//	   Log.info("Sucessfully Clicked on purchase Add button");
//	}
//
//	@When("Select Purchase Type")
//	public void select_purchase_type() throws InterruptedException {
//	   purchase.select_purchase_type();
//	   StepTracker.setCurrentStep("Select Purchase Type");
//	   Log.info("Sucessfully selected purchase type");
//	}
//
//	@When("Validate + Supplier Name")
//	public void validate_supplier_name() throws InterruptedException {
//	    purchase.click_AddSuplier_btn();
//	    purchase.Enter_suplier_name();
//	    StepTracker.setCurrentStep("Validate + Supplier Name");
//	    Log.info("Succesfully clicked on Add supplier + button");
//	}
//
//	@When("Validate Save btn Add New Supplier")
//	public void validate_save_btn_add_new_supplier() throws InterruptedException {
//		Thread.sleep(1000);
//	   purchase.click_suplier_savebtn();
//	   StepTracker.setCurrentStep("Validate Save btn Add New Supplier");
//	   Log.info("Sucessfully validated Save and Add New supplier button");
//	}
//    
//	@Then("Add description and amount in purchase details")
//	public void add_description_and_amount_in_purchase_details() throws InterruptedException {
//	    purchase.enter_description();
//	    StepTracker.setCurrentStep("Add description and amount in purchase details");
//	    Log.info("Sucessfully entered the details");
//	    
//	}
//	
//	@Then("Validate file upload in purchase page")
//	public void validate_file_upload_in_purchase_page() throws InterruptedException, IOException {
//	   purchase.UploadFile();
//	   StepTracker.setCurrentStep("Validate file upload in purchase page");
//	   Log.info("Sucessfully uploaded the file");
//	}
//    
//	@Then("Click on Save and Close")
//	public void click_on_save_and_close() {
//	   purchase.SaveandClose();
//	   StepTracker.setCurrentStep("Click on Save and Close");
//	   Log.info("Sucessfully clicked on save and close button");
//	}
//	
	


}
