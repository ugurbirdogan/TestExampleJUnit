package com.company;

import org.junit.jupiter.api.*;

public class MainTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }
    @Test
    public void positiveValue(){
        int number = 1923;
        Main main = new Main();
        boolean expResult = true;
        boolean result = main.isPositive(number);
        Assertions.assertEquals(expResult, result);
    }
    @Test
    public void negativeValue(){
        int number = -1923;
        Main main = new Main();
        boolean expResult = false;
        boolean result = main.isPositive(number);
        Assertions.assertEquals(expResult, result);
    }
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }

}
