package com.itstep.lesson.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itstep.lesson.utils.PropertyReader;

public class DriverFactory {

    public static WebDriver createDriver() {

        String browserName = PropertyReader.applicationProperties().getProperty("browser", "chrome");

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
                return new FirefoxDriver();
            default:
                throw new RuntimeException("ATF is not configured for " + browserName);
        }
    }

}
