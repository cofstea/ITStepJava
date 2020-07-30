import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.containsString;

public class SeleniumTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        logger.debug("Chrome driver Set UP");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Window is maximized");
    }

    @Test
    public void googleIt() {
        driver.get("https://www.google.com/");

        By searchLocator = By.xpath("//input[@name='q']");

        WebElement search = driver.findElement(searchLocator);
        search.sendKeys("IT STEP Academy");

        try {
            new WebDriverWait(driver, 0)
                    .until(ExpectedConditions.elementToBeClickable(
                            By.xpath("//inut[@name='btnK' and @type='submit']")))
                    .click();
        } catch (Exception e) {
            logger.error(e.getMessage());
            Assertions.fail("Something went wrong");
        }

        MatcherAssert.assertThat(driver.getCurrentUrl(), containsString("IT+STEP+Academy"));

        search = driver.findElement(searchLocator);
        search.clear();
        search.sendKeys("AAAAAAAAAAAAAAAAAAAAA");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
