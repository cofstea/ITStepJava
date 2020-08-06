package com.itstep.lesson.pages;

import org.openqa.selenium.WebDriver;

public class AccountCreation extends AbstractPage {

    public AccountCreation(final WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "/index.php?controller=authentication&back=my-account#account-creation";
    }

}
