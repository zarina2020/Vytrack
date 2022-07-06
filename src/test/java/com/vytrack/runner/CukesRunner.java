package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features" ,
        glue = "com/vytrack/stepDefs",
        dryRun = false,
        tags = "@",
        monochrome = true

)
public class CukesRunner {

}
