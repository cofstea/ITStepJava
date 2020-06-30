import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@DisplayName("My First Test Of Even Numbers")
public class FirstTest {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String adultAge(int age) {
        return age >= 18 ? "Yes" : "no";
    }

    @Test()
    @RepeatedTest(5)
    @DisplayName("Happy path for is even functionality")
    public void isEvenTest() {
        boolean result = isEven(20);
        MatcherAssert.assertThat(result, is(true));
    }

    @Test
    @DisplayName("Negative case for is even functionality")
    public void isNotEvenTest() {
        boolean result = isEven(19);
        MatcherAssert.assertThat(result, is(false));
    }

    @Test
    @DisplayName("Test the adult age functionality returning expected Yes or No")
    public void ageAdultTest() {
        String actualNo = adultAge(17);
        MatcherAssert.assertThat(actualNo, equalToIgnoringCase("no"));

        String actualYes = adultAge(18);
        MatcherAssert.assertThat(actualYes, equalToIgnoringCase("yEs"));
    }

}
