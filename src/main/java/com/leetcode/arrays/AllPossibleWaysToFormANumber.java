package com.leetcode.arrays;

public class AllPossibleWaysToFormANumber {

    public static int numberOfWays(int[] nums, int target) {
        return recursiveFunction(nums, target, 0, 0);
    }

    public static int recursiveFunction(int[] nums, int subTarget, int index, int counter) {
        if(nums.length >= index) {
            return counter;
        }
        for(int i=0; i< nums.length; i++) {
            var number = recursiveFunction(nums, subTarget - i, index, counter);
        }
        return 0;
    }
}
