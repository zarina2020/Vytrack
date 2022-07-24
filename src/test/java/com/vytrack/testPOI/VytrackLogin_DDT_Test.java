//package com.vytrack.testPOI;
//
//import com.vytrack.pages.BasePage;
//import com.vytrack.utilities.BrowserUtils;
//import com.vytrack.utilities.ConfigurationReader;
//import com.vytrack.utilities.Driver;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class VytrackLogin_DDT_Test {
//
//    BasePage basePage =new BasePage();
//
////    @Before
////    public void setUp(){
////        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));
////    }
//
//    @Test
//    public void vytrackLoginDDT() throws IOException {
//
//        String filePath = "vytrackData.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//
//        XSSFSheet sheet = workbook.getSheet("data");
//
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//
//            String userName = sheet.getRow(i).getCell(0).toString();
//            String password = sheet.getRow(i).getCell(1).toString();
//            String firstName = sheet.getRow(i).getCell(2).toString();
//            String lastName = sheet.getRow(i).getCell(3).toString();
//
//
//            basePage.vytrackLogin(userName,password);
//
//
//
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
//            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
//
//            String actualFullName = basePage.displayedUserName.getText();
//
//            XSSFCell resultCell = sheet.getRow(i).getCell(4);
//
//            if (actualFullName.contains(firstName) && actualFullName.contains(lastName)){
//                System.out.println("PASS");
//                resultCell.setCellValue("PASS");
//            }else {
//                System.out.println("FAIL");
//                resultCell.setCellValue("FAIL");
//            }
//
//            basePage.logOut();
//
//        }
//
//
//        FileOutputStream outputStream = new FileOutputStream(filePath);
//        workbook.write(outputStream);
//
//
//        fileInputStream.close();
//        outputStream.close();
//        workbook.close();
//        Driver.getDriver().quit();
//
//
//
//
//
//    }
//}
