package com.itstep.lesson.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication extends AbstractPage {

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccount;

    public Authentication(final WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "/index.php?controller=authentication&back=my-account";
    }

}
