package com.Capium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Task_locators {
	
	@FindBy(xpath="//span[normalize-space()='Tasks']")
	@CacheLookup
	public WebElement Tasks;
	
	@FindBy(xpath="//a[normalize-space()='Journals']")
	@CacheLookup
	public WebElement ClickOnJournals;
	
	@FindBy(xpath="//a[@role='button']")
	@CacheLookup
	public WebElement ClickOnAddJournal;
	
	@FindBy(xpath="//input[@name='invoice_account_r0']")
	@CacheLookup
	public WebElement InputAccountCode;
	
	@FindBy(xpath="//textarea[@name='Items[0].Note']")
	@CacheLookup
	public WebElement InputDescription;
	
	@FindBy(xpath="//input[@name='Items[0].Debit']")
	@CacheLookup
	public WebElement InputDebit;
	
	@FindBy(xpath="//input[@name='Items[0].Credit']")
	@CacheLookup
	public WebElement InputCredit;
	
	@FindBy(xpath="//div[@id='divAddRow']")
	@CacheLookup
	public WebElement ClickAddRow;
	
	@FindBy(xpath="//input[@name='IsIncluded']//parent::label")
	public WebElement IsIncludingVAT;
	
	
	@FindBy(xpath="//button[normalize-space()='Save & Close']")
	@CacheLookup
	public WebElement ClickOnSaveAndClose;
	
	@FindBy(xpath="//a[normalize-space()='Budgeting']")
	@CacheLookup
	public WebElement  ClickOnBudgeting;
	
	@FindBy(xpath="//a[@role='button']")
	@CacheLookup
	public WebElement ClickOnAddNewBudget;
	
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_main_main_txtbudgetname']")
	@CacheLookup
	public WebElement InputBudgetName;
	
	@FindBy(xpath="//select[@name='ctl00$ctl00$main$main$ddlperiod']")
	@CacheLookup
	public WebElement SelectPeriod;
	
	@FindBy(xpath="//a[normalize-space()='Create']")
	@CacheLookup
	public WebElement ClickOnCreate;
	
	@FindBy(xpath="//button[normalize-space()='Include Accounts']")
	@CacheLookup
	public WebElement ClickOnIncludeAccounts;
	
	@FindBy(xpath="//tbody[@role='alert']/tr[1]/td[1]/label")
	@CacheLookup
	public WebElement ClickOnAccountNameCheckbox;
	
	@FindBy(xpath="//button[text()='Include']")
	@CacheLookup
	public WebElement ClickOnIncludebutton;
	
	@FindBy(xpath="//button[text()='Ok']")
	@CacheLookup
	public WebElement ClickonOkbutton;
	
	@FindBy(xpath="//a[@data-id='2']")
	@CacheLookup
	public WebElement ClickonCalculator;
	
	@FindBy(xpath="//button[text()='save']")
	@CacheLookup
	public WebElement CalculateAmountSave;
	
	@FindBy(xpath="//input[@value='Save & Close']")
	@CacheLookup
	public WebElement ClickOnSaveandClose;
	
	@FindBy(xpath="//a[text()='Include / Exclude Accounts']")
	@CacheLookup
	public WebElement ClickOnIncludeExclude;
	
	@FindBy(xpath="//a[normalize-space()='Dividends']")
	@CacheLookup
	public WebElement ClickOnDividends;
	
	@FindBy(xpath="//a[@role='button'][text()='Dividend']")
	@CacheLookup
	public WebElement ClickOnAddDividendsbutton;
	
	@FindBy(xpath="//select[@id='ddlaction']")
	public WebElement ClickOnActionDropdown;
	
	@FindBy(xpath="//select[@name='searchby']")
	public WebElement ClickOnFilterBy;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	public WebElement SearchShareHolder;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
