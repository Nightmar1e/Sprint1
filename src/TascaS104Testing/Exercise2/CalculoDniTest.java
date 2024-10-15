package TascaS104Testing.Exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, F",
            "44444444, M",
            "55555555, G",
            "66666666, N",
            "77777777, R",
            "88888888, P"
    })
    public void testCalculateLetter(int dniNumber, char expectedLetter) {
        char actualLetter = CalculoDni.calculateLetter(dniNumber);
        assertEquals(expectedLetter, actualLetter, "The DNI letter calculation is incorrect");
    }
}
