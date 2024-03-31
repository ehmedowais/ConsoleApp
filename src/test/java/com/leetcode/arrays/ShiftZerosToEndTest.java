package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftZerosToEndTest {

    @Test
    void shiftDigits() {
        var arr= new int[]{1, 0,2,0,3,4,0,5};
        ShiftZerosToEnd.shiftDigits(arr);
        assertArrayEquals(arr, new int[]{1,2,3,4,5,0,0,0});
        arr=new int[]{1,0,0,0,2,0};
        ShiftZerosToEnd.shiftDigits(arr);
        assertArrayEquals(arr, new int[]{1,2,0,0,0,0});
    }
}