package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PossiblePinCodeCombinationsTest {
    @Test
    public void generatePossiblePinsTest() {
        var result = PossiblePinCodeCombinations.generatePossibleCombinations("abcdefgh");
        System.out.println(result);
    }

}