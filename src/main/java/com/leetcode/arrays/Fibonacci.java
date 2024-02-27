package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Fibonacci {
    public static int findNthFib(int n, HashMap<Integer, Integer> map) {
        if(n ==0 || n == 1) {
            return 1;
        }
        if(map.get(n) != null) {
            return map.get(n);
        }
        map.put(n, findNthFib(n-1, map) + findNthFib(n -2, map));
        return map.get(n);
    }
    public static int findNthFibTabulation(int n) {
        var fibs = new int[n+1];
        Arrays.fill(fibs, 0);
        fibs[1] =1;
        for(int i=1; i<n-1; i++){
            fibs[i+1] += fibs[i];
            fibs[i+2] += fibs[i];
        }
        return fibs[n] + fibs[n-1];
    }
}
