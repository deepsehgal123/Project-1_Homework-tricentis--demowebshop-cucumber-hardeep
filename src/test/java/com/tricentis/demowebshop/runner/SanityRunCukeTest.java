package com.tricentis.demowebshop.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class SanityRunCukeTest {

    @CucumberOptions(

            features = "src/test/resources/features",

            glue = "com/tricentis/demowebshop/steps",

            plugin = {"html:target/cucumber-reports/cucumber.html",

                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

            tags="@sanity")



    public class sanityRunCukeTest extends AbstractTestNGCucumberTests {



    }

}