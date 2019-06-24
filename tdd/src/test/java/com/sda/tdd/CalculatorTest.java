package com.sda.tdd;
/*
 * Create a simple String calculator containing a method 'add'
 * Contract should look like: int add(String numbers)
 * Input should be numbers separated by ','
 *
 * Method rules (TDD steps):
 *   For an empty string it will return 0
 *   The method can take 0, 1 or 2 numbers as parameters (limited)
 *   The method should return the numbers' sum
 *   Allow the Add method to handle an unknown amount of numbers
 *   Allow the Add method to handle new lines between numbers
 *     instead of only commas)
 *   The following input is ok: “1\n2,3” (will equal 6)
 * Calling add(numbers) with a negative number will throw an
 * exception with the message “negatives not allowed”
 */

import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator target = new Calculator();

    @Test
    public void test1() {
        assertEquals(0, target.add(""));
    }
    @Ignore("design changed")
    @Test (expected = IllegalArgumentException.class)
    public void test2 (){
        target.add("1, 2, 3");
    }

    @Test
    public void test3 () {
        assertEquals(3, target.add("1,2"));
    }

    @Test
    public void test4(){
        assertEquals (10 + 55 + 124234 + 23 + 1, target.add("10,55,124234,23,1"));
    }

    @Test
    public void test5(){
        assertEquals(6, target.add("1\n2,3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        target.add("-1,2,3,4,5,6,7,8");
    }

    /*
     * Create a method 'product'
     * Contract should look like: long product(List<String> numbers)
     *
     * Method rules (TDD steps):
     * For an empty input return 0
     * The method can take 0, 1 or 2 elements inside the parameter (limited)
     * The method should return the numbers' product
     * Allow the product method to handle an unknown amount of numbers
     * product should only receive numbers smaller than 20
     */

    List<String> numbers = new LinkedList<>();

    @Test
    public void test11(){
        assertEquals(0, target.product(numbers));
    }

    @Ignore("design change")
    @Test(expected = IllegalArgumentException.class)
    public void test12 (){
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        target.product(numbers);
    }

    @Test
    public void test13(){
        assertEquals(3*4, target.product(numbers));
    }

    @Test
    public void test14(){
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        assertEquals(120, target.product(numbers));
    }

    @Test
    public void test15 (){
        numbers.add("21");
        numbers.add("10");
        numbers.add("15");
        assertEquals(212, target.product(numbers));
    }
}