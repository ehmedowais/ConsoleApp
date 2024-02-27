package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    public void longestSeqTest() {
        var longestSeq = LongestConsecutiveSequence.findLongestConsecutiveSeq(new int[]{100,4,200,1,3,2});
        assertEquals(longestSeq, 4);
        longestSeq = LongestConsecutiveSequence.findLongestConsecutiveSeq(new int[]{12,100,4,11,1,3,2,13,15,400,14,16});
        assertEquals(longestSeq, 6);
    }
}