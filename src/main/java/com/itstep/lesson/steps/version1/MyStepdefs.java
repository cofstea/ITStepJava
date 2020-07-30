package com.itstep.lesson.steps.version1;

import java.util.List;
import java.util.Map;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import com.itstep.lesson._9.homework.Type;
import com.itstep.lesson.selenium.Browser;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ParameterType(value = "CLOTHES|GADGETS|TOYS", name = "type")
    public Type type(String type) {
        return Type.valueOf(type);
    }

    @Then("user is on the {string} page")
    public void userIsOnTheCheckoutPage(String pageName) {
        switch (pageName) {
            case "Product":
                MatcherAssert.assertThat(
                        Browser.getBrowser().findElement(By.cssSelector("h1[itemprop='name']")).getText()
                        , is("Faded Short Sleeve T-shirts"));
                break;
            case "Summary Checkout":
                MatcherAssert.assertThat(
                        Browser.getBrowser().getCurrentUrl(), endsWith("?controller=order")
                );
                MatcherAssert.assertThat(
                        Browser.getBrowser().findElement(By.cssSelector("li.first>span")).getText(), equalTo("01. Summary")
                );
                break;
            default:
                throw new RuntimeException("Unknown page name " + pageName);
        }
        logger.info("User is on the {} page", pageName);
    }

    @When("user clicks to {string} button")
    @When("user click to {string} button")
    public void userClicksToAddToCartButton(String buttonName) {
        if (buttonName.equals("Add to cart")) {
            Browser.getBrowser().findElement(By.cssSelector("#add_to_cart>button")).click();
        } else if (buttonName.equals("Proceed to checkout")) {
            Browser.getBrowser().findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
        } else {
            throw new RuntimeException("Unknown page name " + buttonName);
        }
        logger.info("User clicks to {} button", buttonName);
    }

    @Then("{string} button is displayed")
    public void addToCartButtonIsDisplayed(String buttonName) {//#add_to_cart>button
        if (buttonName.equals("Add to cart")) {
            WebElement element = Browser.getBrowser().findElement(By.cssSelector("#add_to_cart>button"));
            MatcherAssert.assertThat(element.isDisplayed(), is(true));
        } else {
            throw new RuntimeException("Unknown page name " + buttonName);
        }
    }

    @Then("{string} is on the right of the product")
    public void addToCartIsOnTheRightOfTheProduct(String buttonName) {
    }

    @Then("product is added to database")
    public void productIsAddedToDatabase() {
    }

    @And("product type is {type}")
    public void productTypeIsTOYS(Type type) {
        logger.info("Type of {}", type.name().toLowerCase());
    }

    @And("list of")
    public void listOf(DataTable dataTable) {
        List<Map<String, String>> listOfMaps = dataTable.asMaps();

        for (Map<String, String> map : listOfMaps) {
            String id = map.get("Id");
            String name = map.get("Name");
            String price = map.get("Price");
            String quantity = map.get("Quantity");

            logger.info("{} for id {} for price {} of quantity {}",
                    name, id, price, quantity);

        }
    }

    @And("product {string} is {string}")
    public void productFadedShortSleeveTShirtsIsInStock(String productName, String status) {

    }

    @Given("user goes to the {string} page")
    public void userGoesToTheProductPage(String pageName) {
        if (pageName.equals("Product")) {
            Browser.getBrowser()
                    .get("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-orange");

        } else {
            throw new RuntimeException("Unkown link for page name: " + pageName);
        }
    }

}
