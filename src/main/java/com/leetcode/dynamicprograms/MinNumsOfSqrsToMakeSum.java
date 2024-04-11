package com.leetcode.dynamicprograms;


import static java.lang.Math.min;

//This is a question where we will find minimum sqrs to make a number.
// For example, 26 = 5^2 +1 => 2 and 11 = 3^2 + 1 + 1
public class MinNumsOfSqrsToMakeSum {
    public static int minNumsOfSqrs(int n) {
        if(n <= 3) return n;
        if(n == 4) return 2;
        int ans = Integer.MAX_VALUE;
        for(int i =1; i*i < n; i++) {
            ans = min(ans, minNumsOfSqrs(n-i*i)+1);
        }
        return ans;
    }
}
