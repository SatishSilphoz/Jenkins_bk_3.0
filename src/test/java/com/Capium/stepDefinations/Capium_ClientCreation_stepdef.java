package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Capium_ClientCreation_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_ClientCreation_stepdef {

	Capium_ClientCreation_Actions ClientCreat = new Capium_ClientCreation_Actions();

	@Given("client Create in Bookkeeping")
	public void client_create_in_bookkeeping() throws IOException, InterruptedException {
		ClientCreat.ClientCreation();
		StepTracker.setCurrentStep("client Create in Bookkeeping");
		Log.info("Successfully client Created in Bookkeeping");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Client Created Successfully");
	}

	@Then("Verify the client created or not")
	public void verify_the_client_created_or_not() throws IOException, InterruptedException {
		ClientCreat.verifyClientCreation();
    	StepTracker.setCurrentStep("Verify the client created or not");
		Log.info("Successfully Verified the client created or not");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Verifed client created or not");
		Thread.sleep(2000);
		//ClientCreat.Click_Selected_Client();

	}
}
