package io.github.dursunkoc.mocks;

import io.github.dursunkoc.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockExampleTest {

    @Mock
    Calculator calculator;

    @Test
    void testAddMock() {
        when(calculator.add(1, 2)).thenReturn(18);
        int result = calculator.add(1, 2);
        assertEquals(18, result);
    }

    @Test
    void testAddMockWithAnswer() {
        when(calculator.add(1, 3)).then(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a*a + b*b;
        });
        int result = calculator.add(1, 3);
        assertEquals(10, result);
    }
}
