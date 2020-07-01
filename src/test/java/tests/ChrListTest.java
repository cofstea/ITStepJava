package tests;

import java.util.ArrayList;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

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

}
