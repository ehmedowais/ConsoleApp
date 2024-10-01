package com.leetcode.arrays;

/*Below 15 patterns from algomast.io https://blog.algomaster.io/p/15-leetcode-patterns should help to solve the problems */
public class LeetCodePatterns {
    //First Pattern. Prefix sum

    public static int prefixSum(int[] array, int startIndex, int endIndex ){
        int[] prefixArray = new int[array.length];
        prefixArray[0] = array[0];
        for(int i=1;i<prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1]+array[i];
        }
        return prefixArray[endIndex] - prefixArray[startIndex -1];

    }
    public static int prefixSumLinear(int[] array, int startIndex, int endIndex ) {
        int sum =0;
        for(int i=startIndex; i<= endIndex; i++) {
            sum += array[i];
        }
        return sum;
    }
}
