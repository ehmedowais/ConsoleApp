package com.leetcode.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Math.max;

//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
public class MaximumSumSubArray {

    public static int maximumSubArrayOfFixedLength(int[] array, int k) {

        int leftPtr = 0;

        int maxSum = 0;
        while(leftPtr < array.length -k){
            maxSum = max(maxSum,findSum(leftPtr, leftPtr+k, array) );
            leftPtr++;

        }
        return maxSum;
    }
    private static int findSum(int begIndex, int endIndex, int[] array) {
        int retVal = 0;
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int i=begIndex; i< endIndex; i++) {
            if(!set.contains(array[i])){
                retVal += array[i];
            }
            set.add(array[i]);
        }
        return retVal;
    }

    public static int findMaxSumOfSubArray(int[] array) {
        var curSum = 0;
        var maxSum = array[0];
        for(int val: array) {
            curSum = max(curSum,0);
            curSum += val;
            maxSum = max(maxSum, curSum);
        }
        return maxSum;
    }
}
