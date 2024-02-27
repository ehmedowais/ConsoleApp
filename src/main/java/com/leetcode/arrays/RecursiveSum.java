package com.leetcode.arrays;

import java.util.Arrays;

public class RecursiveSum {
    public static int findSum(int[] nums){
        return _findSum(nums, 0);
    }
    public static int _findSum(int[] nums, int index){
        if(nums.length == index) {
            return 0;
        }
        return nums[index] + _findSum(nums, index+1);
    }
}
