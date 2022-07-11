package com.vytrack.utilities;

import com.vytrack.pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.List;


public class VehiclesPageLogin {

    public static void vehiclesPageLogin(){

        BasePage basePage = new BasePage();

        VytrackLogin.vytrackLogin();

        basePage.fleetDropDown.click();
        basePage.vehicles.click();

    }
}
