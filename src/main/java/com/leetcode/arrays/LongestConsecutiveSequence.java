package com.leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSeq(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        var ans = 0;
        for(int num : nums) {
            if(!set.contains(num-1)){
                var maxLenSoFar = 0;
                while(set.contains(num++)){
                    maxLenSoFar++;
                }
                ans = Math.max(ans, maxLenSoFar);
            }
        }
        return ans;

    }
}
