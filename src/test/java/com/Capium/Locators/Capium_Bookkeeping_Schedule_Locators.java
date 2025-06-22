package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Schedule_Locators {

	@FindBy(xpath = "(//a[@class='menu-dropdown'])[6]")
	@CacheLookup
	public WebElement schedule;
 
	@FindBy(xpath = "//span[@class='icon-add']")
	@CacheLookup
	public WebElement ADDMinutesofmeetings;
 
	@FindBy(xpath = "//a[text()='Minutes of Meetings']")
	@CacheLookup
	public WebElement Minutesofmeetings;
 
	@FindBy(xpath = "//span[@title='Member Name']")
	@CacheLookup
	public WebElement Membername;
 
	@FindBy(xpath = "//span[@title='Meeting Date']")
	@CacheLookup
	public WebElement Memberdate;
 
	@FindBy(xpath = "//textarea[@class='note-codable']")
	@CacheLookup
	public WebElement Membernametext;
 
	@FindBy(xpath = "//button[text()='Insert']")
	@CacheLookup
	public WebElement insertsave;
 
	@FindBy(xpath = "//input[@id='mminput']")
	@CacheLookup
	public WebElement meetingdate;
 
	@FindBy(xpath = "//span[@id='meeting_time']")
	@CacheLookup
	public WebElement meetingtime;
 
	@FindBy(xpath = "//input[@class='form-control input-sm']")
	@CacheLookup
	public WebElement textmeetingtime;
 
	@FindBy(xpath = "//span[@id='location']")
	@CacheLookup
	public WebElement meetinglocation;
 
	@FindBy(xpath = "//div[@class='note-editable panel-body']")
	@CacheLookup
	public WebElement textmeetinglocation;
 
	@FindBy(xpath = "//span[@id='meetingtype']")
	@CacheLookup
	public WebElement meetingtype;
 
	@FindBy(xpath = "//textarea[@class='note-codable']")
	@CacheLookup
	public WebElement textmeetingtype;
 
	@FindBy(xpath = "(//a[@class='btn btn-azure'])[2]")
	@CacheLookup
	public WebElement saveminutesofmeeting;
 
	@FindBy(xpath = "//a[text()='Notes']")
	@CacheLookup
	public WebElement Notes;
 
	@FindBy(xpath = "//span[text()='Note']/i")
	@CacheLookup
	public WebElement AddNotes;
 
	@FindBy(xpath = "//input[@id='Name']")
	@CacheLookup
	public WebElement TittleAddNote;
 
	@FindBy(xpath = "//textarea[@id='Description']")
	@CacheLookup
	public WebElement DesAddNote;
 
	@FindBy(xpath = "(//button[@type='button'])[2]")
	@CacheLookup
	public WebElement SaveAddNote;
 
	@FindBy(xpath = "//textarea[@id='mminput']")
	@CacheLookup
	public WebElement Meetingbytext;

}
