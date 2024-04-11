package com.leetcode.dynamicprograms;

import com.leetcode.arrays.MinCoinsToMakeAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCoinsToMakeAmtTest {

    @Test
    void minCoinsChange() {
        assertEquals(4, MinCoinsToMakeAmt.minCoinsChange(18, new int[]{7,5,1}));
    }
}