package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/resources/FeatureCart.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty","html:target/cucumber/cucumber.html",
                "json:target/cucumber/cucumber.json",
                "testng:target/cucumber/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }

)

public class RunnerCart extends AbstractTestNGCucumberTests {


}