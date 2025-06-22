package com.Capium.Actions;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_Bookkeeping_Dashboard_locators;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;

public class Capium_Bookkeeping_dashboard_Actions {
	
	Capium_Bookkeeping_Dashboard_locators bkDashboardLocators =null;
	public Capium_Bookkeeping_dashboard_Actions()
	{
		this.bkDashboardLocators = new Capium_Bookkeeping_Dashboard_locators();
		 PageFactory.initElements(HelperClass.getDriver(),bkDashboardLocators);
	}
	
	public void RefreshVatsummary() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ClickonRefresh));
		bkDashboardLocators.ClickonRefresh.click();
	}
	public void Monthly_Submmitted_returns() throws IOException {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.visibilityOf(bkDashboardLocators.VatsummaryMonthdropdown));
		HelperClass.selectFromDropdownAndObserveResults(By.id("CboYear"));
	}
	public void MinimiseVatsummary() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.MinimiseVatsummary));
		bkDashboardLocators.MinimiseVatsummary.click();
	}
//	public void MaximiseVatsummary() {
//		WebDriverWait wait = HelperClass.getWait();
//		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.MinimiseVatsummary));
//		bkDashboardLocators.MaximiseVatsummary.click();	
//	}
	
	
	public void ValidateAddclientPage_btn() throws InterruptedException {
		Thread.sleep(4000);
		// WebDriverWait wait = HelperClass.getWait();
		 //wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Addclientbuttton));
	 bkDashboardLocators.Addclientbuttton.click();
	}
	public void ValidateClosecleintPage() {
		 WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Close_Client_AddPage));
		 bkDashboardLocators.Close_Client_AddPage.click();
	}
	public void ValidateClientType() throws IOException, InterruptedException  {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboType"));
	}
	public void ValidateTextSearch() {
		
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ValidatetxtSearch));
		bkDashboardLocators.ValidatetxtSearch.sendKeys("anwar");
		
	}
	public void ValidateVatClient() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ValidateVatClient));
		bkDashboardLocators.ValidateVatClient.click();
	}
	public void MonthInVatClients() throws IOException, InterruptedException {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboMonth"));
	}
	public void VatStatus() throws InterruptedException {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboStatus"));
	}
	public void PaymentStatus() throws InterruptedException  {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboPayment"));
	}
	
	public void ClickonAllclients () {
		HelperClass.refresh();
		bkDashboardLocators.Allclients.click();
	}
	
//	public void Clickon3 () {
//		WebDriverWait wait = HelperClass.getWait();
//		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ThreeNumber));
//		bkDashboardLocators.ThreeNumber.click();
//}
	
	public void Clickon3() {
	    WebDriverWait wait = HelperClass.getWait();

	    try {
	        
	        wait.withTimeout(Duration.ofSeconds(3));
	        if (bkDashboardLocators.ThreeNumber.isDisplayed() && bkDashboardLocators.ThreeNumber.isEnabled()) {
	            wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ThreeNumber));
	            bkDashboardLocators.ThreeNumber.click();
	            Log.info("Page 3 button was visible and clicked.");
	        } else {
	            Log.info("Page 3 button is not enabled or not displayed. Skipping click.");
	        }
	    } catch (NoSuchElementException | TimeoutException e) {
	        Log.info("Page 3 button not present on this page. Skipping.");
	    } catch (Exception e) {
	        Log.error("Unexpected error while clicking on page 3: " + e.getMessage());
	    }
	}

	public void ClickOnPreviousButton() {
	    WebDriverWait wait = HelperClass.getWait();
	    try {
	        if (HelperClass.isElementPresentAndClickable(bkDashboardLocators.Previousbutton)) {
	            wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Previousbutton)).click();
	            Log.info("Clicked on 'Previous' button.");
	        } else {
	            Log.info("'Previous' button is not clickable or not present.");
	        }
	    } catch (Exception e) {
	        Log.error("Error clicking 'Previous' button: " + e.getMessage());
	    }
	}

	public void ClickOnFirstButton() {
	    WebDriverWait wait = HelperClass.getWait();
	    try {
	        if (HelperClass.isElementPresentAndClickable(bkDashboardLocators.Firstbutton)) {
	            wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Firstbutton)).click();
	            Log.info("Clicked on 'First' button.");
	        } else {
	            Log.info("'First' button is not clickable or not present.");
	        }
	    } catch (Exception e) {
	        Log.error("Error clicking 'First' button: " + e.getMessage());
	    }
	}

	public void ClickOnNextButton() {
	    WebDriverWait wait = HelperClass.getWait();
	    try {
	        if (HelperClass.isElementPresentAndClickable(bkDashboardLocators.Nextbutton)) {
	            wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Nextbutton)).click();
	            Log.info("Clicked on 'Next' button.");
	        } else {
	            Log.info("'Next' button is not clickable or not present.");
	        }
	    } catch (Exception e) {
	        Log.error("Error clicking 'Next' button: " + e.getMessage());
	    }
	}

	public void ClickOnLastButton() {
	    WebDriverWait wait = HelperClass.getWait();
	    try {
	        if (HelperClass.isElementPresentAndClickable(bkDashboardLocators.Lastbutton)) {
	            wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Lastbutton)).click();
	            Log.info("Clicked on 'Last' button.");
	        } else {
	            Log.info("'Last' button is not clickable or not present.");
	        }
	    } catch (Exception e) {
	        Log.error("Error clicking 'Last' button: " + e.getMessage());
	    }
	}

}