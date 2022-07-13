package com.vytrack.stepDefs;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RefreshButtonStepDefs {
    VehiclesPage vehiclesPage = new VehiclesPage();
    @Given("User on the Vehicles page")
    public void user_on_the_vehicles_page(){
        vehiclesPage.vehiclesPageLogin("driver","driverPassword");
    }
    @Then("User should be able to click refresh button")
    public void user_should_be_able_to_click_refresh_button() {
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.refreshIcon.click();
    }




}
