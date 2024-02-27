package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MinCoinsToMakeAmountTest {

    @Test
    void getMinCoinsToMakeAmount() {
        assertEquals(4, MinCoinsToMakeAmount.getMinCoinsToMakeAmount(new int[]{5,50}, 20, new HashMap<>()));
    }

    @Test
    void getMinCoinsToMakeAmountDPWayTest() {
        assertEquals(4, MinCoinsToMakeAmount.getMinCoinsToMakeAmountDPWay(new int[]{5,50}, 20));
        assertEquals(5, MinCoinsToMakeAmount.getMinCoinsToMakeAmountDPWay(new int[]{1}, 5));
    }
}