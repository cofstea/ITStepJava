package com.itstep.lesson.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(id = "search_query_top")
    private WebElement search;

    @FindBy(className = "login")
    private WebElement login;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "/index.php";
    }

}
