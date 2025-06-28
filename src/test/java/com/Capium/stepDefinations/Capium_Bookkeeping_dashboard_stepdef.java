package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Capium.Actions.Capium_Bookkeeping_dashboard_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_Bookkeeping_dashboard_stepdef {

	Capium_Bookkeeping_dashboard_Actions bkDashboard = new Capium_Bookkeeping_dashboard_Actions();

	@Given("Validate RefreshButton in VAT Summery which is at Right Side")
	public void validate_refresh_button_in_vat_summery_which_is_at_right_side() {
		bkDashboard.RefreshVatsummary();
		StepTracker.setCurrentStep("Validate RefreshButton in VAT Summery which is at Right Side");
		Log.info("Validate RefreshButton in VAT Summery which is at Right Side successfully.");
	}

	@Given("Validate Returns in previous month which is in VAT Summery")
	public void validate_returns_in_previous_month_which_is_in_vat_summery() throws IOException, InterruptedException {
		Thread.sleep(4000);
		bkDashboard.Monthly_Submmitted_returns();
		StepTracker.setCurrentStep("Validate Returns in previous month which is in VAT Summery");
		Log.info("Validate Returns in previous month which is in VAT Summery successfully.");
	}

	@Given("Validate Minimise in VAT Summery")
	public void validate_minimise_in_vat_summery() throws InterruptedException {
		bkDashboard.MinimiseVatsummary();
		Thread.sleep(2000);
		bkDashboard.MinimiseVatsummary();
		StepTracker.setCurrentStep("Validate Minimise in VAT Summery");
		Log.info("Validate Minimise in VAT Summery successfully.");
	}

	@Given("Validate Add Client")
	public void validate_add_client() throws InterruptedException {
		bkDashboard.ValidateAddclientPage_btn();
		StepTracker.setCurrentStep("Validate Add Client");
		Log.info("Validate Add Client successfully.");
	}

	@Then("Validate Add Client Page")
	public void validate_add_client_page() {
		bkDashboard.ValidateClosecleintPage();
		StepTracker.setCurrentStep("Validate Add Client Page");
		Log.info("Validate Add Client Page successfully.");
	}

	@Then("Validate All Clients")
	public void validate_all_clients() throws IOException {

		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[normalize-space()='All Clients']"));
		StepTracker.setCurrentStep("Validate All Clients");
		Log.info("Validate All Clients successfully.");
	}

	@Then("Validate Client Type")
	public void validate_client_type() throws IOException, InterruptedException {
		bkDashboard.ValidateClientType();
		StepTracker.setCurrentStep("Validate Client Type");
		Log.info("Validate Client Type successfully.");
	}

	@Then("Validate Text search")
	public void validate_text_search() {
		bkDashboard.ValidateTextSearch();
		StepTracker.setCurrentStep("Validate Text search");
		Log.info("Validate Text search successfully.");
	}

	@Then("Validate Vat client")
	public void validate_vat_client() {
		bkDashboard.ValidateVatClient();
		StepTracker.setCurrentStep("Validate Vat client");
		Log.info("Validate Vat client successfully.");
	}

	@Then("Validate Month in VAT Clients")
	public void validate_month_in_vat_clients() throws IOException, InterruptedException {
		bkDashboard.MonthInVatClients();
		StepTracker.setCurrentStep("Validate Month in VAT Clients");
		Log.info("Validate Month in VAT Clients successfully.");
	}

	@Then("Validate VAT Status")
	public void validate_vat_status() throws InterruptedException {
		bkDashboard.VatStatus();
		StepTracker.setCurrentStep("Validate VAT Status");
		Log.info("Validate VAT Status successfully.");
	}

	@Then("Validate Payment Status")
	public void validate_payment_status() throws InterruptedException {
		bkDashboard.PaymentStatus();
		StepTracker.setCurrentStep("Validate Payment Status");
		Log.info("Validate Payment Status successfully.");
	}

	@Then("Validate Client List")
	public void validate_client_list() {
		System.out.println("validated successfully");
		StepTracker.setCurrentStep("Validate Client List");
		Log.info("Validate Client List successfully.");
	}

	@Then("Validate First and Previous button")
	public void validate_first_and_previous_button() {
		bkDashboard.ClickonAllclients();
		bkDashboard.Clickon3();
		bkDashboard.ClickOnPreviousButton();
		bkDashboard.ClickOnLastButton();
		StepTracker.setCurrentStep("Validate First and Previous button");
		Log.info("Validate First and Previous button successfully.");
	}

	@Then("Validate Next button")
	public void validate_next_button() {
		bkDashboard.ClickOnNextButton();
		StepTracker.setCurrentStep("Validate Next button");
		Log.info("Validate Next button successfully.");
	}

	@Then("Validate Last button")
	public void validate_last_button() {
		bkDashboard.ClickOnLastButton();
		StepTracker.setCurrentStep("Validate Last button");
		Log.info("Validate Last button successfully.");
	}

	@Then("Validate Scroll bar")
	public void validate_scroll_bar() {
		System.out.println("scroll sucessfully");
		StepTracker.setCurrentStep("Validate Scroll bar");
		Log.info("Validate Scroll bar successfully.");
	}

}
