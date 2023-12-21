package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static stepdefs.Locator.*;

public class CartStepdefs extends BaseSteps {
    @Given("user on homepage")
    public void userOnHomepage() {
        driver.navigate().to(url);

    }

    @When("user add the product {string} to the cart")
    public void userAddTheProductToTheCart(String text) {
        sendKeysEnter(lSearch, text);
        click(lF9AddToCart);

    }

    @And("user click to Cart")
    public void userClickToCart() {
        click(lViewCart);

    }

    @Then("the product {string} should be in Cart")
    public void theProductShouldBeInCart(String text) {

        //isTextVisible(text);
        WebElement element = driver.findElement(lAssertF9);


        Assert.assertEquals(element.getText().toLowerCase(), text);


    }
}