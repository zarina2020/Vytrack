package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSettingsStepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();
    @Given("user is on Vehicle page")
    public void user_is_on_vehicle_page() {
        vehiclesPage.vehiclesPageLogin("driver", "Password");


    }
    @Then("user should be able to click Grid Settings button")
    public void user_should_be_able_to_click_grid_settings_button(String string) {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.gridSettingsIcon));
        vehiclesPage.gridSettingsIcon.click();




        // come back to this

        // from kathe and mustafa

        //testttttt






    }

}
