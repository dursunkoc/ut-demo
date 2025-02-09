package io.github.dursunkoc.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupedAssertionsTest {
    @Test
    void testGroupedAssertions(){
        String name = "Junit 5";
        assertAll("Grouped Assertions",
                () -> assertNotNull(name),
                () -> assertEquals("Junit 5", name),
                () -> assertTrue(name.startsWith("Junit")),
                () -> assertFalse(name.contains("4")),
                () -> assertNotEquals("Jupiter", name)
        );
    }
}
