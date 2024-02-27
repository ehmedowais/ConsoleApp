package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    void isValidString() {
        assertTrue(ValidParenthesis.isValidString("(){}[]"));
        assertTrue(ValidParenthesis.isValidString("{[()]}"));
        assertTrue(ValidParenthesis.isValidString("{[]()[]}"));
        assertFalse(ValidParenthesis.isValidString("{[)(][]}"));
    }
}