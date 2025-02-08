package io.github.dursunkoc;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestDurationReportExtension.class)
class ExtendedTest {

    @Test
    void test1() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    void test2() throws InterruptedException {
        Thread.sleep(3000);
    }

}
