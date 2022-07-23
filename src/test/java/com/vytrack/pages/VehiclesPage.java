package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.HoverOverUtilClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclesPage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='extra-actions-panel']")
    public WebElement exportGridDropdown;

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refreshIcon;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetIcon;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsIcon;

    @Test
    public void vehiclesPageLogin(String userName, String passWord) {

        LoginPage loginPage = new LoginPage();
        BasePage basePage = new BasePage();

        loginPage.vytrackLogin("driver","Password");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(basePage.fleetDropDown));
        HoverOverUtilClass.hoverOver(basePage.fleetDropDown);
        basePage.vehicles.click();

    }
}
