package com.vytrack.utilities;

import com.vytrack.pages.LoginPage;

public class VytrackLogin {

public static void VytrackLogin(){

    Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));

    LoginPage loginPage = new LoginPage();

    loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));

    loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

    loginPage.loginBtn.click();

}

}
