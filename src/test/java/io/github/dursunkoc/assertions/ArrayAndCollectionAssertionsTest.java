package io.github.dursunkoc.assertions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ArrayAndCollectionAssertionsTest {
    @Test
    void testArrayAndCollectionAssertions() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers);

        Iterable<String> fruits = List.of("Apple", "Banana", "Orange");
        assertIterableEquals(List.of("Apple", "Banana", "Orange"), fruits);

        List<String> lines = Arrays.asList("Line 1", "Line 2", "Line 3");
        assertIterableEquals(List.of("Line 1", "Line 2", "Line 3"), lines);
    }
}
