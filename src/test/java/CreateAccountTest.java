import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAccountTest {

    private final static Logger logger = LoggerFactory.getLogger(CreateAccountTest.class);

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Create new account and login successfully")
    public void createAccountTest() {
        String gender = "Mrs.";

        driver.navigate().to("http://automationpractice.com");
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php"));
        logger.info("I am on the {} tab title", driver.getTitle());

        driver.findElement(By.cssSelector("a.login")).click();

        Assertions.assertTrue(driver.getCurrentUrl().endsWith("index.php?controller=authentication&back=my-account"));

        By loginFormLocator = By.id("login_form");
        By createAccountFormLocator = By.id("create-account_form");

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.className("page-heading"), "AUTHENTICATION"));

        WebElement loginForm = driver.findElement(loginFormLocator);
        WebElement createAccountForm = driver.findElement(createAccountFormLocator);

        Assertions.assertTrue(loginForm.isDisplayed(), "Login Form is not displayed");
        Assertions.assertTrue(createAccountForm.isDisplayed());

        WebElement emailInput = createAccountForm.findElement(By.id("email_create"));
        emailInput.sendKeys("constantin.bivol" +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + "@getnada.com");

        createAccountForm.findElement(By.id("SubmitCreate")).click();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.className("page-heading"), "CREATE AN ACCOUNT"));
        MatcherAssert.assertThat(driver.getCurrentUrl(), Matchers.endsWith("#account-creation"));

        WebElement creationAccountForm = driver.findElement(By.id("account-creation_form"));
        Assertions.assertTrue(creationAccountForm.isDisplayed());

        WebElement genderElement = creationAccountForm.findElement(
                By.xpath("//label[contains(@for,'id_gender') and normalize-space()='" + gender + "']//input"));
        genderElement.click();

        WebElement date = creationAccountForm.findElement(By.id("days"));
        WebElement month = creationAccountForm.findElement(By.id("months"));
        WebElement year = creationAccountForm.findElement(By.id("years"));

        new Select(date).selectByIndex(30);
        new Select(month).selectByVisibleText("September ");
        new Select(year).selectByValue("1995");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
