package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Capium.Actions.Capium_Bookkeeping_Task_Actions;
import com.Capium.Actions.Capium_ClientCreation_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_Bookkeeping_Task_Stepdef {

	Capium_Bookkeeping_Task_Actions Task = new Capium_Bookkeeping_Task_Actions();
	Capium_ClientCreation_Actions client = new Capium_ClientCreation_Actions();

	@Given("Navigate to Tasks section")
	public void navigate_to_tasks_section() throws IOException, InterruptedException {
		client.verifyClientCreation();
		//client.Click_Selected_Client();
		Task.ClickOnTask();
		StepTracker.setCurrentStep("Navigate to Tasks section");
	}

	@Given("Click on Journals")
	public void click_on_journals() {
		Task.ClickOnJournals();
		StepTracker.setCurrentStep("Click on Journals");
	}

	@When("Click on Add New journal")
	public void click_on_add_new_journal() throws IOException, InterruptedException {
		Task.AddNewJournalbtn();
		StepTracker.setCurrentStep("Click on Add New journal");
	}

	@When("Enter the data requried for journals")
	public void enter_the_data_requried_for_journals() throws IOException, InterruptedException {
		Task.ClickOnAddJournalAndEnterdata();
		StepTracker.setCurrentStep("Enter the data requried for journals");

	}

	@Then("Click on Save and Close")
	public void click_on_save_and_close() throws InterruptedException {
		Task.SaveandClose();
		StepTracker.setCurrentStep("Click on Save and Close");
	}

	@When("Click on Select Action dropdown in journals")
	public void click_on_select_action_dropdown_in_journals() {
		Task.ClickOnActionDropdown();
		StepTracker.setCurrentStep("Click on Select Action dropdown in journals");

	}

	@When("Click on Journal Edit")
	public void click_on_journal_edit() {
		Task.ClickOnEdit();
		StepTracker.setCurrentStep("Click on Journal Edit");
	}

	@When("Add rows to the journal and verify the total debit and credit matching")
	public void add_rows_to_the_journal_and_verify_the_total_debit_and_credit_matching() throws InterruptedException {
		Task.addRowsInEditedJournalAndBalance();
		StepTracker.setCurrentStep("Add rows to the journal and verify the total debit and credit matching");
	}

	@When("UnTick the checkbox Including VAT")
	public void un_tick_the_checkbox_including_vat() {
		Task.TickIncludingVATCheckbox();
		StepTracker.setCurrentStep("UnTick the checkbox Including VAT");
	}

	@When("Click on Delete")
	public void click_on_delete() {
		Task.ClickOnDelete();
		StepTracker.setCurrentStep("Click on Delete");
	}

	@Then("Verify the Delete Confirmation message and click on OK button")
	public void verify_the_delete_confirmation_message_and_click_on_ok_button() {
		Task.VerifyDeleteConfirmationMessage();
		StepTracker.setCurrentStep("Verify the Delete Confirmation message and click on OK button");
	}

	@Then("Click on PDF")
	public void click_on_pdf() throws IOException {
		Task.verifyPDFDownload();
		StepTracker.setCurrentStep("Click on PDF");
	}

	@Then("Click on Excel")
	public void click_on_excel() throws IOException {
		Task.verifyExcelDownload();
		StepTracker.setCurrentStep("Click on Excel");
	}

	@Then("Click on Copy")
	public void click_on_copy() throws InterruptedException {
		Task.verifyJournalCopied();
		StepTracker.setCurrentStep("Click on Copy");
	}

	@When("Click on Budgeting")
	public void click_on_budgeting() {
		Task.ClickOnBudgeting();
		StepTracker.setCurrentStep("Click on Budgeting");
	}

	@When("Click on Add New Budget")
	public void click_on_add_new_budget() throws Exception {
		Task.addBudgetsForPeriods();
		StepTracker.setCurrentStep("Click on Add New Budget");
	}

	@Then("Verify the all Budgeting periods")
	public void verify_the_all_budgeting_periods() {
		Task.verifyAllBudgetingPeriodsCreated();
		StepTracker.setCurrentStep("Verify the all Budgeting periods");
	}

	@When("Click on Action dropdown")
	public void click_on_action_dropdown() {
		Task.ClickOnActionDropdown();
		StepTracker.setCurrentStep("Click on Action dropdown");
	}

	@Given("Click on Add New Budget and Create Budgeting for different periods")
	public void click_on_add_new_budget_and_create_budgeting_for_different_periods() throws Exception {
		Task.addBudgetsForPeriods();
		StepTracker.setCurrentStep("Click on Add New Budget and Create Budgeting for different periods");
	}

	@Then("Click on Edit Action")
	public void click_on_edit_action() {
		Task.ClickOnEdit();
		StepTracker.setCurrentStep("Click on Edit Action");
	}

	@Then("Update the data by adding include")
	public void update_the_data_by_adding_include() throws Exception {
		Task.performBudgetingEditAndInclude();
		StepTracker.setCurrentStep("Update the data by adding include");
	}

	@Then("Click on Delete Action")
	public void click_on_delete_action() {
		Task.ClickOnDelete();
		StepTracker.setCurrentStep("Click on Delete Action");
	}

	@When("Click on Dividends")
	public void click_on_dividends() {
		Task.ClickOnDividends();
		StepTracker.setCurrentStep("Click on Dividends");
	}

	@When("Add Dividends")
	public void add_dividends() throws InterruptedException {
		Task.ClcikOnAddDividensButton();
		StepTracker.setCurrentStep("Add Dividends");
	}

	@When("Add Shareholder and enter required data")
	public void add_shareholder_and_enter_required_data() throws InterruptedException {
		Task.AddDividends();
		StepTracker.setCurrentStep("Add Shareholder and enter required data");
	}

	@Then("Click on Save")
	public void click_on_save() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Save']"));
		Thread.sleep(2000);
		StepTracker.setCurrentStep("Click on Save");
	}

	@When("Click on Filetr by dropdown")
	public void click_on_filetr_by_dropdown() {
		Task.ClickOnFilterByDropdown();
		StepTracker.setCurrentStep("Click on Filetr by dropdown");
	}

	@Then("Validate each value in dropdown")
	public void validate_each_value_in_dropdown() {
		Task.VerifyFilterByShareHolder();
		StepTracker.setCurrentStep("Validate each value in dropdown");
	}
	
	@Then("Search for dividends")
	public void search_for_dividends() throws InterruptedException {
		Task.SeachDividends();
		StepTracker.setCurrentStep("Search for dividends");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Dividends scrrenshot");
	}

	@Then("Click on BulkEdit")
	public void click_on_bulk_edit() throws InterruptedException {
		Task.ClickOnBulkEdit();
		StepTracker.setCurrentStep("Click on BulkEdit");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "BulkEdit scrrenshot");

	}

}
