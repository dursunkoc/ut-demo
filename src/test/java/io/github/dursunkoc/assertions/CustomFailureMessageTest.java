package io.github.dursunkoc.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomFailureMessageTest {
    @Test
    void testCustomFailureMessage() {
        String name = "Junit 5";
        assertEquals("Junit 5", name, "Name should be Junit 5");
    }
}
