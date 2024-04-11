package com.leetcode.dynamicprograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackBasicTest {

    @Test
    void maximizeProfit() {
        assertEquals(100,KnapsackBasic.maximizeProfit(10, new int[]{1,3,4,6}, new int[]{20,30,10,50}));
        assertEquals(80,KnapsackBasic.maximizeProfit(9, new int[]{1,3,4,6}, new int[]{20,30,10,50}));
    }
}