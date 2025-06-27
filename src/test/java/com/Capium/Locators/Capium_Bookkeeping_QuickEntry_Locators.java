package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_QuickEntry_Locators {

	@FindBy(xpath = "//span[text()='Quick Entry']")
	public WebElement clickQuickEntry;

	@FindBy(xpath = "//a[@role='button']")
	@CacheLookup
	public WebElement clickAddQE;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	@CacheLookup
	public WebElement enterReference;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement searchAccountcode;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement clickonsearchcode;

	@FindBy(xpath = "//textarea[@class='input-sm form-control']")
	@CacheLookup
	public WebElement enterDescription;

	@FindBy(xpath = "(//input[@class='input-sm form-control'])[2]")
	@CacheLookup
	public WebElement selectinvoiceDate;

	@FindBy(xpath = "//div[text()='Add Quick Entry']")
	@CacheLookup
	public WebElement clickonQEpopup;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement enterNetamount;

	@FindBy(xpath = "//select[@id='qetaxrate']")
	@CacheLookup
	public WebElement selectVATrate;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	@CacheLookup
	public WebElement enterPaymentdate;

	@FindBy(xpath = "//*[@title='Payment Account']/child::select")
	@CacheLookup
	public WebElement selectPaymentaccount;

	@FindBy(xpath = "//button[text()='Save & Close']")
	@CacheLookup
	public WebElement clickSaveandclose;

	@FindBy(xpath = "//*[@class='vnocol']")
	@CacheLookup
	public WebElement verifycreatedQE;

	@FindBy(xpath = "//a[text()='Add a row']")
	@CacheLookup
	public WebElement clickaddarow;// Add a next row

	// Click on save and new

	@FindBy(xpath = "//button[text()='Save & New']")
	@CacheLookup
	public WebElement clicksaveandnew;// Click on save and new

	@FindBy(xpath = "(//input[@type='text'])[2]")
	@CacheLookup
	public WebElement verifyAddQuickEntrypage;// To verify new Quick Entry page opened or not

	@FindBy(xpath = "(//button[@type='button'])[2]")
	@CacheLookup
	public WebElement clicksave;// Click on Save
	// Click on cross mark icon

	@FindBy(xpath = "//div[text()='Add Quick Entry']")
	@CacheLookup
	public WebElement clickoutside;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	@CacheLookup
	public WebElement clickcrossmarkicon;// Click on cross mark icon

	// Verify Quick Entry Successfully or not

	@FindBy(xpath = "(//td[@class='vnocol'])[1]")
	@CacheLookup
	public WebElement QuickEntrycreatedsuccessfully;// Verify Quick Entry Successfully or not

	@FindBy(xpath = "//a[text()='Add a row']")
	@CacheLookup
	public WebElement Addarow;// Add a row

	@FindBy(xpath = "(//i[@class='fa fa-trash-o'])[2]")
	@CacheLookup
	public WebElement Deletearow;// Delete a row

	@FindBy(xpath = "//button[text()='Ok']")
	@CacheLookup
	public WebElement VerifyOkDeleteconfirmation;// Click Ok Delete confirmation
}
