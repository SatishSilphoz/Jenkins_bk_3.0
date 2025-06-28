package com.Capium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Bookkeeping_Schedule_Locators;
import com.Capium.Utilies.HelperClass;

public class Capium_Bookkeeping_Schedule_Actions {

Capium_Bookkeeping_Schedule_Locators schedulelocators = null;
	
	public Capium_Bookkeeping_Schedule_Actions() {
		this.schedulelocators = new Capium_Bookkeeping_Schedule_Locators();
		PageFactory.initElements(HelperClass.getDriver(), schedulelocators);
	}
 
	public void Validateschedule() throws InterruptedException {
 
		//HelperClass.Searchclient("Test client", By.xpath("(//a[@class='azure'])[1]"));
         Thread.sleep(2000);
		schedulelocators.schedule.click();
		Thread.sleep(1000);
		HelperClass.scrolling1();
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Minutes of Meetings']"));
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='btn btn-azure'])[1]"));
		Thread.sleep(1000);
		schedulelocators.Membername.click();
		Thread.sleep(1000);
        HelperClass.sendKeys(By.xpath("//div[@class='note-editable panel-body']"), "Sriram");
		schedulelocators.insertsave.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@id='meeting_date']"));
        Thread.sleep(1000);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//td[text()='4'])[1]"));
        Thread.sleep(1000);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Insert']"));
   
        Thread.sleep(2000);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@id='meeting_time']"));;
		HelperClass.setValueUsingJS(By.xpath("//input[@id='mminput']"), "03:15 PM");
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Insert']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@id='meetingby']"));
		 HelperClass.sendKeys(By.xpath("//div[@class='note-editable panel-body']"), "Ram");
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Insert']"));
		 Thread.sleep(2000);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@id='location']"));
		 Thread.sleep(1000);
		 HelperClass.sendKeys(By.xpath("//div[@class='note-editable panel-body']"), "Hyderabad");
		 Thread.sleep(1000);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Insert']"));
//		schedulelocators.meetingtype.click();
//		schedulelocators.textmeetingtype.sendKeys("Casual");
//		schedulelocators.insertsave.click();
//		schedulelocators.saveminutesofmeeting.click();
	}
 
	public void ValidateAddNote() throws InterruptedException {
     Thread.sleep(2000);
     HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Notes']"));
     Thread.sleep(2000);
     HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='btn btn-azure']"));
	Thread.sleep(2000);
     schedulelocators.TittleAddNote.sendKeys("addnote");
     Thread.sleep(1000);
		schedulelocators.DesAddNote.sendKeys("description");
		 Thread.sleep(1000);
		schedulelocators.SaveAddNote.click();
 
	}
	}
