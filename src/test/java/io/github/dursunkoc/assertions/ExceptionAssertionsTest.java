package io.github.dursunkoc.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionAssertionsTest {
    @Test
    void testExceptionAssertion(){

        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        }, "Division by zero should throw ArithmeticException");

        assertEquals("/ by zero", arithmeticException.getMessage());

    }
}
