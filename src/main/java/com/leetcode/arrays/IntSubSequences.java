package com.leetcode.arrays;

import java.util.Arrays;

import static java.lang.Math.max;

public class IntSubSequences {
    public static int longestIncreasingSubSeq(int[] nums) {
        var n = nums.length;
        var tempArr = new int[n];
        var ans = 1;
        Arrays.fill(tempArr, ans);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    tempArr[i] = max(tempArr[i], tempArr[j] + 1);
                    ans = max(tempArr[i], ans);
                }
            }
        }
        return ans;
    }

    public static int lengthOfLongestIncreasingSubSeq(int[] nums) {
        var dp = new int[nums.length];
        Arrays.fill(dp, 1);
        var maxLen = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                    maxLen = max(dp[i], maxLen);

                }
            }

        }
        return maxLen;
    }
}
