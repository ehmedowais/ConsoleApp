package com.leetcode.arrays;

public class SummingSquares {
    /*Write a method, summingSquares, that takes a target number as an argument. The method should return the minimum number of perfect squares that sum to the target.
    A perfect square is much the form (i*i) where i >= 1. For example: 1, 4, 9, 16 are perfect squares, but 8 is not perfect square.
    */

    public static int minSqrs(int target) {
        if(target == 0) {
            return 0;
        }
        if(target < 0) {
            return -1;
        }
        int sqrt = (int)Math.ceil(Math.sqrt(target));
        int[] sqrs = new int[sqrt-1];

        for(int i=1; i< sqrt; i++) {
            sqrs[i-1] = (i)*(i);
        }
        return minChange(sqrs, target);
    }

    public static int minChange(int[] nums, int target) {
        if(target == 0) {
            return 0;
        }
        if(target < 0) {
            return -1;
        }
        var minCount = Integer.MAX_VALUE;
        for(int num: nums) {
            var subAmount = target - num;
            var subCount = minChange(nums, subAmount) +1;
            minCount = Math.min(minCount, subCount);
        }
        return minCount != Integer.MAX_VALUE ? minCount : -1;
    }

    public static void main(String[] args) {
        System.out.println(minSqrs(12));
    }
}
