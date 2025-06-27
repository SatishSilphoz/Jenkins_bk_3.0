package com.Capium.Utilies;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentService;

public class ExtentReportWithProperties {

	 public static void main(String[] args) {
	        // Load ExtentReports using properties file
	        ExtentReports extent = ExtentService.getInstance();

	        // Create a test case in the report
	        ExtentTest test = extent.createTest("Login Test", "Validating user login functionality");

	       
	        test.log(Status.INFO, "User navigated to login page.");
	        test.log(Status.PASS, "Login successful.");
	        test.log(Status.FAIL, "Login failed due to invalid credentials.");
	        test.log(Status.WARNING, "User attempted too many failed logins.");
	        test.log(Status.SKIP, "Skipping password reset test case.");

	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tested By", "Anwar");
	        System.out.println("Extent Report logs printed successfully.");
	        extent.flush();
	    }
	
}
