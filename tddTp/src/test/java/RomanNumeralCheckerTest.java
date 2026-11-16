import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumeralCheckerTest {

    private RomanNumeralChecker checker;

    @BeforeEach
    void setUp() {
        checker = new RomanNumeralChecker();
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, I", "2, II", "3, III", "4, IV", "5, V", "9, IX", "10, X"
    })
    @DisplayName("Simple cases from the first Gherkin scenarios")
    void shouldConvertSimpleNumbers(int input, String expected) {
        assertEquals(expected, checker.toRoman(input));
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "14, XIV", "19, XIX", "40, XL", "49, XLIX", "90, XC", "99, XCIX",
            "400, CD", "444, CDXLIV", "500, D", "900, CM", "999, CMXCIX", "1000, M"
    })
    @DisplayName("Subtractive notation and larger values")
    void shouldConvertSubtractiveAndLargeNumbers(int input, String expected) {
        assertEquals(expected, checker.toRoman(input));
    }

    @Test
    @DisplayName("Rejects numbers below 1")
    void shouldRejectZeroAndNegatives() {
        assertThrows(IllegalArgumentException.class, () -> checker.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> checker.toRoman(-5));
    }

    @Test
    @DisplayName("Rejects numbers above 3999")
    void shouldRejectTooLargeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> checker.toRoman(4000));
    }
}
