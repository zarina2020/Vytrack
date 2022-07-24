package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshOnRightSide_StepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();


    @Then("user should be able to see refresh button on the left side of reset button")
    public void user_should_be_able_to_see_refresh_button_on_the_left_side_of_reset_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.refreshIcon));
        Point refresh = vehiclesPage.refreshIcon.getLocation();

        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.gridSettingsIcon));
        Point reset = vehiclesPage.resetIcon.getLocation();

        Assert.assertTrue(refresh.getX() < reset.getX());
    }
}
