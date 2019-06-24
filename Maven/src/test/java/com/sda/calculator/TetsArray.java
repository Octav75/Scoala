package com.sda.calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


public class TetsArray {
    private List<String> list = new ArrayList<>();

    @Before
    public void setup(){
        list.add ("abc");
        list.add ("def");
        list.add ("xyz");
    }

    @Test
    public void testJunit(){
        /*
        vreau sa verific ca lista are:
        - exact 3 elemente;
        - lista contine "abc";
        - lista nu contine "sda";
         */

        assertEquals(3, list.size());
        assertTrue(list.contains("abc"));
        assertFalse(list.contains("sda"));

        boolean containsAbc = false;
        boolean containsSda = false;
        for (String temp : list){
            if (temp.equals("abc")){
                containsAbc = true;
            }
            if (temp.equals("sda")){
                containsSda = true;
            }
        }
        assertTrue(containsAbc);
        assertTrue(containsSda);
    }

    @Test
    public void testAssertJ(){
        assertThat(list).hasSize(3)  // Import Static Method ...
                        .contains("abc")
                        .doesNotContain("sda");
    }
}
