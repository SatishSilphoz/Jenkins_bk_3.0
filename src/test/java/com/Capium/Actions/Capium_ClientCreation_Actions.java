//package com.Capium.Actions;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//import com.Capium.Locators.Capium_ClientCreation_locators;
//import com.Capium.Utilies.HelperClass;
//import com.Capium.Utilies.Log;
//
//public class Capium_ClientCreation_Actions {
//
//    Capium_ClientCreation_locators ClientLocators = null;
//
//    public Capium_ClientCreation_Actions() {
//        this.ClientLocators = new Capium_ClientCreation_locators();
//        PageFactory.initElements(HelperClass.getDriver(), ClientLocators);
//    }
//
//    String Filepath = "D:\\Core Modules\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";
//
//    public void ClientCreation() throws IOException, InterruptedException {
//
//        FileInputStream file = new FileInputStream(Filepath);
//        XSSFWorkbook wb = new XSSFWorkbook(file);
//        XSSFSheet sheet = wb.getSheet("Sheet1");
//        int rowcount = sheet.getLastRowNum();
//        Log.info("Total row count: " + rowcount);
//
//        for (int i = 1; i <= rowcount; i++) {
//            Thread.sleep(2000);
//            XSSFRow row = sheet.getRow(i);
//            ClientLocators.AddClientbtn.click();
//
//            // Reading and assigning data from Excel
//            String Name = getStringValue(row.getCell(0));
//            String Address1 = getStringValue(row.getCell(1));
//            String Address2 = getStringValue(row.getCell(2));
//            String CityTown = getStringValue(row.getCell(3));
//            String Postcode = getStringValue(row.getCell(4));
//            String County = getStringValue(row.getCell(5));
//            String Email = getStringValue(row.getCell(6));
//            String phone = getStringValue(row.getCell(7));
//            String Website = getStringValue(row.getCell(8));
//            String BusinessStartDate = getStringValue(row.getCell(9));
//            String BookStartDate = getStringValue(row.getCell(10));
//            String RegistrationNo = getStringValue(row.getCell(11));
//            String UTRno = getStringValue(row.getCell(12));
//            String VATregNo = getStringValue(row.getCell(13));
//            String AccountOfficeRefNo = getStringValue(row.getCell(14));
//            String PAYErefNo = getStringValue(row.getCell(15));
//
//            // Sending data to web elements
//            ClientLocators.InputName.sendKeys(Name);
//            ClientLocators.InputAddress1.sendKeys(Address1);
//            ClientLocators.InputAddress2.sendKeys(Address2);
//            ClientLocators.InputAddress3.sendKeys(CityTown);
//            ClientLocators.InputCounty.sendKeys(County);
//            ClientLocators.InputEmail.sendKeys(Email);
//            ClientLocators.InputPhone.sendKeys(phone);
//            ClientLocators.InputWebsite.sendKeys(Website);
//            
//            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.visibilityOf(ClientLocators.InputBusinessStartDate));
//            ((JavascriptExecutor) HelperClass.getDriver()).executeScript(
//                "arguments[0].value = arguments[1];", 
//                ClientLocators.InputBusinessStartDate, 
//                BusinessStartDate
//            );
//
//            wait.until(ExpectedConditions.visibilityOf(ClientLocators.InputBookStartDate));
//            ((JavascriptExecutor) HelperClass.getDriver()).executeScript(
//                "arguments[0].value = arguments[1];", 
//                ClientLocators.InputBookStartDate, 
//                BookStartDate
//            );
//
//            ClientLocators.InputRegistrationNo.sendKeys(RegistrationNo);
//            ClientLocators.InputUTRno.sendKeys(UTRno);
//            ClientLocators.InputVatRegNo.sendKeys(VATregNo);
//            ClientLocators.InputAccountOfficeRefNo.sendKeys(AccountOfficeRefNo);
//            ClientLocators.InputPAYERefNo.sendKeys(PAYErefNo);
//
//            ClientLocators.Savebtn.click();
//        }
//
//        wb.close();
//        file.close();
//    }
//
//    private String getStringValue(Cell cell) {
//        if (cell == null) return "";
//        if (cell.getCellType() == CellType.NUMERIC) {
//            return String.valueOf((long) cell.getNumericCellValue());
//        } else {
//            return cell.getStringCellValue().trim();
//        }
//        
//      
//    }
//    
//  
//}


package com.Capium.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Capium_ClientCreation_locators;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;

public class Capium_ClientCreation_Actions {

    Capium_ClientCreation_locators ClientLocators = null;

    public Capium_ClientCreation_Actions() {
        this.ClientLocators = new Capium_ClientCreation_locators();
        PageFactory.initElements(HelperClass.getDriver(), ClientLocators);
    }
    
    WebDriver driver =HelperClass.getDriver();
    WebDriverWait wait=HelperClass.getWait();

    String Filepath = "D:\\Auto\\CapiumApplication\\Capium_BK_3.0\\src\\test\\resources\\Files\\ClientCreationData.xlsx";

    public void ClientCreation() throws IOException, InterruptedException {
        FileInputStream file = new FileInputStream(Filepath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("ClientCreation");
        int rowcount = sheet.getLastRowNum();
        Log.info("Total row count: " + rowcount);

        DataFormatter formatter = new DataFormatter();
        SimpleDateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy"); 

        for (int i = 1; i <= rowcount; i++) {
            Thread.sleep(2000);
            XSSFRow row = sheet.getRow(i);
            HelperClass.ClickUsingJS(HelperClass.getDriver(), ClientLocators.AddClientbtn);
            //ClientLocators.AddClientbtn.click();

            String Name = getFormattedValue(row.getCell(0), formatter);
            String Address1 = getFormattedValue(row.getCell(1), formatter);
            String Address2 = getFormattedValue(row.getCell(2), formatter);
            String CityTown = getFormattedValue(row.getCell(3), formatter);
            String Postcode = getFormattedValue(row.getCell(4), formatter);
            String County = getFormattedValue(row.getCell(5), formatter);
            String Email = getFormattedValue(row.getCell(6), formatter);
            String phone = getFormattedValue(row.getCell(7), formatter);
            String Website = getFormattedValue(row.getCell(8), formatter);

            // Use updated date handling
            String BusinessStartDate = getFormattedDate(row.getCell(9), targetFormat, formatter);
            String BookStartDate = getFormattedDate(row.getCell(10), targetFormat, formatter);

            String RegistrationNo = getFormattedValue(row.getCell(11), formatter);
            String UTRno = getFormattedValue(row.getCell(12), formatter);
            String VATregNo = getFormattedValue(row.getCell(13), formatter);
            String AccountOfficeRefNo = getFormattedValue(row.getCell(14), formatter);
            String PAYErefNo = getFormattedValue(row.getCell(15), formatter);

            ClientLocators.InputName.sendKeys(Name);
            ClientLocators.InputAddress1.sendKeys(Address1);
            ClientLocators.InputAddress2.sendKeys(Address2);
            ClientLocators.InputAddress3.sendKeys(CityTown);
            ClientLocators.InputZip.sendKeys(Postcode);
            ClientLocators.InputCounty.sendKeys(County);
            ClientLocators.InputEmail.sendKeys(Email);
            ClientLocators.InputPhone.sendKeys(phone);
            ClientLocators.InputWebsite.sendKeys(Website);

            ClientLocators.InputBusinessStartDate.clear();
            ClientLocators.InputBusinessStartDate.sendKeys(BusinessStartDate);

            ClientLocators.InputBookStartDate.clear();
            ClientLocators.InputBookStartDate.sendKeys(BookStartDate);

            ClientLocators.InputRegistrationNo.sendKeys(RegistrationNo);
            ClientLocators.InputUTRno.sendKeys(UTRno);
            ClientLocators.InputVatRegNo.sendKeys(VATregNo);
            ClientLocators.InputAccountOfficeRefNo.sendKeys(AccountOfficeRefNo);
            ClientLocators.InputPAYERefNo.sendKeys(PAYErefNo);

            Thread.sleep(2000);
            ClientLocators.Savebtn.click();
        }

        wb.close();
        file.close();
    }

    private String getFormattedValue(Cell cell, DataFormatter formatter) {
        if (cell == null) return "";
        return formatter.formatCellValue(cell).trim();
    }

    private String getFormattedDate(Cell cell, SimpleDateFormat targetFormat, DataFormatter formatter) {
        if (cell == null) return "";
        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            return targetFormat.format(cell.getDateCellValue());
        } else {
            return formatter.formatCellValue(cell).trim();
        }
    }

    
//    public void verifyClientCreation() throws IOException, InterruptedException {
//        FileInputStream file = new FileInputStream(Filepath);
//        XSSFWorkbook wb = new XSSFWorkbook(file);
//        XSSFSheet sheet = wb.getSheet("ClientCreation");
//        int rowcount = sheet.getLastRowNum();
//        Log.info("Starting verification of clients...");
//
//        DataFormatter formatter = new DataFormatter();
//       WebDriverWait wait=HelperClass.getWait();
//        for (int i = 1; i <= rowcount; i++) {
//            String expectedClientName = getFormattedValue(sheet.getRow(i).getCell(0), formatter);
//            Thread.sleep(3000);
//            wait.until(ExpectedConditions.visibilityOf(ClientLocators.ClientSearch));
//            wait.until(ExpectedConditions.elementToBeClickable(ClientLocators.ClientSearch));
//            ClientLocators.ClientSearch.clear();
//            ClientLocators.ClientSearch.sendKeys(expectedClientName);
//            Thread.sleep(2000); 
//            boolean isClientFound = HelperClass.getDriver().getPageSource().contains(expectedClientName);
//
//            if (isClientFound) {
//                Log.info("Client '" + expectedClientName + "' found successfully in search results.");
//            } else {
//                Log.error("Client '" + expectedClientName + "' was NOT found in search results.");
//            }
//
//            Thread.sleep(1000);
//        }
//        
//
//        wb.close();
//        file.close();
//    }
//    
//    public void Click_Selected_Client() throws InterruptedException {
//    	Thread.sleep(3000);
//    	ClientLocators.ClickClient.click();
//    }
    
    public void verifyClientCreation() throws IOException, InterruptedException {
        FileInputStream file = new FileInputStream(Filepath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("ClientCreation");
        int rowcount = sheet.getLastRowNum();
        Log.info("Starting verification of clients...");

        DataFormatter formatter = new DataFormatter();
        WebDriverWait wait = HelperClass.getWait();

        for (int i = 1; i <= rowcount; i++) {
            String expectedClientName = getFormattedValue(sheet.getRow(i).getCell(0), formatter).trim();

            try {
                Thread.sleep(2000);

                wait.until(ExpectedConditions.visibilityOf(ClientLocators.ClientSearch));
                wait.until(ExpectedConditions.elementToBeClickable(ClientLocators.ClientSearch));
                ClientLocators.ClientSearch.clear();
                ClientLocators.ClientSearch.sendKeys(expectedClientName);

                boolean isClientClicked = false;
                long startTime = System.currentTimeMillis();
                long maxWaitMillis = 15000; // 15 seconds max wait

                while ((System.currentTimeMillis() - startTime) < maxWaitMillis) {
                    try {
                        By clientLinkXpath = By.xpath("//table[@id='TblClientList']/tbody/tr[1]/td[3]/div/a");
                        WebElement clientElement = HelperClass.getDriver().findElement(clientLinkXpath);

                        if (clientElement.isDisplayed()) {
                            String actualClientName = clientElement.getText().trim();
                            Log.info("Appearing client name: '" + actualClientName + "'");

                            if (actualClientName.equalsIgnoreCase(expectedClientName)) {
                                ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView(true);", clientElement);
                                ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();", clientElement);
                                Log.info("Client '" + expectedClientName + "' clicked successfully.");
                                isClientClicked = true;
                                break;
                            } else {
                                Log.info("Mismatch. Expected: '" + expectedClientName + "', Found: '" + actualClientName + "'. Retrying...");
                            }
                        }

                    } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
                        Log.warn("Client row not found or stale. Retrying...");
                    }

                    Thread.sleep(1000); // Poll every second
                }

                if (!isClientClicked) {
                    Log.error("Client '" + expectedClientName + "' was not found or not matched within the timeout.");
                }

            } catch (Exception e) {
                Log.error("Error while verifying and clicking client '" + expectedClientName + "': " + e.getMessage());
                e.printStackTrace();
            }

            Thread.sleep(1000); 
        }

        wb.close();
        file.close();
    }



}
