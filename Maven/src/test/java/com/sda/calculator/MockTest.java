package com.sda.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    @Mock
    private Calculator calculator;

    private Calculator obiectValid = new Calculator();
    private Calculator spion = spy(obiectValid);
    private Object toBeReturned;

    @Before
    public void setup(){
//        when(calculator.add(1,1)).thenReturn(3); // test cu spiom;
//        doReturn(toBeReturned 10).when(spion).add(1,1);

    }

    @Test
    public void testAdd(){
        assertEquals(3, calculator.add(1,1));

        verify(calculator.add(anyInt(), anyInt()));
//        verify(calculator, times(wantedNumberOfInvocations: 5)).add(anyInt()), anyInt() ;
        // verify (mock, never()).add(any(), any());
        // verify (mock, atLeast(1)).add(any(), any());
        // verify (mock, atMost(4)).add(any(), any());
        // verify (mock, times(x)).add(any(), any());
    }
}