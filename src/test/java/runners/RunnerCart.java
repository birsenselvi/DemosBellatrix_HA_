package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/main/resources/FeatureCart.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty",
                "json:target/cucumber/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }

)

public class RunnerCart extends AbstractTestNGCucumberTests {


}