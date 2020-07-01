package tests;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@Tag("regression")
@Tag("smoke")
@DisplayName("My First Test Of Even Numbers")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTest {

    private static LocalDate reportDate;

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String adultAge(int age) {
        return age >= 18 ? "Yes" : "no";
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Test has started " + LocalTime.now());
    }

    @BeforeEach
    public void before1EachTest() {
        System.out.println("Test has started additional " + LocalTime.now());
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Test has finished " + LocalTime.now());
    }

    @AfterEach
    public void after1EachTest() {
        System.out.println("Test has finished additional " + LocalTime.now());
    }

    @Test
    @Order(value = 1)
    @DisplayName("Happy path for is even functionality")
    public void isEvenTest() {
        boolean result = isEven(20);
        MatcherAssert.assertThat(result, is(true));
        System.out.println(reportDate + " Assertion passed successfully for isEvenTest()");
    }

    @Test
    @Order(value = 2)
    @DisplayName("Negative case for is even functionality")
    public void isNotEvenTest() {
        boolean result = isEven(19);
        MatcherAssert.assertThat(result, is(false));
        System.out.println("Assertion passed successfully for isNotEvenTest()");
    }

    @Tag("Adult")
    @Test
    @Order(value = 3)
    @DisplayName("Test the adult age functionality returning expected Yes or No")
    public void ageAdultTest() {
        String actualNo = adultAge(17);
        MatcherAssert.assertThat(actualNo, equalToIgnoringCase("no"));

        String actualYes = adultAge(18);
        MatcherAssert.assertThat(actualYes, equalToIgnoringCase("yEs"));

        System.out.println("Assertion passed successfully for ageAdultTest()");
    }

    @BeforeAll
    public static void beforeAllTest() {
        reportDate = LocalDate.now();
        System.out.println(" Tests Report on date " + reportDate + " has begun  ");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println(" Tests Report on date " + reportDate + " has finished  ");
    }

}
