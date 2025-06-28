package com.Capium.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Login_Locators;
import com.Capium.Utilies.HelperClass;

public class Capium_Login_Actions {

	Capium_Login_Locators loginLocators = null;

	public Capium_Login_Actions() {
		this.loginLocators = new Capium_Login_Locators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);
	}

	public void EnterUsername(String username) {
		loginLocators.inputUsername.clear();
		loginLocators.inputUsername.sendKeys(username);

	}

	public void EnterPassword(String password) {
        loginLocators.inputPassword.clear();
		loginLocators.inputPassword.sendKeys(password);
	}

	public void ClickLoginbtn() throws Exception {
		loginLocators.btnLogin.click();
		Thread.sleep(5000);
	}

	public boolean isHomePage() {
		try {
			return loginLocators.Homepage_Element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void Navigate_to_bookkeeping_module() {

		try {
			boolean clicked = false;

			try {
				if (loginLocators.Homepage_BK_module != null && loginLocators.Homepage_BK_module.isDisplayed()) {
					loginLocators.Homepage_BK_module.click();
					System.out.println("Navigated to Bookkeeping module from Homepage.");
					clicked = true;
				}
			} catch (Exception e) {
				System.out.println("Homepage bookkeeping module not available or not visible.");
			}

			if (!clicked) {
				try {
					if (loginLocators.C_icon_inside_modules != null
							&& loginLocators.C_icon_inside_modules.isDisplayed()) {
						loginLocators.C_icon_inside_modules.click();
						Thread.sleep(500); // Small delay to allow the submenu to open

						if (loginLocators.Bookkeeping_Module != null
								&& loginLocators.Bookkeeping_Module.isDisplayed()) {
							loginLocators.Bookkeeping_Module.click();
							System.out.println("Navigated to Bookkeeping module from inside module.");
							clicked = true;
						}
					}
				} catch (Exception e) {
					System.out.println("Could not click C icon or bookkeeping inside module.");
				}
			}

			if (!clicked) {
				System.err.println("Bookkeeping module not found in either location.");
			}

		} catch (Exception e) {
			System.err.println("Error navigating to Bookkeeping module: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public void Logout() {

		try {
			if (loginLocators.Logout_element != null && loginLocators.Logout_element.isDisplayed()) {
				loginLocators.Logout_element.click();
				return;
			}

			if (loginLocators.Logo_in_homepage != null && loginLocators.Logo_in_homepage.isDisplayed()) {
				loginLocators.Logo_in_homepage.click();
				if (loginLocators.Logout_inside_logo != null && loginLocators.Logout_inside_logo.isDisplayed()) {
					loginLocators.Logout_inside_logo.click();
				}
			}

		} catch (Exception e) {
			System.out.println("Logout failed: " + e.getMessage());
		}

	}
}