package com.vytrack.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

//TC : Create utility method

//1. Create a new class called BrowserUtils
//2. Create a method to make Multiple Windows logic re-usable
//3. When method is called, it should switch window and verify title

//    Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitle

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){

        Set<String> allHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allHandles) {

            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

//        5. Assert:Title contains “Etsy”
        Assert.assertTrue("Title verification Failed",Driver.getDriver().getTitle().contains(expectedTitle));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals("Title verification failed",expectedTitle,driver.getTitle());
    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
