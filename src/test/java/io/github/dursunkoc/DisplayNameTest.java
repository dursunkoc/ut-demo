package io.github.dursunkoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayNameTest {
    @Test
    @DisplayName("Test add method")
    void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(1, 2);
        assertEquals(3, actual);
    }
}
