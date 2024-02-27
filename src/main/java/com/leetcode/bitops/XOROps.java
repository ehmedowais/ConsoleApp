package com.leetcode.bitops;

import java.math.BigInteger;

public class XOROps {
    public static int lonelyElement(int[] nums) {
        var result = nums[0];
        for(int i=1;i<nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}
