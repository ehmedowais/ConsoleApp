package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackOperationsTest {

    @Test
    void evaluateReversePolishNotation() {
        assertEquals(9, StackOperations.evaluateReversePolishNotation(new String[]{"2","1","+","3","*"}));
        assertEquals(1, StackOperations.evaluateReversePolishNotation(new String[]{"2","1","3","+", "5","-"}));
        assertEquals(4, StackOperations.evaluateReversePolishNotation(new String[]{"2","4","3","*", "6","/"}));
    }
    @Test
    void findDaysToGetHigherTempTest() {
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, StackOperations.findDaysToGetHigherTemp(new int[]{73,74,75,71,69,72,76,73}));
    }
    @Test
    void findNoOfCarsReachingTargetTest() {
        assertEquals(2, StackOperations.numberOfCarsReachingDestination(10, new int[]{6,8}, new int[]{3,2}));
    }

    @Test
    void maxHistogramAreaTest(){
        assertEquals(10, StackOperations.maxAreaOfHistogram(new int[]{1,3,1,2,4,5,3,2,1}));
        assertEquals(10, StackOperations.maxAreaOfHistogram(new int[]{2,1,5,6,2,3}));
        assertEquals(4, StackOperations.maxAreaOfHistogram(new int[]{2,4}));
    }
}