package com.itstep.lesson.pages;

import org.openqa.selenium.WebDriver;

public class SummaryCheckout extends AbstractPage {

    public SummaryCheckout(final WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return "/index.php?controller=order";
    }

}
