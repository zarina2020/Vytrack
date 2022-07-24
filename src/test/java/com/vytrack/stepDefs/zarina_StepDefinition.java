package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.VehiclesPageLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class zarina_StepDefinition {
    @Given("User on the \"Vehicles\"page")
    public void user_on_the_vehicles_page() {
        VehiclesPageLogin.vehiclesPageLogin();
    }

    @Then("User should be able to click the {string} button")
    public void user_should_be_able_to_click_the_button(String string) {
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.resetIcon.click();
        Assert.assertTrue(vehiclesPage.resetIcon.isSelected());

    }
}
