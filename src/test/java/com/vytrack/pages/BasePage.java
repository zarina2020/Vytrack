package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='nav logo-wrapper']")
    public WebElement mainLogo;

    @FindBy(xpath = "//a[@title='Shortcuts']")
    public WebElement shortcutIcon;

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement learnHowToUseThisSpace;

    @FindBy(xpath = "//a[@target='_blank']")
    public WebElement getHelpIcon;

    @FindBy(xpath = "//li[@class='dot-menu dropdown']")
    public WebElement menuDropDownIcon;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;



}
