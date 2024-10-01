package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LeetCodePatternsTest {

    @Test
    void prefixSum() {

        assertEquals(9, LeetCodePatterns.prefixSum(new int[]{1, 2, 3, 4, 5, 6}, 1,3));
        assertEquals(9, LeetCodePatterns.prefixSumLinear(new int[]{1, 2, 3, 4, 5, 6}, 1,3));

    }
}