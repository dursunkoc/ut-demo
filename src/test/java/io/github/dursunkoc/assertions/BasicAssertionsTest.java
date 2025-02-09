package io.github.dursunkoc.assertions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAssertionsTest {
    @Test
    void testBasicAssertions(){
        String name = "Junit 5";
        assertNotNull(name);
        assertEquals("Junit 5", name);
        assertNotEquals("JUnit 4", name);
        assertTrue(name.startsWith("Junit"));
        assertFalse(name.endsWith("4"));
    }
}
