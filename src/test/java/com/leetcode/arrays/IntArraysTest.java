package com.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class IntArraysTest {

    @Test
    void subSequenceTest() {
        IntArrays.printSubSequences(new int[]{3,5,7});
    }

    @Test
    void minCostTest() {
        Assertions.assertEquals(90, IntArrays.minCostOfSelectingNItems(new int[]{2, 4, 5, 4, 10}, new int[]{40, 30, 20, 10, 40}, 3));
    }

    @Test
    void subSequencesOfLenNTest() {
        var subSeqs = IntArrays.getSubSequencesOfLengthN(new int[]{1,2,3,4},3);
        subSeqs.forEach(seq -> {
            System.out.println();
            for(int i: seq){
                System.out.print(i);
        }});
    }
    @Test
    void genPemutationsTest() {
        var perms = IntArrays.getPermutations(new int[]{1,2,3});
        assertArrayEquals(perms.get(0).toArray(new Integer[0]), new Integer[]{1,2,3});
        perms.forEach(System.out::println);
    }
    @Test
    void generateCombinations() {
        System.out.println(IntArrays.generateCombinations(List.of(1,2,3)));
    }
    @Test
    void printSubSeqsTest() {
        IntArrays.printSubSequences(new int[]{1,2,3});
    }
}