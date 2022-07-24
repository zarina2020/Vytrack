package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zarina_StepDefs {
    VehiclesPage vehiclesPage = new VehiclesPage();


    @Then("User should be able to click the Reset button")
    public void user_should_be_able_to_click_the_reset_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.resetIcon));

        Assert.assertTrue(vehiclesPage.resetIcon.isEnabled());

    }
}
