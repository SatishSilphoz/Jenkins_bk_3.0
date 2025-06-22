package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Contacts_locators {
	
	@FindBy(xpath = "(//a[@class='menu-dropdown'])[5]")
	@CacheLookup
	public WebElement Contacts;
	
	@FindBy(xpath = "//a[text()='Customers']")
	@CacheLookup
	public WebElement Customers;
	
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
	@CacheLookup
	public WebElement Addcustomer;
	
	@FindBy(xpath = "(//div[@class='pull-left']/a)[1]")
	@CacheLookup
	public WebElement Addsupplier;
	
	@FindBy(xpath = "//span[text()='Director']")
	@CacheLookup
	public WebElement Adddirector;
	
	@FindBy(xpath = "//span[text()='Shareholder']")
	@CacheLookup
	public WebElement Addshereholder;
	
	@FindBy(xpath = "//input[@id='txtName']")
	@CacheLookup
	public WebElement Contactname;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement ContactSave;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement SupplierSave;
	
	@FindBy(xpath = "//input[@id='txtName']")
	@CacheLookup
	public WebElement Suppliername;
	
	@FindBy(xpath = "(//input[@id='Name'])[2]")
	@CacheLookup
	public WebElement Directorname;
	
	@FindBy(xpath = "(//input[@id='DateStart'])[2]")
	@CacheLookup
	public WebElement Appointmentdate;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	@CacheLookup
	public WebElement directorsave;
	
	@FindBy(xpath = "(//input[@id='Name'])[2]")
	@CacheLookup
	public WebElement shereholdername;
	
	@FindBy(xpath = "(//input[@id='ShareValue'])[2]")
	@CacheLookup
	public WebElement Valuepershere;
	
	@FindBy(xpath = "(//input[@id='Share'])[2]")
	@CacheLookup
	public WebElement numberofshares;
	
	@FindBy(xpath = "//a[@data-type='supplier']")
	@CacheLookup
	public WebElement supplier;
	
	@FindBy(xpath = "//a[@data-type='director']")
	@CacheLookup
	public WebElement director;
	
	@FindBy(xpath = "//a[@data-type='shareholder']")
	@CacheLookup
	public WebElement shereholder;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	@CacheLookup
	public WebElement Saveshereholder;
	
	@FindBy(xpath = "//h1[text()='Contact List']")
	@CacheLookup
	public WebElement Contactspage;
	
	

}
