package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/FeatureDeneme.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty",
                "target/cucumber/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }

)

public class RunnerDenemeCart extends AbstractTestNGCucumberTests {


}