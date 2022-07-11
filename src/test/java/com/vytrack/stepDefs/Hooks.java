package com.vytrack.stepDefs;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // @Before runs before each SCENARIO
    @Before
    public void setUpScenario(){

        System.out.println("---> This is coming from @Before in Hooks");

    }

    @After
    public void tearDownScenario(Scenario scenario){

        System.out.println("---> This is coming from @After in Hooks");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }
}
