import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzzChecker fizzBuzzChecker;

    @BeforeEach
    void setUp() {
        fizzBuzzChecker = new FizzBuzzChecker();
    }

    @ParameterizedTest(name = "Pour {0}, doit retourner \"{1}\"")
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "7, '7'"
    })
    @DisplayName("Retourne le nombre en chaîne de caractères s'il n'est ni multiple de 3 ni de 5")
    void shouldReturnNumberAsString(int input, String expected) {
        assertEquals(expected, fizzBuzzChecker.isFizzBuzz(input));
    }

    @ParameterizedTest(name = "Pour {0}, doit retourner \"Fizz\"")
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Retourne \"Fizz\" pour les multiples de 3")
    void shouldReturnFizzForMultiplesOfThree(int input) {
        assertEquals("Fizz", fizzBuzzChecker.isFizzBuzz(input));
    }

    @ParameterizedTest(name = "Pour {0}, doit retourner \"Buzz\"")
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Retourne \"Buzz\" pour les multiples de 5")
    void shouldReturnBuzzForMultiplesOfFive(int input) {
        assertEquals("Buzz", fizzBuzzChecker.isFizzBuzz(input));
    }

    @ParameterizedTest(name = "Pour {0}, doit retourner \"FizzBuzz\"")
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("Retourne \"FizzBuzz\" pour les multiples de 3 et 5")
    void shouldReturnFizzBuzzForMultiplesOfThreeAndFive(int input) {
        assertEquals("FizzBuzz", fizzBuzzChecker.isFizzBuzz(input));
    }
}