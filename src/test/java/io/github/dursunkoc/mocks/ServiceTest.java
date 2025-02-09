package io.github.dursunkoc.mocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {
    @InjectMocks
    Service service;

    @Mock
    Dependency dependency;

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(service, "mapper", new MapperImpl());
    }

    @Test
    void testProcessWhenDataIsNotAvailableShouldProcessEmptyData() {
        when(dependency.getData()).thenReturn("");
        String actual = service.process();
        assertEquals("Processing - ", actual);
    }

    @Test
    void testProcessWhenDataIsAvailableShouldProcessTheData() {
        when(dependency.getData()).thenReturn("the data");
        String actual = service.process();
        assertEquals("Processing - the data", actual);
    }

    @Test
    void testProcessAndMapWhenDataIsNullShouldReturnLengthOfEmptyDataResult() {
        when(dependency.getData()).thenReturn("");
        int actual = service.processAndMapResult();
        assertEquals(13, actual);
    }


}