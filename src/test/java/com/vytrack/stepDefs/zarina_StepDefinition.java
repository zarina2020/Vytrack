package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class zarina_StepDefinition {
    VehiclesPage vehiclesPage = new VehiclesPage();
    @Given("User on the \"Vehicles\"page")
    public void user_on_the_vehicles_page() {
        vehiclesPage.vehiclesPageLogin("driver","driverPassword");
    }

    @Then("User should be able to click the {string} button")
    public void user_should_be_able_to_click_the_button(String string) {
        vehiclesPage.resetIcon.click();



    }
}
