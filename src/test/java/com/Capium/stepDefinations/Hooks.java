package com.Capium.stepDefinations;

import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Hooks {

	private static ExtentReports extent = ExtentService.getInstance();
	private static ExtentTest scenarioTest;
	// private static ExtentTest stepNode;

	@BeforeAll
	public static void setup() {
		HelperClass.setUpDriver();
		Log.info("Driver setup successfully");
		System.out.println("Starting the Test Execution...");

	}

	@Before
	public void beforeScenario(Scenario scenario) {
		scenarioTest = extent.createTest("Scenario: " + scenario.getName());
		System.out.println("Starting Scenario: " + scenario.getName());
		Log.info("Scenario:" + scenario.getName());
	}
//
//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//		String currentStep = StepTracker.getCurrentStep();
//
//		if (scenario.isFailed()) {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File src = ts.getScreenshotAs(OutputType.FILE);
//				String screenshotPath = "screenshots/" + currentStep.replace(" ", "_") + "_" + timestamp() + ".png";
//				FileUtils.copyFile(src, new File(screenshotPath));
//
//				final byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshotBytes, "image/png", currentStep);
//
//				scenarioTest.log(Status.FAIL, "❌ Step Failed: " + currentStep,
//						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//				// Log.error("Scenario FAILED: " + scenario.getName());
//				Log.info("Scenario FAILED:");
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} else {
//			scenarioTest.log(Status.PASS, "✅ Step Passed: " + currentStep);
//			// Log.info("Scenario PASSED: " + scenario.getName());
//		}
//	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//		String currentStep = StepTracker.getCurrentStep();
//
//		if (scenario.isFailed()) {
//			Hooks.captureScreenshotBase64(driver, scenarioTest, "❌ Step Failed: " + currentStep);
//			scenario.attach(
//					driver instanceof TakesScreenshot ? ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
//							: new byte[0],
//					"image/png", currentStep);
//			scenarioTest.log(Status.FAIL, "❌ Step Failed: " + currentStep);
//		} else {
//			scenarioTest.log(Status.PASS, "✅ Step Passed: " + currentStep);
//		}
//	}

//	@AfterStep
//	public void addScreenshot(Scenario scenario){
//
//	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	      scenario.attach(screenshot, "image/png", "image"); 
//		
//	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//
//		String stepName = getStepNameFromStackTrace();
//
//		if (stepName == null || stepName.isEmpty()) {
//			stepName = "Unnamed Step";
//		}
//
//		String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//
//		if (scenario.isFailed()) {
//			scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
//			scenarioTest.log(Status.FAIL, stepName,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//		} else {
//			scenarioTest.log(Status.PASS, stepName,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//		}
//	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
	    WebDriver driver = HelperClass.getDriver();
	    String stepName = StepTracker.getCurrentStep();

	    if (stepName == null || stepName.isEmpty()) {
	        stepName = "Unnamed Step";
	    }

	    String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

	    if (scenario.isFailed()) {
	        scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
	        Hooks.scenarioTest.log(Status.FAIL, stepName,
	                MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	    } else {
	        Hooks.scenarioTest.log(Status.PASS, stepName,
	                MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	    }
	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//	    WebDriver driver = HelperClass.getDriver();
//	    String stepName = StepTracker.getCurrentStep();
//	    if (stepName == null || stepName.isEmpty()) {
//	        stepName = "Unnamed Step";
//	    }
//
//	    String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//
//	    // For Allure
//	    scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
//
//	    // For ExtentReports
//	    if (scenario.isFailed()) {
//	        scenarioTest.log(Status.FAIL, stepName,
//	            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//	    } else {
//	        scenarioTest.log(Status.PASS, stepName,
//	            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//	    }
//	}

	@After
	public void afterScenario(Scenario scenario) {
	    WebDriver driver = HelperClass.getDriver();
	    WebDriverWait wait = HelperClass.getWait();

	    try {
	        if (scenario.isFailed()) {
	            scenarioTest.log(Status.FAIL, "❌ Scenario Failed.");
	            Log.info("Scenario Failed.");
	        } else {
	            scenarioTest.log(Status.PASS, "✅ Scenario Passed.");
	            Log.info("Scenario Passed.");
	        }

	        By powerOffIcon = By.xpath("//i[@class='icon fa fa-power-off']");
	        By profileIcon = By.xpath("//div[@class='profile-logo']//label");
	        By logoutLink = By.xpath("//a[normalize-space()='Logout']");
	        By loginPageIdentifier = By.xpath("//div[normalize-space()='Sign In']");

	        
	        if (HelperClass.isElementPresent(powerOffIcon)) {
	            WebElement powerOff = wait.until(ExpectedConditions.elementToBeClickable(powerOffIcon));
	            HelperClass.scrollIntoView(powerOff);
	            try {
	                powerOff.click();
	            } catch (ElementClickInterceptedException e) {
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", powerOff);
	            }
	            Log.info("Clicked power-off icon for logout.");
	        }

	        else {
	            if (HelperClass.isElementPresent(profileIcon)) {
	                WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
	              HelperClass.scrollIntoView(profile);
	                try {
	                    profile.click();
	                } catch (ElementClickInterceptedException e) {
	                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", profile);
	                }
	                Log.info("Clicked profile icon.");
	            }

	            if (HelperClass.isElementPresent(logoutLink)) {
	                WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
	             HelperClass.scrollIntoView(logout);
	                try {
	                    logout.click();
	                } catch (ElementClickInterceptedException e) {
	                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout);
	                }
	                Log.info("Clicked logout link.");
	            }
	        }

	        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPageIdentifier));
	        Log.info("Logout successful. Redirected to login page.");

	    } catch (Exception e) {
	        Log.error("❌ Logout failed: " + e.getMessage());
	        System.out.println("Logout failed: " + e.getMessage());
	    }
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("Ending Test Execution...");
		try {
			WebDriver driver = HelperClass.getDriver();
			if (driver.findElement(By.xpath("//i[@class='icon fa fa-power-off']")).isDisplayed()) {
				driver.findElement(By.xpath("//i[@class='icon fa fa-power-off']")).click();
				Log.info("power-off icon clicked successfully");
			} else if (driver.findElement(By.xpath("//div[@class='profile-logo']//label")).isDisplayed()) {
				driver.findElement(By.xpath("//div[@class='profile-logo']//label")).click();
				Log.info("profile logo clicked successfully");
				if (driver.findElement(By.xpath("//a[normalize-space()='Logout']")).isDisplayed()) {
					driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
					Log.info("logut button clicked sucessfully");
				}
			}
		} catch (Exception e) {
			System.out.println("Logout failed: " + e.getMessage());
		}
		try {
			HelperClass.tearDown();
			System.out.println("Teardown complete.");
			Log.info("Teardown complete.");
		} catch (Exception e) {
			System.out.println("Error during teardown: " + e.getMessage());
		}
		try {
			extent.flush();
			System.out.println("Extent report flushed.");
		} catch (Exception e) {
			System.out.println("Error flushing extent report: " + e.getMessage());
		}
	}

	private static String timestamp() {
		return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	}

	public static ExtentTest getScenarioTest() {
		return scenarioTest;
	}

	public static void captureScreenshotBase64(WebDriver driver, ExtentTest scenarioTest, String message) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			String base64Screenshot = ts.getScreenshotAs(OutputType.BASE64);

			scenarioTest.log(Status.INFO, "📸 Screenshot: " + message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

			Log.info("Successfully captured screenshot: " + message);

		} catch (Exception e) {
			Log.error("Failed to capture screenshot: " + message + " | Error: " + e.getMessage());
		}
	}

	private String getStepNameFromStackTrace() {
		for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
			String methodName = element.getMethodName();

			// Find your step definition package
			if (element.getClassName().contains("com.Capium.stepDefinations")) {
				return methodName.replace("_", " ");
			}
		}
		return null;
	}
	
	private String getCurrentStepName(Scenario scenario) {
        try {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                if (element.getClassName().contains("StepDefinitions")) {
                    return element.getMethodName(); // fallback: step definition method name
                }
            }
        } catch (Exception e) {
            // Ignore
        }
        return null;
    }

	private static Map<String, Object> scenarioContext = new HashMap<>();

	public static void setScenarioContext(String key, Object value) {
		scenarioContext.put(key, value);
	}

	public static Object getScenarioContext(String key) {
		return scenarioContext.get(key);
	}

	public static void clearScenarioContext() {
		scenarioContext.clear();
	}

}
