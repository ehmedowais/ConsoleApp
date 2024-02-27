package com.leetcode.arrays;

// In this question, we are going to find the maximum sum from numbers in array where numbers should not be adjacent.
// This is the same question where a thief is going to steal from the houses, but he cannot steal from adjacent houses.
public class NonAdjacentMaxSum {
    public static int maxSumFromNonAdjacentNumbers(int[] nums){

        return maxSum(nums, 0);
    }
    public static int maxSum(int[] nums, int index) {
        var oddIndicesSum=0;
        var evenIndicesSum =0;
        if(index >=  nums.length) {
            return 0;
        }
        oddIndicesSum = maxSum(nums, index+1);
        evenIndicesSum = nums[index] + maxSum(nums, index+2);

        return Math.max(evenIndicesSum, oddIndicesSum);
    }
    public static void main(String[] args) {
        System.out.println(maxSumFromNonAdjacentNumbers(new int[]{1,4,2}));
    }
}
