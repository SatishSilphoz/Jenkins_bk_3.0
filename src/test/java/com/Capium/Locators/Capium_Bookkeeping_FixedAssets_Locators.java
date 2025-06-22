package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_FixedAssets_Locators {

	@FindBy(xpath = "(//span[@class='menu-text'])[6]")
	@CacheLookup
	public WebElement clickFixedAssets;
 
	@FindBy(xpath = "(//a[@class='menu-dropdown'])[2]")
	@CacheLookup
	public WebElement purchase;
 
	@FindBy(xpath = "//a[@class='btn btn-azure']")
	@CacheLookup
	public WebElement clickAddAsset;
 
	@FindBy(xpath = "//h1[text()='Create New Purchase']")
	@CacheLookup
	public WebElement verifypurchasepage;
 
	@FindBy(xpath = "//h1[text()='Create New Purchase']")
	@CacheLookup
	public WebElement Verifycreatenewpurchasepage;
 
	@FindBy(xpath = "(//button[@type='button'])[1]")
	@CacheLookup
	public WebElement clickAddSupplier;
 
	@FindBy(xpath = "(//input[@type='text'])[18]")
	@CacheLookup
	public WebElement enterSupplierName;
 
	@FindBy(xpath = "(//button[@type='button'])[16]")
	@CacheLookup
	public WebElement clickonsuppliersave;
 
	@FindBy(xpath = "//textarea[@class='form-control input-sm cDesc']")
	@CacheLookup
	public WebElement enterDescription;
 
	@FindBy(xpath = "(//input[@type='text'])[5]")
	@CacheLookup
	public WebElement enterAmount;
 
	@FindBy(xpath = "(//input[@type='text'])[7]")
	@CacheLookup
	public WebElement selectAccount;
 
	@FindBy(xpath = "(//button[@type='button'])[11]")
	@CacheLookup
	public WebElement clickSaveandClose;
 
	@FindBy(xpath = "//button[@class='btn btn-link']")
	@CacheLookup
	public WebElement verifyPurchasecreatedsuccessfullywith1200;
 
	@FindBy(xpath = "(//span[@class='menu-text'])[6]")
	@CacheLookup
	public WebElement clickFixedAsset;
 
	@FindBy(xpath = "//a[@class='btn btn-azure']")
	@CacheLookup
	public WebElement addFixedAsset;
 
	@FindBy(xpath = "//div[@class='hideoverflow ']")
	@CacheLookup
	public WebElement recordafteractivate;
 
	@FindBy(xpath = "//a[text()='Depreciation']")
	@CacheLookup
	public WebElement deprceation;
 
	@FindBy(xpath = "//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement savedeprceation;
 
	@FindBy(xpath = "//input[@id='chkfixed']")
	@CacheLookup
	public WebElement checkbox;
 
	@FindBy(xpath = "//div[@class='hideoverflow danger']")
	@CacheLookup
	public WebElement verifycraetedfixedassest;
 
	@FindBy(xpath = "(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement OK;
 
	@FindBy(xpath = "//h1[text()='Fixed Assets']")
	@CacheLookup
	public WebElement verifyfixedassestapage;
 
	@FindBy(xpath = "//select[@id='action-224959311']/option")
	@CacheLookup
	public WebElement clickexplainselectActionDropdown;
 
	@FindBy(xpath = "//input[@name='DepreciationRate']")
	@CacheLookup
	public WebElement enterRate;
 
	@FindBy(xpath = "//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement clickeditSave;
 
	@FindBy(xpath = "//option[text()='Edit / Explain']")
	@CacheLookup
	public WebElement clickeditexplain;
 
	@FindBy(xpath = "//select[@class='fa-action input-xs text-center']")
	@CacheLookup
	public WebElement select;
 
	@FindBy(xpath = "//button[text()='×'])[1]")
	@CacheLookup
	public WebElement cancel;
 
	@FindBy(xpath = "(//div[@class='hideoverflow '])[2]")
	@CacheLookup
	public WebElement VerifyFixedAssetExplainedornot;
 
	@FindBy(xpath = "(//select[@class='fa-action input-xs text-center'])[2]")
	@CacheLookup
	public WebElement clickSellinselectactiondropdown;
 
	@FindBy(xpath = "//a[@href='#salesinfo']")
	@CacheLookup
	public WebElement clickDetailsinsalesasset;
 
	@FindBy(xpath = "//input[@name='Price']")
	@CacheLookup
	public WebElement enterSalesPrice;
 
	@FindBy(xpath = "//button[@data-bb-handler='save']")
	@CacheLookup
	public WebElement clickSellSave;
 
	@FindBy(xpath = "(//a[@style='cursor: pointer'])[2]")
	@CacheLookup
	public WebElement verifyFixedAssetPurchasesoldornot;
 
	@FindBy(xpath = "//a[@data-type='disposed']")
	@CacheLookup
	public WebElement clickDisposed;
 
	@FindBy(xpath = "//a[@data-type='disposed']")
	@CacheLookup
	public WebElement clickDisposed1;
 
	@FindBy(xpath = "//button[@data-bb-handler='ok']")
	@CacheLookup
	public WebElement clickOkconfirmation;
 
	@FindBy(xpath = "(//a[@style='cursor: pointer'])[3]")
	@CacheLookup
	public WebElement verifyFixedAssetPurchaseactivatedornot;
 
	@FindBy(xpath = "//a[@data-type='active']")
	@CacheLookup
	public WebElement clickActiveAssets;
 
	@FindBy(xpath = "//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement clickDisposedsave;
 
	@FindBy(xpath = "(//div[@class='hideoverflow '])[3]")
	@CacheLookup
	public WebElement VerifyfixedassetPurchaseDisposedornot;

}
