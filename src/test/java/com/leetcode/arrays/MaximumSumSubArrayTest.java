package com.leetcode.arrays;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumSubArrayTest {

    @Test
    public void mximumSumTest() {
        assertEquals(15, MaximumSumSubArray.maximumSubArrayOfFixedLength(new int[]{1,5,4,2,9,9,9},3));
        assertEquals(0, MaximumSumSubArray.maximumSubArrayOfFixedLength(new int[]{4,4,4},3));
    }
    @Test
    public void maxSubarraySumTest() {
        assertEquals(7,MaximumSumSubArray.findMaxSumOfSubArray(new int[]{4,-1,2,-7,3,4}));
        assertEquals(-1,MaximumSumSubArray.findMaxSumOfSubArray(new int[]{-4,-1,-2,-7,-3,-4}));
    }

}
