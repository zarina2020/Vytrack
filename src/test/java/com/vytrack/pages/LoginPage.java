package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(className = "custom-checkbox__text")
    private WebElement rememberMeCheckBox;

    @FindBy(id = "_submit")
    private WebElement loginBtn;

    public void vytrackLogin(String userName, String passWord) {
       // Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));

        username.sendKeys(userName);

        password.sendKeys(passWord);

        loginBtn.click();

    }
}
