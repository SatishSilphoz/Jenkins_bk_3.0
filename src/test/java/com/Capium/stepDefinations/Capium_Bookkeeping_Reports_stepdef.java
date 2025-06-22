package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Capium_Bookkeeping_Reports_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_Bookkeeping_Reports_stepdef {

	Capium_Bookkeeping_Reports_Actions Reports = new Capium_Bookkeeping_Reports_Actions();

	@Given("Validate Reports dashbaord")
	public void validate_reports_dashbaord() throws InterruptedException {
 
         Reports.ValidateReportsdashbaord();
		
		StepTracker.setCurrentStep("Validate Reports dashbaord");
	    Log.info("Validate Reports dashbaord");		
	}
 
	@Then("Verify adavance report of customer")
	public void verify_adavance_report_of_customer() throws InterruptedException, IOException {
 
      Reports.Verifyadavancereportofcustomer();
 
		StepTracker.setCurrentStep("Verify adavance report of customer");
	    Log.info("Validate Reports dashbaord");		
	}
 
	@Then("Verify adavance sales report of customer")
	public void verify_adavance_sales_report_of_customer() throws InterruptedException, IOException {
		
		Reports.Verifyadavancesalesreportofcustomer();
		
		
		StepTracker.setCurrentStep("Verify adavance sales report of customer");
	    Log.info("Verify adavance sales report of customer");		
	}
 
	@Then("Verify customer list of customer")
	public void verify_customer_list_of_customer() throws InterruptedException, IOException {
 
         Reports.Verifycustomerlistofcustomer();
		
		StepTracker.setCurrentStep("Verify customer list of customer");
	    Log.info("Verify customer list of customer");		
	}
 
	@Then("Verify customer ageing list of customer")
	public void verify_customer_ageing_list_of_customer() throws InterruptedException, IOException {
 
        Reports.Verifycustomerageinglistofcustomer();
		
		
		StepTracker.setCurrentStep("Verify customer ageing list of customer");
	    Log.info("Verify customer ageing list of customer");		
	}
 
	@Then("Verify transactions of customer")
	public void verify_transactions_of_customer() throws InterruptedException, IOException {
 
Reports.Verifytransactionsofcustomer();
		
		StepTracker.setCurrentStep("Verify transactions of customer");
	    Log.info("Verify transactions of customer");	
	}
 
	@Then("Verify ssales product list of customer")
	public void verify_ssales_product_list_of_customer() throws InterruptedException, IOException {
 
 
		Reports.Verifyssalesproductlistofcustomer();
		
		
		StepTracker.setCurrentStep("Verify ssales product list of customer");
	    Log.info("Verify ssales product list of customer");	
		
	}
 
	@Then("Verify customer receiepts of customer")
	public void verify_customer_receiepts_of_customer() throws InterruptedException, IOException {
 
 
		Reports.Verifycustomerreceieptsofcustomer();
		
		StepTracker.setCurrentStep("Verify customer receiepts of customer");
	    Log.info("Verify customer receiepts of customer");	
	}
 
	@Then("Verify debtors list of customer")
	public void verify_debtors_list_of_customer() throws InterruptedException, IOException {
 
       Reports.Verifydebtorslistofcustomer();
		
		StepTracker.setCurrentStep("Verify debtors list of customer");
	    Log.info("Verify debtors list of customer");	
		
	}
 
	@Then("Verify customer statement of customer")
	public void verify_customer_statement_of_customer() throws InterruptedException, IOException {
 
 
		Reports.Verifycustomerstatementofcustomer();
		
		StepTracker.setCurrentStep("Verify customer statement of customer");
	    Log.info("Verify customer statement of customer");	
	}
 
	@Then("Verify sales invoice list of customer")
	public void verify_sales_invoice_list_of_customer() throws InterruptedException, IOException {
 
         Reports.Verifysalesinvoicelistofcustomer();
		
		StepTracker.setCurrentStep("Verify sales invoice list of customer");
	    Log.info("Verify sales invoice list of customer");	
	}
 
	@Then("Verify adavance report of supplier")
	public void verify_adavance_report_of_supplier() throws InterruptedException, IOException {
 
        Reports.Verifyadavancereportofsupplier();
		
		StepTracker.setCurrentStep("Verify adavance report of supplier");
	    Log.info("Verify adavance report of supplier");	
	}
 
	@Then("Verify purchase report of supplier")
	public void verify_purchase_report_of_supplier() throws InterruptedException, IOException {
 
 
		Reports.Verifypurchasereportofsupplier();
		
		
		StepTracker.setCurrentStep("Verify purchase report of supplier");
	    Log.info("Verify purchase report of supplier");	
	}
 
	@Then("Verify supplier list of supplier")
	public void verify_supplier_list_of_supplier() throws InterruptedException, IOException {
 
 
		Reports.Verifysupplierlistofsupplier();
		
		
		StepTracker.setCurrentStep("Verify supplier list of supplier");
	    Log.info("Verify supplier list of supplier");	
	}
 
	@Then("Verify supplier ageing list of supplier")
	public void verify_supplier_ageing_list_of_supplier() throws InterruptedException, IOException {
 
     Reports.Verifysupplierageinglistofsupplier();
	
		StepTracker.setCurrentStep("Verify supplier ageing list of supplier");
	    Log.info("Verify supplier ageing list of supplierr");	
	}
 
	@Then("Verify transactions of supplier")
	public void verify_transactions_of_supplier() throws InterruptedException, IOException {
 
		Reports.Verifytransactionsofsupplier();
		
		StepTracker.setCurrentStep("Verify transactions of supplier");
	    Log.info("Verify transactions of supplier");	
	}
 
	@Then("Verify payement to supllier of supplier")
	public void verify_payement_to_supllier_of_supplier() throws InterruptedException, IOException {
 
      Reports.Verifypayementtosupllierofsupplier();
		
		StepTracker.setCurrentStep("Verify payement to supllier of supplier");
	    Log.info("Verify payement to supllier of supplier");	
	}
 
	@Then("Verify creditors list of supplier")
	public void verify_creditors_list_of_supplier() throws InterruptedException, IOException {
 
         Reports.Verifycreditorslistofsupplier();
		
		StepTracker.setCurrentStep("Verify creditors list of supplier");
	    Log.info("Verify creditors list of supplier");	
	}
 
	@Then("Verify supplier statement of supplier")
	public void verify_supplier_statement_of_supplier() throws InterruptedException, IOException {
 
      Reports.Verifysupplierstatementofsupplier();
		
		StepTracker.setCurrentStep("Verify supplier statement of supplier");
	    Log.info("Verify supplier statement of supplier");	
	}
 
	@Then("Verify purachase invoice list of supplier")
	public void verify_purachase_invoice_list_of_supplier() throws InterruptedException, IOException {
 
     Reports.Verifypurachaseinvoicelistofsupplier();
	
		StepTracker.setCurrentStep("Verify purachase invoice list of supplier");
	    Log.info("Verify purachase invoice list of supplier");	
	}
 
	@Then("Verify profit and loss of financials")
	public void verify_profit_and_loss_of_financials() throws InterruptedException, IOException {
 
 
		Reports.Verifyprofitandlossoffinancials();
		
		StepTracker.setCurrentStep("Verify profit and loss of financials");
	    Log.info("Verify profit and loss of financials");	
	}
 
	@Then("Verify balance sheet of financials")
	public void verify_balance_sheet_of_financials() throws InterruptedException, IOException {
		
		Reports.Verifybalancesheetoffinancials();
		
		StepTracker.setCurrentStep("Verify balance sheet of financials");
	    Log.info("Verify balance sheet of financials");
	}
 
	@Then("Verify trail balance of financials")
	public void verify_trail_balance_of_financials() throws InterruptedException, IOException {
 
		Reports.Verifytrailbalanceoffinancials();
	
		StepTracker.setCurrentStep("Verify trail balance of financials");
	    Log.info("Verify trail balance of financials");
	}
 
	@Then("Verify comparative reports of financials")
	public void verify_comparative_reports_of_financials() throws InterruptedException, IOException {
 
       Reports.Verifycomparativereportsoffinancials();
		
		StepTracker.setCurrentStep("Verify comparative reports of financials");
	    Log.info("Verify comparative reports of financials");
	}
 
	@Then("Verify budget reports of financials")
	public void verify_budget_reports_of_financials() throws InterruptedException, IOException {
 
         Reports.Verifybudgetreportsoffinancials();
		
		StepTracker.setCurrentStep("Verify budget reports of financials");
	    Log.info("Verify budget reports of financials");
	}
 
	@Then("Verify day book of financials")
	public void verify_day_book_of_financials() throws InterruptedException, IOException {
 
		Reports.Verifydaybookoffinancials();
		
		StepTracker.setCurrentStep("Verify day book of financials");
	    Log.info("Verify day book of financials");
	}
 
	@Then("Verify cashflow of financials")
	public void verify_cashflow_of_financials() throws InterruptedException, IOException {
 
		Reports.Verifycashflowoffinancials();
		
		StepTracker.setCurrentStep("Verify cashflow of financials");
	    Log.info("Verify cashflow of financials");
	}
 
	@Then("Verify recent of additonal")
	public void verify_recent_of_additonal() throws InterruptedException, IOException {
 
		Reports.Verifyrecentofadditonal();
		
		StepTracker.setCurrentStep("Verify recent of additonal");
	    Log.info("Verify recent of additonal");
	}
 
	@Then("Verify account details additonal")
	public void verify_account_details_additonal() throws InterruptedException, IOException {
 
		Reports.Verifyaccountdetailsadditonal();
		
		StepTracker.setCurrentStep("Verify account details additonal");
	    Log.info("Verify account details additonal");
	}
 
	@Then("Verify nominal ledger additonal")
	public void verify_nominal_ledger_additonal() throws InterruptedException, IOException {
 
        Reports.Verifynominalledgeradditonal();
		
		StepTracker.setCurrentStep("Verify nominal ledger additonal");
	    Log.info("Verify nominal ledger additonal");
	}
 
	@Then("Verify cash and report additonal")
	public void verify_cash_and_report_additonal() throws InterruptedException, IOException {
 
     Reports.Verifycashandreportadditonal();
	
		StepTracker.setCurrentStep("Verify cash and report additonal");
	    Log.info("Verify cash and report additonal");
	}

}
