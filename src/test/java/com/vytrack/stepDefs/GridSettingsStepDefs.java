package com.vytrack.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GridSettingsStepDefs {
    @Given("user is on Vehicle page")
    public void user_is_on_vehicle_page() {
        System.out.println("User is on the Vehicle page");

    }
    @Then("user should be able to click Grid Settings button")
    public void user_should_be_able_to_click_grid_settings_button() {
        System.out.println("User should be able to click Grid Setting Button");


    }

}
