package com.vytrack.stepDefs;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NatalliaStepDef {

    VehiclesPage vehicle = new VehiclesPage();

    @Then("user should be able to click on Grid Dropdown")
    public void user_should_be_able_to_click_on_grid_dropdown() {

        vehicle.exportGridDropdown.click();


        Assert.assertTrue(vehicle.CSVlink.isDisplayed());

    }
}
