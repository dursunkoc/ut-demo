package io.github.dursunkoc;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ClassLifecycleTest {
    @BeforeAll
    static void setUp() {
        System.out.println("Before all");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After all");
    }

    @Test
    void testExample1() {
        System.out.println("Test Example 1");
    }

    @Test
    void testExample2() {
        System.out.println("Test Example 2");
    }
}
