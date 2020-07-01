package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

@Tag("Parametrized")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public class Parametrized_Class_Tests {

    @ParameterizedTest(name = "Test with the {0} test data at {index} try to get {1}")
    @CsvSource(value = {"SsS-SSS", "AAA-AAA", "123-123", "slfd-SLFD"}, delimiter = '-')
    public void testUpperCaseMethod(String string, String expectedValue) {
        String actual = string.toUpperCase();
        Assertions.assertEquals(expectedValue, actual);
    }

    @Tag("ignore")
    @ParameterizedTest(name = "Test with the {0} test data")
    @NullAndEmptySource
    @ValueSource(strings = {"    "})
    public void testIsBlankString(String input) {
        Assertions.assertTrue(StringUtils.isBlank(input));
    }

}
