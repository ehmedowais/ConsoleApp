package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void nthFibTest() {
        assertEquals(13,Fibonacci.findNthFib(6, new HashMap<>()));
        assertEquals(8,Fibonacci.findNthFib(5,new HashMap<>()));
    }

    @Test
    public void nthFibTabulationTest(){
        assertEquals(13, Fibonacci.findNthFibTabulation(7));
    }
}