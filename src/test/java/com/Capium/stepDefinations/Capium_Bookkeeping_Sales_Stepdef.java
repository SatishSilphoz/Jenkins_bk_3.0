package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Capium.Actions.Capium_Bookkeeping_Sales_Actions;
import com.Capium.Actions.Capium_ClientCreation_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_Bookkeeping_Sales_Stepdef {

	Capium_Bookkeeping_Sales_Actions SalesAction = new Capium_Bookkeeping_Sales_Actions();
	Capium_ClientCreation_Actions client = new Capium_ClientCreation_Actions();
	WebDriver driver = HelperClass.getDriver();

	@Given("Enter into client")
	public void enter_into_client() throws IOException, InterruptedException {
		client.verifyClientCreation();
		//client.Click_Selected_Client();
	}

	@Given("Click on Sales drop down")
	public void click_on_sales_drop_down() throws IOException, InterruptedException {
		SalesAction.ClickOnSales();
		Log.info("Successfully Clicked on Sales drop down");
		StepTracker.setCurrentStep("Click on Sales drop down");
	}

	@When("Click on Dashboard")
	public void click_on_dashboard() {
		SalesAction.ClickOnSales_dashboard();
		StepTracker.setCurrentStep("Click on Dashboard");
	}

	@Then("Verify All links and buttons in Sales Summary dashboard")
	public void verify_all_links_and_buttons_in_sales_summary_dashboard() throws InterruptedException {
		SalesAction.SalesSummaryMinimize();
		Thread.sleep(2000);
		SalesAction.SalesSummaryMinimize();
		StepTracker.setCurrentStep("Verify All links and buttons in Sales Summary dashboard");
	}

	@Then("Click on Sales button it navigate to Create new Invoice page")
	public void click_on_sales_button_it_navigate_to_create_new_invoice_page() {
		SalesAction.click_on_add_sales_in_sales_summary();
		StepTracker.setCurrentStep("Click on Sales button it navigate to Create new Invoice page");
	}

	@Then("Verify the Create new Invoice page")
	public void verify_the_create_new_invoice_page() {
		SalesAction.VerifySalesPageTitile();
		StepTracker.setCurrentStep("Verify the Create new Invoice page");
	}

	@Then("Redirect to Sale dashboard")
	public void redirect_to_sale_dashboard() {
		SalesAction.ClickOnSales_dashboard();
	}

	@Then("Click on Coustomer button it navigate to Contact list page")
	public void click_on_coustomer_button_it_navigate_to_contact_list_page() {
		SalesAction.click_on_add_customer_in_sales_summary();
		StepTracker.setCurrentStep("Click on Coustomer button it navigate to Contact list page");
	}

	@Then("Verify the Contact list page")
	public void verify_the_contact_list_page() {
		SalesAction.VerifyContactListPageTitle();
		StepTracker.setCurrentStep("Verify the Contact list page");
	}

	@Then("Click on Quote button it navigate to Create New Quotation page")
	public void click_on_quote_button_it_navigate_to_create_new_quotation_page() {
		SalesAction.click_on_add_quote_in_sales_summary();
		StepTracker.setCurrentStep("Click on Quote button it navigate to Create New Quotation page");
	}

	@Then("Verify the Create New Quotation page")
	public void verify_the_create_new_quotation_page() {
		SalesAction.VerifyQuotationPageTitle();
		StepTracker.setCurrentStep("Verify the Create New Quotation page");
	}

	@Then("Click on All Sales link it navigate to Invoices page")
	public void click_on_all_sales_link_it_navigate_to_invoices_page() {
		HelperClass.ClickandAnyTypeofWebelemnt(
				By.xpath("//div[@class='text-left bottom_link']//a[normalize-space()='All Sales']"));
	}

	@Then("Verify the Invoices page")
	public void verify_the_invoices_page() {
		SalesAction.VerifyAllSalesLinkPageTitle();
		StepTracker.setCurrentStep("Verify the Invoices page");
	}

	@Then("Click on All Coustomer link it navigate to Contact list page")
	public void click_on_all_coustomer_link_it_navigate_to_contact_list_page() {
		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[normalize-space()='All Customer']"));
		StepTracker.setCurrentStep("Click on All Coustomer link it navigate to Contact list page");
	}

	@Then("Click on All Quote link in navigate to Qutations page")
	public void click_on_all_quote_link_in_navigate_to_qutations_page() {
		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[normalize-space()='All Quote']"));
		StepTracker.setCurrentStep("Click on All Quote link in navigate to Qutations page");
	}

	@Then("Verify the Qutations page")
	public void verify_the_qutations_page() {
		SalesAction.VerifyAllQuotesLinkPageTitle();
		StepTracker.setCurrentStep("Verify the Qutations page");
	}

	@Then("Verify Sales Chart dashboard")
	public void verify_sales_chart_dashboard() throws InterruptedException {
		SalesAction.ClickonSalesChartMinimize();
		Thread.sleep(3000);
		SalesAction.ClickonSalesChartMinimize();
		StepTracker.setCurrentStep("Verify Sales Chart dashboard");
	}

	@Then("Verify Debtors Chart dashboard")
	public void verify_debtors_chart_dashboard() throws InterruptedException {
		SalesAction.ClickOnDebtorsChartMinimize();
		Thread.sleep(3000);
		SalesAction.ClickOnDebtorsChartMinimize();
		StepTracker.setCurrentStep("Verify Debtors Chart dashboard");
	}

	@Then("Verify Links in Current Debtors list dashboard")
	public void verify_links_in_current_debtors_list_dashboard() throws InterruptedException {
		SalesAction.ClickOnCurrentDebtorsListMinimize();
		Thread.sleep(3000);
		SalesAction.ClickOnCurrentDebtorsListMinimize();
		StepTracker.setCurrentStep("Verify Links in Current Debtors list dashboard");
	}

	@Then("Click on All Debtors link it navigate to Debtors list page")
	public void click_on_all_debtors_link_it_navigate_to_debtors_list_page() {
		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[text()='All Debtors']"));
		StepTracker.setCurrentStep("Click on All Debtors link it navigate to Debtors list page");
	}

	@Then("Verify the Debtors list page")
	public void verify_the_debtors_list_page() {
		SalesAction.VerifyAllDebtorsPageTitle();
		StepTracker.setCurrentStep("Verify the Debtors list page");
	}

	@Then("Verify Links in Recent Sales list dashboard")
	public void verify_links_in_recent_sales_list_dashboard() throws InterruptedException {
		SalesAction.ClickonRecentSalesListMinimize();
		Thread.sleep(3000);
		SalesAction.ClickonRecentSalesListMinimize();
		StepTracker.setCurrentStep("Verify Links in Recent Sales list dashboard");
	}

	@Given("Click on All Sales link in Recent Sales list it navigate to Invoices page")
	public void click_on_all_sales_link_in_recent_sales_list_it_navigate_to_invoices_page() {
	   SalesAction.ClickOnAllSalesLinkInRecentSalesList();
	   StepTracker.setCurrentStep("Click on All Sales link in Recent Sales list it navigate to Invoices page");
	}
	
	@Given("Click on Invoices")
	public void click_on_invoices() {
		SalesAction.ClickOnInvoices();
		StepTracker.setCurrentStep("Click on Invoices");
	}

	@When("Click on New Invoice button")
	public void click_on_new_invoice_button() throws IOException, InterruptedException {
		// SalesAction.ClickAddNewInvoicebutton();
		StepTracker.setCurrentStep("Click on New Invoice button");
	}

	@When("Enter requried data for invoice")
	public void enter_requried_data_for_invoice() throws IOException, InterruptedException {
		SalesAction.ClickonAddSalesbtn();
		StepTracker.setCurrentStep("Enter requried data for invoice");
	}

	@When("Click on New Invoice dropdown")
	public void click_on_new_invoice_dropdown() throws InterruptedException {
		SalesAction.ClickOnNewInvoiceDropdown();
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Click on New Invoice dropdown");
	}

	@Then("Verify Each type of invoice in dropdown")
	public void verify_each_type_of_invoice_in_dropdown() throws InterruptedException {
		SalesAction.VerifyInvoiceDropdown();
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Verify Each type of invoice in dropdown");
	}

	@When("Click on Type dropdown")
	public void click_on_type_dropdown() throws InterruptedException {
		HelperClass.ClickUsingJS(driver, By.xpath("//select[@id='cboInvType']"));
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Click on Type dropdown");
	}

	@Then("Select Sales type and validate")
	public void select_sales_type_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "Sales");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Sales type and validate");
	}

	@Then("Select Credit Note and validate")
	public void select_credit_note_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "Cr. Note");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Credit Note and validate");
	}

	@Then("Select Draft and validate")
	public void select_draft_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "Draft");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Draft and validate");
	}

	@Then("Select Recurring and validate")
	public void select_recurring_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "Recurring");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Recurring and validate");
	}

	@Then("Select All and Validate")
	public void select_all_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboInvType']"), "All");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select All and Validate");
	}

	@When("Click on Status dropdown")
	public void click_on_status_dropdown() throws InterruptedException {
		HelperClass.ClickUsingJS(driver, By.xpath("//select[@id='cboStatusFilter']"));
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Click on Status dropdown");
	}

	@Then("Select Paid and validate")
	public void select_paid_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboStatusFilter']"), "Paid");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Paid and validate");
	}

	@Then("Select OutStanding and validate")
	public void select_out_standing_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboStatusFilter']"), "OutStanding");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select OutStanding and validate");
	}

	@Then("Select Overdue and validate")
	public void select_overdue_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboStatusFilter']"), "OverDue");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Overdue and validate");
	}

	@Then("Select Status All and validate")
	public void select_status_all_and_validate() throws InterruptedException {
		HelperClass.selectOptionByVisibleText(By.xpath("//select[@id='cboStatusFilter']"), "All");
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Select Status All and validate");
	}

	@When("Click on Export dropdown")
	public void click_on_export_dropdown() {
		SalesAction.ClickOnExport();
		StepTracker.setCurrentStep("Click on Export dropdown");

	}

	@Then("Select Export as PDF")
	public void select_export_as_pdf() throws InterruptedException {
		SalesAction.ClickOnExportPDF();
		StepTracker.setCurrentStep("Select Export as PDF");
	}

	@Then("Select Export as Excel")
	public void select_export_as_excel() throws InterruptedException {
		SalesAction.ClickOnExportExcel();
		StepTracker.setCurrentStep("Select Export as Excel");
	}

	@When("Click on Invoice Select Action dropdown")
	public void click_on_invoice_select_action_dropdown() throws InterruptedException {
		SalesAction.InvoiceActionDropdown();
		StepTracker.setCurrentStep("Click on Invoice Select Action dropdown");
	}

	@When("Select Edit Action and update the data")
	public void select_edit_action_and_update_the_data() throws InterruptedException, IOException {
		SalesAction.InvoiceEditOnlyAddItemRow();
		StepTracker.setCurrentStep("Select Edit Action and update the data");
	}

	@Then("Click on save and close invoice")
	public void click_on_save_and_close_invoice() {
		SalesAction.ClickSaveAndClose();
		StepTracker.setCurrentStep("Click on save and close invoice");
	}

	@When("Select Delete Action and validate")
	public void select_delete_action_and_validate() throws InterruptedException {
		SalesAction.InvoiceDelete();
		StepTracker.setCurrentStep("Select Delete Action and validate");
	}

	@When("Select Download doc Action")
	public void select_download_doc_action() throws InterruptedException {
		SalesAction.InvoiceDownloadDoc();
		StepTracker.setCurrentStep("Select Download doc Action");
	}

	@When("Select Download PDF Action")
	public void select_download_pdf_action() throws InterruptedException {
		SalesAction.InvoiceDownload_PDF();
		StepTracker.setCurrentStep("Select Download PDF Action");
	}

	@When("Select Attachments Action and attach a file")
	public void select_attachments_action_and_attach_a_file() throws InterruptedException, IOException {
		SalesAction.InvoiceAttachments();
		StepTracker.setCurrentStep("Select Attachments Action and attach a file");
	}

	@When("Select Email Action send email")
	public void select_email_action_send_email() throws InterruptedException {
		SalesAction.InvoiceEmail();
		StepTracker.setCurrentStep("Select Email Action send email");
	}

	@Then("Click on Quotations")
	public void click_on_quotations() {
		SalesAction.ClickQuotation();
		StepTracker.setCurrentStep("Click on Quotations");
	}

	@Then("Click on Add New Quotation button and Add Quotation")
	public void click_on_add_new_quotation_button_and_add_quotation() throws InterruptedException {
		SalesAction.ClickOnAddQuotation();
		StepTracker.setCurrentStep("Click on Add New Quotation button and Add Quotation");
	}

	@Then("Click on Quotation Select Action dropdown")
	public void click_on_quotation_select_action_dropdown() throws InterruptedException {
		SalesAction.InvoiceActionDropdown();
		StepTracker.setCurrentStep("Click on Quotation Select Action dropdown");

	}

	@Then("Click on Edit Quotation and update the data")
	public void click_on_edit_quotation_and_update_the_data() throws InterruptedException, IOException {
		SalesAction.editQuotationAndAddItemRow();
		StepTracker.setCurrentStep("Click on Edit Quotation and update the data");
	}

	@Then("Click on Delete Quotation and validate")
	public void click_on_delete_quotation_and_validate() throws InterruptedException {
		SalesAction.InvoiceDelete();
		StepTracker.setCurrentStep("Click on Delete Quotation and validate");
	}

	@Then("Click on Download PDF Quotation and validate")
	public void click_on_download_pdf_quotation_and_validate() throws InterruptedException {
		SalesAction.ClickOnQuotationPDF_download();
		StepTracker.setCurrentStep("Click on Download PDF Quotation and validate");
	}

	@Then("Click on Email Quotation and validate")
	public void click_on_email_quotation_and_validate() throws InterruptedException {
		SalesAction.InvoiceEmail();
		StepTracker.setCurrentStep("Click on Email Quotation and validate");
	}

	@Then("Click on Create invoice and validate")
	public void click_on_create_invoice_and_validate() {
		SalesAction.CreateInvoiceQuotation();
		StepTracker.setCurrentStep("Click on Create invoice and validate");
	}

	@When("Click on Recurring invoices")
	public void click_on_recurring_invoices() {
		SalesAction.ClickOnRecuringInvoices();
		StepTracker.setCurrentStep("Click on Recurring invoices");
	}

	@Then("Click on Add New Recuuring Invoice button and Add Recuuring Invoice")
	public void click_on_add_new_recuuring_invoice_button_and_add_recuuring_invoice() throws InterruptedException {
		SalesAction.ClickOnAddNewRecringInvoice();
		StepTracker.setCurrentStep("Click on Add New Recuuring Invoice button and Add Recuuring Invoice");
	}

	@Then("Click on Recurring Invoce select dropdown")
	public void click_on_recurring_invoce_select_dropdown() throws InterruptedException {
		SalesAction.InvoiceActionDropdown();
		StepTracker.setCurrentStep("Click on Recurring Invoce select dropdown");
	}

	@Then("Click on Edit Recurring Invoice and update the data")
	public void click_on_edit_recurring_invoice_and_update_the_data() {
		SalesAction.EditRecurringInvoiceAndUpdatedata();
		StepTracker.setCurrentStep("Click on Edit Recurring Invoice and update the data");
	}

	@Then("Click on Delete Recurring invoice")
	public void click_on_delete_recurring_invoice() throws InterruptedException {
		SalesAction.InvoiceDelete();
		StepTracker.setCurrentStep("Click on Delete Recurring invoice");
	}

	@When("Click on Receipts")
	public void click_on_receipts() {
    SalesAction.ClickOnReceipt();
    StepTracker.setCurrentStep("Click on Receipts");
	}

	@Then("Click on Add New Receipt and Add Receipt")
	public void click_on_add_new_receipt_and_add_receipt() throws InterruptedException {
   SalesAction.ClickAddNewReceipt();
   StepTracker.setCurrentStep("Click on Add New Receipt and Add Receipt");
	}
	
	@Then("Click on Receipts Select Action dropdown")
	public void click_on_receipts_select_action_dropdown() throws InterruptedException {
		SalesAction.InvoiceActionDropdown();
		StepTracker.setCurrentStep("Click on Receipts Select Action dropdown");
	}
	@Then("Click on Delete Receipt")
	public void click_on_delete_receipt() throws InterruptedException {
	   SalesAction.ReceiptDelete();
	   StepTracker.setCurrentStep("Click on Delete Receipt");
	}
	
	@Then("Click on Edit Receipts")
	public void click_on_edit_receipts() throws InterruptedException {
		SalesAction.ReceiptEditing();
		StepTracker.setCurrentStep("Click on Edit Receipts");
	}
	
	@Then("Click on Download PDF Receipts")
	public void click_on_download_pdf_receipts() {
		SalesAction.DownloadReceipts();
		StepTracker.setCurrentStep("Click on Download PDF Receipts");
	}


}
