package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubSeqTest {

    @Test
    void lengthOfLongestCommonSubSeq() {
        assertEquals(2, LongestCommonSubSeq.lengthOfLongestCommonSubSeq("ABAC", "DBDC"));
        assertEquals(3, LongestCommonSubSeq.lengthOfLongestCommonSubSeq("ABCAB", "AECB"));
    }
}