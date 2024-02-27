package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveSumTest {

    @Test
    void findSum() {
        assertEquals(7,RecursiveSum.findSum(new int[]{1,2,4}));
    }
}