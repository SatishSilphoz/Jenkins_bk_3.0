package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\Auto\\CapiumApplication\\Capium_BK_3.0\\src\\test\\resources\\Feature_CapiumPurchase\\CapiumLogin.feature",

		glue = { "com.Capium.stepDefinations" }, plugin = { "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true

                )
public class Capium_Login_runfile extends AbstractTestNGCucumberTests {

}
