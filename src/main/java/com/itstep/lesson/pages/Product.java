package com.itstep.lesson.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractPage {

    @FindBy(css = "h1[itemprop='name']")
    private WebElement itemName;

    @FindBy(css = "#add_to_cart>button")
    private WebElement addToCart;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckout;

    public Product(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "/index.php?id_product=";
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getItemName() {
        return itemName;
    }

}
