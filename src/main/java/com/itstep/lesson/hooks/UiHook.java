package com.itstep.lesson.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itstep.lesson.selenium.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class UiHook {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void setupWebDriver() {
        logger.debug("Chrome driver Set UP");
        WebDriver driver = Browser.getBrowser();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Window is maximized");
    }

    @After
    public void tearDown() {
        Browser.quitDriver();
    }

}
