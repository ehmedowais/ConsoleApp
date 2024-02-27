package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindIfSumPossible {

    public static boolean solution(int[] nums,  int target, Map<Integer, Boolean> map) {

       if(target ==0)
           return true;
       if(target  < 0 )
           return false;
        if(map.containsKey(target))
            return true;
       for(int num : nums) {
           var temp = target - num;

           if(solution(nums, temp, map)) {
               map.put(target, Boolean.TRUE);
               return true;
           }
       }
        map.put(target, Boolean.FALSE);
       return false;
    }
}