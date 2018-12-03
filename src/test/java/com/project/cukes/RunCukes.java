package com.project.cukes;


import com.project.helpers.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.project.steps",
        tags = "@testWithoutLogIn",
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)
public class RunCukes {

    static DriverManager driverManager;

    @BeforeClass
    public static void start() {
        driverManager = DriverManager.getDriverManagerInstance();
        System.out.println("Starting");
    }

    @AfterClass
    public static void tearDown() {
        driverManager.closeWebDriver();
    }

}