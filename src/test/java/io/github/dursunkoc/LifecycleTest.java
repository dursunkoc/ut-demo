package io.github.dursunkoc;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {
    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @Test
    void testExample1() {
        System.out.println("Test example 1");
    }
    @Test
    void testExample2() {
        System.out.println("Test example 2");
    }
}
