package com.leetcode.strings;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayTest {
    @Test
    public void getMaxLenSubArrayWithoutRepetetion() {
        assertEquals(3, SubArray.getMaxLenSubArrayWithoutRepeatingChar("acbbcdd"));
        assertEquals(1, SubArray.getMaxLenSubArrayWithoutRepeatingChar("aaaaaa"));
    }

    @Test
    public void isStringConstructableTest() {
        var temp = new ArrayList<String>();
        temp.addAll(Arrays.stream(new String[]{"is", "pa","k", "tan"}).toList());
        assertTrue(SubArray.isStringConstructable("pakistan", temp, new HashMap<>()));
        assertFalse(SubArray.isStringConstructable("uzbakistan", temp, new HashMap<>()));
        temp = new ArrayList<>();
        temp.addAll(Arrays.stream(new String[]{"ab", "abc","cd", "def", "abcd"}).toList());
        assertTrue(SubArray.isStringConstructable("abcdef", temp, new HashMap<>()));
        temp.removeAll(temp.stream().toList());
        temp.addAll(List.of(new String[]{"e", "eee", "eeee","f"}));
        assertTrue(SubArray.isStringConstructable("eeeeeeeeeeeeeeeeeeeeeeeef", temp, new HashMap<>()));
    }
    @Test
    public void countWaysToConstructString(){

        assertEquals(1, SubArray.countWaysToConstructString("pakistan", new String[]{"is", "pa","k", "tan"}));

    }

    @Test
    public void possibleWaysToConstructString(){

        var x = SubArray.possibleCombinations("pakistan", new String[]{"is", "pa","k", "tan"}, new ArrayList<>());
        System.out.println(x);

    }


}