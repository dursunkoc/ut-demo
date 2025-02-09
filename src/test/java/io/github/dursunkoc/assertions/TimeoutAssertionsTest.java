package io.github.dursunkoc.assertions;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class TimeoutAssertionsTest {

    @Test
    void testTimeoutAssertion() {
        assertTimeout(Duration.ofMillis(200), () -> {
            Thread.sleep(90);
            System.out.println("1 - Execution completed");
        });

        assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Thread.sleep(90);
            System.out.println("2 - Execution completed");
        });
    }
}
