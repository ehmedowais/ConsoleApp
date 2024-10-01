package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveSumTest {

    @Test
    void getMaxConsecutiveSum() {
        assertEquals(15,MaxConsecutiveSum.getMaxConsecutiveSum(new int[]{2,3,5,7,-9,8,-11}, 3));
        assertEquals(28,MaxConsecutiveSum.getMaxConsecutiveSum(new int[]{2,3,5,7,9,8,11}, 3));
    }
}