package com.Capium.stepDefinations;

import java.awt.AWTException;
import java.io.IOException;

import com.Capium.Actions.Capium_Bookkeeping_Bank_Actions;
import com.Capium.Actions.Capium_ClientCreation_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_Bookkeeping_Bank_stepdef {
	
	Capium_Bookkeeping_Bank_Actions bankactions=new Capium_Bookkeeping_Bank_Actions();
	Capium_ClientCreation_Actions client=new Capium_ClientCreation_Actions();
	
	@Given("Verify bank dashboard")
	public void verify_bank_dashboard() throws InterruptedException {
 
        bankactions.Verifybankdashboard();
		
		StepTracker.setCurrentStep("Verify bank dashboard");
		Log.info("Verify bank dashboard");	
	}
 
	@Then("Click on bank and verify bank page")
	public void click_on_bank_and_verify_bank_page() throws InterruptedException {
 
		 bankactions.Verifybankdashboard();
		 bankactions.Clickonbankandverifybankpage();
		
		StepTracker.setCurrentStep("Click on bank and verify bank page");
		Log.info("Click on bank and verify bank page");	
	}
 
	@Then("Enter valide credtentials and save bank")
	public void enter_valide_credtentials_and_save_bank() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		 bankactions.Clickonbankandverifybankpage();
		 bankactions.Entervalidecredtentialsandsavebank();
		
		StepTracker.setCurrentStep("Enter valide credtentials and save bank");
		Log.info("Enter valide credtentials and save bank");	
	}
 
	@Then("Click and verify the bank which we created")
	public void click_and_verify_the_bank_which_we_created() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		
		StepTracker.setCurrentStep("Click and verify the bank which we created");
		Log.info("Click and verify the bank which we created");	
	}
 
	@Then("Click on manual import and enter mandatory details and saveandclose")
	public void click_on_manual_import_and_enter_mandatory_details_and_saveandclose() throws InterruptedException {
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonmanualimportandentermandatorydetailsandsaveandclose();
 
		
		StepTracker.setCurrentStep("Click on manual import and enter mandatory details and saveandclose");
		Log.info("Click on manual import and enter mandatory details and saveandclose");	
	}
 
	@Then("Click on manual import and enter mandatory details and saveandnew")
	public void click_on_manual_import_and_enter_mandatory_details_and_saveandnew() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonmanualimportandentermandatorydetailsandsaveandnew();
		
		StepTracker.setCurrentStep("Click on manual import and enter mandatory details and saveandnew");
		Log.info("Click on manual import and enter mandatory details and saveandnew");	
	}
 
	@Then("Click on manual import and enter mandatory details and add row")
	public void click_on_manual_import_and_enter_mandatory_details_and_add_row() throws InterruptedException {
 
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonmanualimportandentermandatorydetailsandaddrow();
		
		StepTracker.setCurrentStep("Click on manual import and enter mandatory details and add row");
		Log.info("Click on manual import and enter mandatory details and add row");	
	}
 
	@Then("Click on bank import and import banks using excelfile")
	public void click_on_bank_import_and_import_banks_using_excelfile() throws InterruptedException, AWTException, IOException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonbankimportandimportbanksusingexcelfile();
		
		
		StepTracker.setCurrentStep("Click on bank import and import banks using excelfile");
		Log.info("Click on bank import and import banks using excelfile");	
	}
 
	@Then("Click on quickentry and ennter all mandatory details and save")
	public void click_on_quickentry_and_ennter_all_mandatory_details_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonquickentryandennterallmandatorydetailsandsave();
		
		StepTracker.setCurrentStep("Click on quickentry and ennter all mandatory details and save");
		Log.info("Click on quickentry and ennter all mandatory details and save");	
	}
 
	@Then("Click on journals and ennter all mandatory details and save")
	public void click_on_journals_and_ennter_all_mandatory_details_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonjournalsandennterallmandatorydetailsandsave();
		
		StepTracker.setCurrentStep("Click on journals and ennter all mandatory details and save");
		Log.info("Click on journals and ennter all mandatory details and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in directpayment and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_directpayment_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsindirectpaymentandsave();
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in directpayment and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in directpayment and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in supplieraccount and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_supplieraccount_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsinsupplieraccountandsave();
		
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in directpayment and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in directpayment and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in transfer and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_transfer_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsintransferandsave();
		
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in transfer and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in transfer and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in new purchase and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_new_purchase_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsinnewpurchaseandsave();
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in new purchase and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in new purchase and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in customer account and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_customer_account_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsincustomeraccountandsave();
		
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in customer account and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in customer account and save");	
	}
 
	@Then("Click on actiondropdown and ennter all mandatory details in direct recipet and save")
	public void click_on_actiondropdown_and_ennter_all_mandatory_details_in_direct_recipet_and_save() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Clickonactiondropdownandennterallmandatorydetailsindirectrecipetandsave();
		
		StepTracker.setCurrentStep("Click on actiondropdown and ennter all mandatory details in direct recipet and save");
		Log.info("Click on actiondropdown and ennter all mandatory details in direct recipet and save");	
	}
 
	@Then("Validate refund functionality in action dropdown")
	public void validate_refund_functionality_in_action_dropdown() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Validaterefundfunctionalityinactiondropdown();
		
		
		StepTracker.setCurrentStep("Validate refund functionality in action dropdown");
		Log.info("Validate refund functionality in action dropdown");	
	}
 
	@Then("Validate exports pdf or excel")
	public void validate_exports_pdf_or_excel() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Validateexportspdforexcel();
		
		
		StepTracker.setCurrentStep("Validate exports pdf or excel");
		Log.info("Validate exports pdf or excel");	
	}
 
	@Then("Validate delete from aaction dropdown")
	public void validate_delete_from_aaction_dropdown() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickandverifythebankwhichwecreated();
		bankactions.Validatedeletefromaactiondropdown();
		
		
		StepTracker.setCurrentStep("Validate delete from aaction dropdown");
		Log.info("Validate delete from aaction dropdown");	
	}
 
	@Then("Click on bank transfer and verify page")
	public void click_on_bank_transfer_and_verify_page() throws InterruptedException {
		
		bankactions.Verifybankdashboard();
		bankactions.Clickonbanktransferandverifypage();
		
		StepTracker.setCurrentStep("Click on bank transfer and verify page");
		Log.info("Click on bank transfer and verify page");	
	}
 
	@Then("Click on bank transfer enter mandatory details")
	public void click_on_bank_transfer_enter_mandatory_details() throws InterruptedException {
 
		bankactions.Verifybankdashboard();
		bankactions.Clickonbanktransferentermandatorydetails();		
		StepTracker.setCurrentStep("Click on bank transfer and verify page");
		Log.info("Click on bank transfer and verify page");	
	}
}


