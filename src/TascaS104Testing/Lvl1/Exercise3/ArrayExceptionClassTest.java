package TascaS104Testing.Lvl1.Exercise3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayExceptionClassTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayExceptionClass exceptionClass = new ArrayExceptionClass();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptionClass.triggerArrayIndexOutOfBoundsException();
        });
    }
}
