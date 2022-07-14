package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSettingsBtnLocationStepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("User is on the Vehicles page,")
    public void user_is_on_the_vehicles_page() {
        vehiclesPage.vehiclesPageLogin("driver","driverPassword");

    }
    @When("User should see Grid Settings on the right side of the Reset Button")
    public void user_should_see_grid_settings_on_the_right_side_of_the_reset_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.resetIcon));
        Point reset = vehiclesPage.resetIcon.getLocation();

        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.gridSettingsIcon));
        Point gridSet = vehiclesPage.gridSettingsIcon.getLocation();

        Assert.assertTrue(reset.getX() < gridSet.getX());

        System.out.println("helllo");




    }


}
