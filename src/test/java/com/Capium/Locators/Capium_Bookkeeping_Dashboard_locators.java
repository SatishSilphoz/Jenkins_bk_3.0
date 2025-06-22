package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Dashboard_locators {
	
	@FindBy(xpath="//i[@class='fa fa-refresh']")
	@CacheLookup
	public WebElement ClickonRefresh;
	

	@FindBy(xpath="//select[@id='CboYear']")
	@CacheLookup
	public WebElement VatsummaryMonthdropdown;
	
	@FindBy(xpath="//select[@id='CboType']")
	@CacheLookup
	public WebElement scrolling;
	
	@FindBy(xpath="//i[@class='fa fa-minus']")
	@CacheLookup
	public WebElement MinimiseVatsummary;
	
	@FindBy(xpath="//a[@class='sidebar-toggler']")
	@CacheLookup
	public WebElement MaximiseVatsummary;
	
	@FindBy(xpath="//button[@id='btnAddNewClient']")
	@CacheLookup
	public WebElement Addclientbuttton;
	
	@FindBy(xpath="//div[@class='modal-header']/button")
	@CacheLookup
	public WebElement Close_Client_AddPage;
	
	@FindBy(xpath="//a[normalize-space()='All Clients']")
	@CacheLookup
	public WebElement Allclients;
	
	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement ValidatetxtSearch;
	
	@FindBy(xpath="//a[normalize-space()='VAT Clients']")
	@CacheLookup
	public WebElement ValidateVatClient;
	
	@FindBy(xpath="//span[@dir='ltr'][1]")
	@CacheLookup
	public WebElement ValidateVatStatus;
	
	@FindBy(xpath="//div[@id='TblClientList_VAT_wrapper']//div[@class='row DTTTFooter']//div[@class='col-sm-6 col-xs-6']//div[@class='dataTables_paginate paging_bootstrap']//ul[@class='pagination']//li[@class='first hidden-sm hidden-xs']//a[@href='#'][normalize-space()='First']")
	@CacheLookup
	public WebElement VAT_page_firstbtn;
	
	@FindBy(xpath="//div[@id='TblClientList_VAT_wrapper']//div[@class='row DTTTFooter']//div[@class='col-sm-6 col-xs-6']//div[@class='dataTables_paginate paging_bootstrap']//ul[@class='pagination']//li[@class='prev']//a[@href='#']")
	@CacheLookup
	public WebElement VAT_page_previousbtn;
	
	@FindBy(xpath="//div[@id='TblClientList_VAT_wrapper']//div[@class='row DTTTFooter']//div[@class='col-sm-6 col-xs-6']//div[@class='dataTables_paginate paging_bootstrap']//ul[@class='pagination']//li[@class='next']//a[@href='#']//span[@class='hidden-sm hidden-xs'][normalize-space()='Next']")
	@CacheLookup
	public WebElement VAT_page_Nexttbtn;
	
	@FindBy(xpath="//div[@id='TblClientList_VAT_wrapper']//div[@class='row DTTTFooter']//div[@class='col-sm-6 col-xs-6']//div[@class='dataTables_paginate paging_bootstrap']//ul[@class='pagination']//li[@class='last hidden-sm hidden-xs']//a[@href='#'][normalize-space()='Last']")
	@CacheLookup
	public WebElement VAT_page_Lasttbtn;
	
	@FindBy(xpath="(//a[text()='3'])[1]")
	@CacheLookup
	public WebElement ThreeNumber;
	
	@FindBy(xpath="(//span[text()='Previous'])[1]")
	@CacheLookup
	public WebElement Previousbutton;
	
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-left'])[1]")
	@CacheLookup
	public WebElement Firstbutton;
	
	
	@FindBy(xpath="(//span[text()='Next'])[1]")
	@CacheLookup
	public WebElement Nextbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-right'])[1]")
	@CacheLookup
	public WebElement Lastbutton;
	
	
	
	
	
	
	
	
	
	
	
	

}
