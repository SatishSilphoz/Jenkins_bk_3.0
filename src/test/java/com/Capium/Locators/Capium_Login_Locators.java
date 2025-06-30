package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Login_Locators {

	@FindBy(xpath = "//input[@id='txtusernameee']")
	@CacheLookup
	public WebElement inputUsername;

	@FindBy(xpath = "//input[@id='txtpassword']")
	@CacheLookup
	public WebElement inputPassword;

	@FindBy(xpath = "//button[@id='btnLogin']")
	@CacheLookup
	public WebElement btnLogin;

	@FindBy(xpath = "//h1")
	@CacheLookup
	public WebElement Headingtag;

	@FindBy(xpath = "//a[@title='Modules']")
	@CacheLookup
	public WebElement C_icon_inside_modules;

	@FindBy(xpath = "//div[text()='Bookkeeping']")
	@CacheLookup
	public WebElement Bookkeeping_Module;

	@FindBy(xpath = "//div[text()='Accounts Production']")
	@CacheLookup
	public WebElement AccountsProduction_Module;

	@FindBy(xpath = "//div[text()='Corporation Tax']")
	@CacheLookup
	public WebElement CorporationTax_Module;

	@FindBy(xpath = "//div[text()='Self Assessment']")
	@CacheLookup
	public WebElement SelfAssessment_Module;

	@FindBy(xpath = "//div[text()='Payroll']")
	@CacheLookup
	public WebElement Payroll_Module;

	@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
	@CacheLookup
	public WebElement Homepage_Element;

	

	@FindBy(xpath = "//a/h6[contains(text(),'Bookkeeping')]")
	@CacheLookup
	public WebElement Homepage_BK_module;
	
	@FindBy(xpath="//i[@class='icon fa fa-power-off']")
	@CacheLookup
	public WebElement Logout_element;
	
	@FindBy(xpath="//div[@class='profile-logo']//label")
	@CacheLookup
	public WebElement Logo_in_homepage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	public WebElement Logout_inside_logo;
 
}
