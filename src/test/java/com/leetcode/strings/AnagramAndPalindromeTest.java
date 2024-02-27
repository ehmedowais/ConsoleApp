package com.leetcode.strings;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramAndPalindromeTest {

    @Test
    void isAnagram() {
        assertTrue(AnagramAndPalindrome.isAnagram("abcde", "ceabd"));
        assertTrue(AnagramAndPalindrome.isAnagram("a gentleman", "elegant man"));
        assertFalse(AnagramAndPalindrome.isAnagram("a gentalman", "elegant man"));
    }
}