package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FindIfSumPossibleTest {
    @Test
    public void isSumExists() {
        assertTrue(FindIfSumPossible.solution(new int[]{1,2,3},4, new HashMap<>()));
        assertFalse(FindIfSumPossible.solution(new int[]{2},17, new HashMap<>()));
    }

}