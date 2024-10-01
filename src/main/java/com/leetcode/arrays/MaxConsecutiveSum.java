package com.leetcode.arrays;

public class MaxConsecutiveSum {
    public static int getMaxConsecutiveSum(int[] array){
        if(array.length < 3){
            return 0;
        }
        int maxSum = 0;
        int len = array.length;
        for(int i =1; i< len -2; i++){
            maxSum = Math.max(maxSum, array[i -1] + array[i]+ array[i +1]);
        }
        return maxSum;
    }
    public static int getMaxConsecutiveSum(int[] array, int windowSize){
        if(array.length < windowSize){
            return 0;
        }
        int maxSum = 0;
        int prevSum = 0;
        int len = array.length;
        for(int i=0;i< windowSize; i++) {
            prevSum += array[i];
        }


        for(int k=1; k<= len - windowSize; k++){
            maxSum = Math.max(maxSum, prevSum);
            var nthIndex = k + windowSize -1;
            prevSum = prevSum - array[k -1]+ array[nthIndex];
        }
        return Math.max(maxSum, prevSum);
    }
}
