package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IfSomePossibleTest {

    @Test
    void ifSumPossibleTabulationMethod() {
        assertTrue(IfSomePossible.ifSumPossibleTabulationMethod(new int[]{3,4,5},7));
        assertFalse(IfSomePossible.ifSumPossibleTabulationMethod(new int[]{2,4},7));
    }

    @Test
    void howSumPossible(){
        assertArrayEquals(new Integer[]{4,3}, IfSomePossible.howSumPossible(new int[]{3,4,5},7));
        //assertArrayEquals(new Integer[]{2,3,4}, IfSomePossible.howSumPossible(new int[]{3,4,5},7));
        var result = IfSomePossible.howSumPossible(new int[]{2,3,5},8);
        Arrays.stream(result).sorted().forEach(System.out::println);
    }

    @Test
    void bestPossibleSum(){
        var result = IfSomePossible.bestSumPossible(new int[]{2,3,5},8);
        Arrays.stream(result).sorted().forEach(System.out::println);
    }
}