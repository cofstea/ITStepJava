package tests;

import java.util.ArrayList;

import org.assertj.core.api.SoftAssertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

import com.itstep.lesson._11.homeWork.CharList;

@Tags({@Tag("smoke"), @Tag("CharList")})
@DisplayName("CharList class Test")
public class ChrListTest {

    private static CharList testData = null;

    @BeforeEach
    public void prepareTestData() {
        testData = new CharList("Hello");
    }

    @Test
    public void charListClearMethodTest() {
        CharList actual = testData.clearList();
        MatcherAssert.assertThat(actual.internalCharList, is(Matchers.empty()));
    }

    @Test
    @DisplayName("Validate the reverse as String value method from CharList class")
    public void charListReverseAsStringMethodTest() {
        String reversedStringResult = testData.reverseList().toString();
        MatcherAssert.assertThat(reversedStringResult, Matchers.equalToIgnoringCase("olleh"));
    }

    @Test
    @DisplayName("Validate the reverse as ArrayList value method from CharList class")
    public void charListReverseAsArrayListMethodTest() {
        ArrayList<Character> reversedArrayResult = testData.reverseList().internalCharList;
        MatcherAssert.assertThat(reversedArrayResult, Matchers.contains('o', 'l', 'l', 'e', 'H'));
    }

    @Test
    public void checkAsBoolean() {
        double result = 0;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        // MatcherAssert.assertThat(result, equalTo(0));
        MatcherAssert.assertThat(result, allOf(
                not(equalTo(0d)),
                lessThan(33d),
                greaterThan(0d))
        );

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(result).isEqualTo(1);
        softAssertions.assertThat(result1).isBetween(-1d, 1d);
        softAssertions.assertThat(result2).isGreaterThan(-10);
        softAssertions.assertThat(result3).isLessThan(33);
        softAssertions.assertThat(result4).asString().startsWith("1");

        softAssertions.assertAll();

        // Assertions.assertThat(result)
        //         .isEqualTo(1)
        //         .isBetween(-1d, 1d)
        //         .isGreaterThan(-10)
        //         .isLessThan(33)
        //         .asString()
        //         .startsWith("1");
    }

    // |id|username|password|full name       |
    // |1 |cofstea |test1234|Bivol Constantin|
    // |2 |cofstea |test1234|Bivol Constantin|
    // |3 |cofstea |test1234|Bivol Constantin|
    // |4 |cofstea |test1234|Bivol Constantin|
    // |5 |cofstea |test1234|Bivol Constantin|  -> List<User>
}
