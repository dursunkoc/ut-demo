package io.github.dursunkoc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedExampleTest {
    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "refer"})
    void testIsPalindrome(String word) {
        assertEquals(word, new StringBuilder(word).reverse().toString());
    }
}
