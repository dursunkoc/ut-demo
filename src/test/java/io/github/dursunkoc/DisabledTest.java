package io.github.dursunkoc;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledTest {
    @Test
    @Disabled("This test is disabled until the bug #123 is fixed")
    void testWillBeSkipped() {
        System.out.println("This test will be skipped");
    }
    @Test
    void testWillBeExecuted() {
        System.out.println("This test will be executed");
    }
}
