package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntSubSequencesTest {

    @Test
    void longestIncreasingSubSeq() {
        assertEquals(3, IntSubSequences.longestIncreasingSubSeq(new int[]{2,3,4}));
        assertEquals(3, IntSubSequences.longestIncreasingSubSeq(new int[]{2,3,-1,4,0,1}));
        assertEquals(4, IntSubSequences.longestIncreasingSubSeq(new int[]{3,4,-1,0,6,2,3}));

        assertEquals(4, IntSubSequences.longestIncreasingSubSeq(new int[]{3,4,-1,0,6,2,3}));
    }
}