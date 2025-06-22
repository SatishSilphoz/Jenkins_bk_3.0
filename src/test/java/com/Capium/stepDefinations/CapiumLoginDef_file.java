package com.Capium.stepDefinations;


import com.Capium.Actions.Capium_Login_Actions;
import com.Capium.Utilies.ConfigReader;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CapiumLoginDef_file {
	
	Capium_Login_Actions loginpage=new Capium_Login_Actions();
	
//	@Given("Launch the browser")
//	public void launch_the_browser() {
//		System.out.println("Chrome Browser launched Sucessfully");
//		Reporter.log("Chrome Browser launched Sucessfully");
//		StepTracker.setCurrentStep("Launch the browser");
//		 Log.info("Launch browser successfully.");
//		 //Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "capture screenshot");
//	}
//
//	@Given("User need to enter the Application Url")
//	public void user_need_to_enter_the_application_url() {
//		 String url = ConfigReader.getProperty("app.url");
//		HelperClass.openPage(url);
//	    StepTracker.setCurrentStep("User need to enter the Application Url {string}");
//		Log.info("LRL entered successfully.");
//		//Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "capture screenshot");
//	}
//
//	@When("User Enter username and Password")
//	public void user_enter_username_and_password() {
//		
//		String username = ConfigReader.getProperty("username");
//        String password = ConfigReader.getProperty("password");
//		loginpage.EnterUsername(username);
//		loginpage.EnterPassword(password);
//		StepTracker.setCurrentStep("User Enter username is {string} and Password is {string}");
//		Log.info("Username and Password entered successfully.");
//		//Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "capture screenshot");
//	}
//
//	@Then("User Click on login button")
//	public void user_click_on_login_button() throws Exception {
//		loginpage.ClickLoginbtn();
//		StepTracker.setCurrentStep("User Click on login button");
//		Log.info("User Click on login button successfully.");
//	}
//
//	@Then("redirect to Bookkeeping module")
//	public void redirect_to_bookkeeping_module() {
//		loginpage.Navigate_to_bookkeeping_module();
//		StepTracker.setCurrentStep("redirect to Bookkeeping module");
//		Log.info("redirect to Bookkeeping module successfully.");
//		
//	}
//	@Then("Logout from application")
//	public void logout_from_application() {
//	  loginpage.Logout();
//	  StepTracker.setCurrentStep("Logout from application");
//	  //Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "capture screenshot");
//	   Log.info("Logout from application successfully.");
//	}
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		StepTracker.setCurrentStep("Launch the browser");
		Log.info("Launch browser successfully.");
	}

	@Given("User need to enter the Application Url")
	public void user_need_to_enter_the_application_url() {
		String url = ConfigReader.getProperty("app.url");
		HelperClass.openPage(url);
		 StepTracker.setCurrentStep("User need to enter the Application Url");		 
		 Log.info("LRL entered successfully.");
	}

	@When("User Enter username and Password")
	public void user_enter_username_and_password() {
		String username = ConfigReader.getProperty("username");
		String password = ConfigReader.getProperty("password");
		loginpage.EnterUsername(username);
		loginpage.EnterPassword(password);
		StepTracker.setCurrentStep("User Enter username and Password");
		Log.info("Username and Password entered successfully.");
		
	}

	@Then("User Click on login button")
	public void user_click_on_login_button() throws Exception {
		loginpage.ClickLoginbtn();
		StepTracker.setCurrentStep("User Click on login button");
		Log.info("User Click on login button successfully.");
	}

	@Then("redirect to Bookkeeping module")
	public void redirect_to_bookkeeping_module() {
		loginpage.Navigate_to_bookkeeping_module();
		StepTracker.setCurrentStep("redirect to Bookkeeping module");
		Log.info("redirect to Bookkeeping module successfully.");
	}


}
