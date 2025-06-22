package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_ClientCreation_locators {
	
	@FindBy(xpath="//button[@id='btnAddNewClient']")
	@CacheLookup
	public  WebElement AddClientbtn;
	
	@FindBy(xpath="//input[@id='Name']")
	@CacheLookup
	public WebElement InputName;
	
	@FindBy(xpath="//input[@id='Address1']")
	@CacheLookup
	public WebElement InputAddress1;
	
	@FindBy(xpath="//input[@id='Address2']")
	@CacheLookup
	public WebElement InputAddress2;
	
	@FindBy(xpath="//input[@id='Address3']")
	@CacheLookup
	public WebElement InputAddress3;
	
	@FindBy(xpath="//input[@id='Zip']")
	@CacheLookup
	public WebElement InputZip;
	
	@FindBy(xpath="//input[@id='State']")
	@CacheLookup
	public WebElement InputCounty;
	
	@FindBy(xpath="//input[@id='EMail']")
	@CacheLookup
	public WebElement InputEmail;
	
	@FindBy(xpath="//input[@id='Phone']")
	@CacheLookup
	public WebElement InputPhone;
	
	@FindBy(xpath="//input[@id='Website']")
	@CacheLookup
	public WebElement InputWebsite;
	
	@FindBy(xpath="//input[@id='BookStartDateStr']")
	@CacheLookup
	public WebElement InputBusinessStartDate;
	
	@FindBy(xpath="//input[@id='StartDateStr']")
	@CacheLookup
	public WebElement InputBookStartDate;
	
	@FindBy(xpath="//input[@id='CompanyRef']")
	@CacheLookup
	public WebElement InputRegistrationNo;
	
	@FindBy(xpath="//input[@id='TaxRefNo']")
	@CacheLookup
	public WebElement InputUTRno;
	
	@FindBy(xpath="//input[@id='VatRegNo']")
	@CacheLookup
	public WebElement InputVatRegNo;
	
	@FindBy(xpath="//input[@id='AccountOfficeRefNo']")
	@CacheLookup
	public WebElement InputAccountOfficeRefNo;
	
	@FindBy(xpath="//input[@id='PAYERefNo']")
	@CacheLookup
	public WebElement InputPAYERefNo;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	public WebElement Savebtn;
	
	// Search Client
	
	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement ClientSearch;
	
	@FindBy(xpath="(//a[@class='azure'])[1]")
	@CacheLookup
	public WebElement ClickClient;
	
}
