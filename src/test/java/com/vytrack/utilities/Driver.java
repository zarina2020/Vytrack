package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating a private constructor --> disabling access to the
    //object this class from outside the class
    private Driver(){}

    //private, because we want to disable access from outside the class
    //static --> to use inside the static method
    private static WebDriver driver;

    public static WebDriver getDriver(){

        //it will check if driver is null & if YES, we'll set up browser
        //inside the if statement
        //if driver is already setup, it will return same driver
        if (driver == null){
            //reading browserType from configuration.properties
            //with the help of getProperty() method from ConfigurationReader clas
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
            }
        }

        return driver;
    }

public static void closeDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }

}
}
