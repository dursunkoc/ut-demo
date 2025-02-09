package io.github.dursunkoc.mocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceTest {
    @InjectMocks
    Service service;

    @Mock
    Dependency dependency;

    @Spy
    MapperImpl mapper;

    @Captor
    ArgumentCaptor<Data> captor;

    @Test
    void testProcessWhenDataIsNotAvailableShouldProcessEmptyData() {
        when(dependency.getData()).thenReturn(new Data(""));
        Data actual = service.process();
        assertEquals("Processing - ", actual.getData());
    }

    @Test
    void testProcessWhenDataIsAvailableShouldProcessTheData() {
        when(dependency.getData()).thenReturn(new Data("the data"));
        Data actual = service.process();
        assertEquals("Processing - the data", actual.getData());
    }

    @Test
    void testProcessAndMapWhenDataIsNullShouldReturnLengthOfEmptyDataResult() {
        when(dependency.getData()).thenReturn(new Data(""));
        int actual = service.processAndMapResult();
        assertEquals(13, actual);
        //verify(mapper, times(1)).map(new Data("Processing - "));
        verify(mapper, times(1)).map(captor.capture());
        assertEquals("Processing - ", captor.getValue().getData());
    }

}