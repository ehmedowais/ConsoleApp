package com.leetcode.arrays;

import java.util.HashMap;

public class TwoSum {
    //This below method uses O(n)^2 complexity
    public static int[] twoSumSquaredComplexity(int[] array, int target) {

        int lPtr = 0;
        int rPtr = 1;
        int val = -1;
        while(lPtr < rPtr) {
            while (rPtr < array.length) {
                val = array[lPtr] + array[rPtr];
                if (val == target) {
                    return new int[]{lPtr, rPtr};
                }
                rPtr++;
            }
            lPtr++;
        }
        return new int[]{};
    }

    public static int[] twoSumLinearComplexity(int[] array, int target) {
        var map = new HashMap<Integer, Integer>();
        for(int i=0; i< array.length; i++) {
            if(map.containsKey(target - array[i])) {
                return new int[] {map.get(target - array[i]), i};
            }else {
                map.put(target - array[i], i);
            }
        }
        return new int[]{};
    }
}
