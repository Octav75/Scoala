package com.sda.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ParameterizedTest {

    @Parameter (0)  // este optional nu trnuie pus in paranteze;
    public int parametru1;
    @Parameter (1)
    public int parametru2;
    @Parameter (2)
    public int parametru3;
    private Calculator target = new Calculator();

    @Parameters
    public static Collection<Integer[]> data (){
        return Arrays.asList(
                new Integer[][]{
                        {1, 1, 3}, // should failed;
                        {10, 15,25},
                        {1, 2, 3},
                        {16, 9,25}, // se pune , dupa fiecare linie;
                        {1000, 2500, 3500} // Atentie: la ultimul rand NU!!! se pune , dupa fiecare linie;
                }
        ); // ATENTIE: sa nu uit sa inchid aici returnul;
    }

    @Test
    public void testAdd(){
        assertEquals (parametru3, target.add(parametru2, parametru1));
    }
}