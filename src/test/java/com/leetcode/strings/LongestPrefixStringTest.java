package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPrefixStringTest {

    @Test
    void findLongestCommonPrefix() {
        var result = LongestPrefixString.findLongestCommonPrefix(new String[]{"flower","flock","flick"});
        assertEquals("fl", result);
    }
}