import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.containsString;

public class SeleniumTest {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbivol\\Documents\\JustBe Inf\\ITStepJava\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IT STEP Academy");
        driver.findElement(By.xpath("//input[@name='btnK' and @type='submit']")).click();

        MatcherAssert.assertThat(driver.getCurrentUrl(), containsString("IT+STEP+Academy"));

        driver.close();
    }

}
