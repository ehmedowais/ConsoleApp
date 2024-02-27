package com.leetcode.arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class TwoPointers {
    // https://leetcode.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {
        int lIndex = 0;
        int rIndex = height.length -1;
        int max = 0;
        while(lIndex < rIndex){
            var area = (rIndex - lIndex)* Math.min(height[lIndex], height[rIndex]);
            max = Math.max(max, area);
            if(height[lIndex] > height[rIndex]){
                rIndex--;
            }else if(height[lIndex] < height[rIndex]){
                lIndex++;
            }else {
                lIndex++;
                rIndex--;
            }
        }
        return max;
    }
    // https://leetcode.com/problems/trapping-rain-water/
    public static int trap(int[] heights) {

        int n=heights.length;
        int lIndex = 0;
        int rIndex = n -1;
        int rMax=0,lMax = 0;
        int max = 0;

        for(int i=0;i<n; i++){
            rIndex = i+1;
            while(rIndex < n ){
                rMax = max(rMax, heights[rIndex]);
                rIndex++;
            }


            lIndex = i-1;
            while(lIndex >= 0  ){
                lMax = max(lMax, heights[lIndex]);
                lIndex--;
            }

            max += max(min(rMax, lMax) - heights[i],0);
            lMax = rMax = 0;
        }
        return max;
    }
}
