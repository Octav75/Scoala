package com.sda.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class TestLifecycle {

    @BeforeClass
    public static void init (){
        System.out.println("In Before Class");
    }

    @Before
    public void setUp(){
        System.out.println("In Before");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2 () {
        System.out.println("Test2");

    }

        @After
        public void tearDown() {
            System.out.println("In After");
        }

            @AfterClass
                    public static void destroy (){
                System.out.println("In After Class");
            }
}
