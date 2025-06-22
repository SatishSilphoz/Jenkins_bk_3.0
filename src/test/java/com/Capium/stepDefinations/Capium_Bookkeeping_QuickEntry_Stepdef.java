package com.Capium.stepDefinations;

import com.Capium.Actions.Capium_Bookkeeping_QuickEntery_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_Bookkeeping_QuickEntry_Stepdef {

	Capium_Bookkeeping_QuickEntery_Actions quickentryaction = new Capium_Bookkeeping_QuickEntery_Actions();

	@Given("Click on QuickEntry and verify QuickEntry page")
	public void click_on_quick_entry_and_verify_quick_entry_page() throws InterruptedException {
		quickentryaction.ClickQuickentry();
		StepTracker.setCurrentStep("Click on QuickEntry and verify QuickEntry page");
		Log.info("Click on QuickEntry and verify QuickEntry page");

	}

	@Given("Click on Add QuickEntry and verify Add Quick Entry page")
	public void click_on_add_quick_entry_and_verify_add_quick_entry_page() throws InterruptedException {
		quickentryaction.ClickAddQuickentry();

		StepTracker.setCurrentStep("Click on Add QuickEntry and verify Add Quick Entry page");
		Log.info("Click on Add QuickEntry and verify Add Quick Entry page");

	}

	@When("Add Receipt type QuickEntry and verify")
	public void add_receipt_type_quick_entry_and_verify() throws InterruptedException {
		quickentryaction.createReceiptEntry();
		StepTracker.setCurrentStep("Add Receipt type QuickEntry and verify");
		Log.info("Add Receipt type QuickEntry and verify");
	}

	@When("Add Payment type QuickEntry and verify")
	public void add_payment_type_quick_entry_and_verify() throws InterruptedException {
		quickentryaction.createPaymentEntry();
		StepTracker.setCurrentStep("Add Payment type QuickEntry and verify");
		Log.info("Add Payment type QuickEntry and verify");
	}

	@When("Click Edit on Existing QuickEntry")
	public void click_edit_on_existing_quick_entry() {
		quickentryaction.ClickOnEdit();
		StepTracker.setCurrentStep("Click Edit on Existing QuickEntry");
		Log.info("Click Edit on Existing QuickEntry");
	}

	@Then("Add row and enter data")
	public void add_row_and_enter_data() throws InterruptedException {
		quickentryaction.editAndAddQuickEntryRow();
		StepTracker.setCurrentStep("Add row and enter data");
		Log.info("Add row and enter data");
	}

	@Then("Click on Delete Row")
	public void click_on_delete_row() {
		quickentryaction.DeleteRow();;
		StepTracker.setCurrentStep("Click on Delete Row");
		Log.info("Click on Delete Row");
	}

	@Then("Verify Conformatiom message and Click on Ok")
	public void verify_conformatiom_message_and_click_on_ok() throws InterruptedException {
		quickentryaction.VerifyConfirmationMsg();
		StepTracker.setCurrentStep("Verify Conformatiom message and Click on Ok");
		Log.info("Verify Conformatiom message and Click on Ok");
	}

	@When("Click on Save and New button")
	public void click_on_save_and_new_button() throws InterruptedException {
		quickentryaction.ClickOnsaveAndNew();
		Log.info("Click on Save and New button");
		StepTracker.setCurrentStep("Click on Save and New button");
	}

	@Then("Enter the data click on save and close")
	public void enter_the_data_click_on_save_and_close() throws InterruptedException {
		quickentryaction.createReceiptEntry();
		StepTracker.setCurrentStep("Enter the data click on save and close");
		Log.info("Enter the data click on save and close");
	}

	@When("Go to Action dropdown and click on PDF download")
	public void go_to_action_dropdown_and_click_on_pdf_download() {
		quickentryaction.ClickOnPDFDownload();
		StepTracker.setCurrentStep("Go to Action dropdown and click on PDF download");
		Log.info("Go to Action dropdown and click on PDF download");
	}

	@When("Click on Delete option in Action dropdown")
	public void click_on_delete_option_in_action_dropdown() {
		quickentryaction.ClickOnDelete();
		Log.info("Click on Delete option in Action dropdown");
		StepTracker.setCurrentStep("Click on Delete option in Action dropdown");
	}

}
