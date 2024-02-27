package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointersTest {

    @Test
    void maxArea() {
        assertEquals(49, TwoPointers.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, TwoPointers.maxArea(new int[]{1,1}));
        assertEquals(6, TwoPointers.maxArea(new int[]{2,3,3,2}));
    }

    @Test
    void trapWaterTest() {
        assertEquals(3, TwoPointers.trap(new int[]{2,1,5,6,1,3}));
        assertEquals(4, TwoPointers.trap(new int[]{2,1,0,1,3}));
        assertEquals(1, TwoPointers.trap(new int[]{1,0,1}));
        assertEquals(0, TwoPointers.trap(new int[]{1,2,1}));
    }
}