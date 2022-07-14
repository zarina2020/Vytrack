package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GridSettingsStepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();
    @Given("user is on Vehicle page")
    public void user_is_on_vehicle_page() {
        vehiclesPage.vehiclesPageLogin("driver", "Password");


    }
    @Then("user should be able to click Grid Settings button")
    public void user_should_be_able_to_click_grid_settings_button(String string) {

        vehiclesPage.gridSettingsIcon.click();

        // come back to this





    }

}
