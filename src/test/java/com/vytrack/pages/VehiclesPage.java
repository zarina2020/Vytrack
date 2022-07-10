package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='extra-actions-panel']")
    public WebElement exportGridDropdown;

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refreshIcon;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetIcon;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsIcon;



}
