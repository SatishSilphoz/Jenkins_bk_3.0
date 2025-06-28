package com.Capium.stepDefinations;

import java.text.ParseException;

import com.Capium.Actions.Capium_Bookkeeping_Contacts_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_BookkeepingContacts_stepdef {

	Capium_Bookkeeping_Contacts_Actions contactactions = new Capium_Bookkeeping_Contacts_Actions();

	@Given("Click on Contacts")
	public void click_on_contacts() throws InterruptedException {
	    contactactions.Clickcontactpage();
	    StepTracker.setCurrentStep("Click on Contacts");
	    Log.info("Click on Contacts");
	    
	}

	@When("Click on Customers")
	public void click_on_customers() {
	    contactactions.ClickOnCustomer();
	    StepTracker.setCurrentStep("Click on Customers");
	    Log.info("Click on Customers");
	}

	@When("Click on Add Coustomer enter required fields click on save")
	public void click_on_add_coustomer_enter_required_fields_click_on_save() throws InterruptedException {
		contactactions.ClickOnAddCustomer();
	   contactactions.EnterCustomerdataandclickOnSave();
	   StepTracker.setCurrentStep("Click on Add Coustomer enter required fields click on save");
	   Log.info("Click on Add Coustomer enter required fields click on save");
	}

	@Then("Validate Coustomer Created or not")
	public void validate_coustomer_created_or_not() throws InterruptedException {
	    contactactions.ValidateCustomerCreatedorNot();
	    StepTracker.setCurrentStep("Validate Coustomer Created or not");
	    Log.info("Validate Coustomer Created or not");
	}

	@Then("Click on Export button")
	public void click_on_export_button() throws InterruptedException {
	    contactactions.ClickOnExport();
	    StepTracker.setCurrentStep("Click on Export button");
	    Log.info("Click on Export button");
	}

	@Then("Click on as PDF")
	public void click_on_as_pdf() {
	   contactactions.ClickAsPDFExport();
	   StepTracker.setCurrentStep("Click on as PDF");
	   Log.info("Click on as PDF");
	}

	@Then("Click on as Excel")
	public void click_on_as_excel() {
	    contactactions.ClickAsExcelExport();
	    StepTracker.setCurrentStep("Click on as Excel");
	    Log.info("Click on as Excel");
	}

	@When("Click on Supplier")
	public void click_on_supplier() {
	    contactactions.ClickOnSupplier();
	    StepTracker.setCurrentStep("Click on Supplier");
	    Log.info("Click on Supplier");
	}

	@When("Click on Add Supplier enter required fields click on save")
	public void click_on_add_supplier_enter_required_fields_click_on_save() throws InterruptedException {
	    contactactions.ClickOnAddSupplierButton();
	    contactactions.EnterSupplierDetailsClickSave();
	    StepTracker.setCurrentStep("Click on Add Supplier enter required fields click on save");
	    Log.info("Click on Add Supplier enter required fields click on save");
	}

	@Then("Validate Supplier Created or not")
	public void validate_supplier_created_or_not() throws InterruptedException {
	    contactactions.ValidateSupplierCreatedorNot();
	    StepTracker.setCurrentStep("Validate Supplier Created or not");
	    Log.info("Validate Supplier Created or not");
	}

	@When("Click on Directors")
	public void click_on_directors() {
	    contactactions.ClickOnDirectors();
	    StepTracker.setCurrentStep("Click on Directors");
	    Log.info("Click on Directors");
	}

	@When("Click on Add Director enter required fields click on save")
	public void click_on_add_director_enter_required_fields_click_on_save() throws InterruptedException, ParseException {
	    contactactions.ClickOnAddDirectorbutton();
	    contactactions.EnterDirectorDetailsClickSave();
	    StepTracker.setCurrentStep("Click on Add Director enter required fields click on save");
	    Log.info("Click on Add Director enter required fields click on save");
	}

	@Then("Validate Director Created or not")
	public void validate_director_created_or_not() throws InterruptedException {
	   contactactions.ValidateDirectorCreatedorNot();
	   StepTracker.setCurrentStep("Validate Director Created or not");
	   Log.info("Validate Director Created or not");
	}
	
	@Then("Click on Directors Export button")
	public void click_on_directors_export_button() throws InterruptedException {
		contactactions.DirectorExport();
		StepTracker.setCurrentStep("Click on Directors Export button");
		Log.info("Click on Directors Export button");
	}

	@Given("Click on Shareholder")
	public void click_on_shareholder() {
	    contactactions.ClickOnShareholder();
	    StepTracker.setCurrentStep("Click on Shareholder");
	    Log.info("Click on Shareholder");
	}

	@When("Click on Add Shareholder enter required fields click on save")
	public void click_on_add_shareholder_enter_required_fields_click_on_save() throws InterruptedException {
	    contactactions.ClickAddShareholderButton();
	    contactactions.EnterShareholderDetailsClickSave();
	    StepTracker.setCurrentStep("Click on Add Shareholder enter required fields click on save");
	    Log.info("Click on Add Shareholder enter required fields click on save");
	}

	@Then("Validate Shareholder Created or not")
	public void validate_shareholder_created_or_not() throws InterruptedException {
	   contactactions.ValidateShareholderCreatedorNot();
	   StepTracker.setCurrentStep("Validate Shareholder Created or not");
	   Log.info("Validate Shareholder Created or not");
	}
}
