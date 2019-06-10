package com.sda.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator target = new Calculator();



//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void assertExamples(){
        assertEquals("Mesaj", 3, 3);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull("");
    }

    @Test
    public void add() {
        assertEquals(3, target.add(1, 2));

    }

    @Test (expected = ArithmeticException.class)

    public void testExeptopn(){
        target.divide(1, 0);
    }

    @Test (timeout = 2000)
    public void testTimeout(){
        try{
            Thread.sleep(3000);
            System.out.println("Am terminat procesul");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}