package com.leetcode.arrays;

public class ShiftZerosToEnd {
    public static void shiftDigits(int[] nums){
        //[1,0,2,0,3,4,0,5]
        if(nums == null || nums.length == 0) return;
        int prevIndex=0;
        int nextIndex=0;
        int len = nums.length;
        while(nextIndex < len && prevIndex < len) {
            if(nums[prevIndex] != 0 && nums[nextIndex] != 0){
                nextIndex++;
                prevIndex++;
            }
            if(nums[nextIndex] == 0 && nums[prevIndex] == 0) {
                while(nextIndex <len && nums[nextIndex] ==0){
                    nextIndex++;
                }
            }
            if(nums[prevIndex] == 0 && nums[nextIndex] !=0){
                nums[prevIndex] = nums[nextIndex];
                nums[nextIndex] = 0;
                while(nums[prevIndex] != 0){
                    prevIndex++;
                }
                while(nextIndex <len && nums[nextIndex] ==0){
                    nextIndex++;
                }
            }


        }
        while(prevIndex < len){
            nums[prevIndex++]=0;
        }
    }
}
