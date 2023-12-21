package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchStepdefs {
    @Then("homepage should be opened")
    public void homepageShouldBeOpened() {
    }

    @When("user search for {string}")
    public void userSearchFor(String arg0) {
    }

    @Then("there must be {int} listed product")
    public void thereMustBeProductNumberListedProduct(int productNumber) {
        // Assert.assertEquals(productNames.size(),productNumber);
    }
}