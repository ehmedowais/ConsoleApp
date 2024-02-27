package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

//In this example we are trying to return boolean value if sum is possible from a given array
public class IfSomePossible {
    public static boolean ifSumPossible(int[] nums, int target) {
        return findSolution(new HashMap<>(), nums, target);
    }

    public static boolean findSolution(Map<Integer,Boolean> map, int[] nums, int target) {
        if(map.containsKey(target)) {
            return true;
        }
        if(target == 0 ){
            return true;
        }
        if(target <0) {
            return false;
        }
        for(int i=0; i< nums.length; i++) {
            var result = findSolution(map, nums, target - nums[i]);
            if(result) {
                map.put(target, Boolean.TRUE );
                return result;
            }
        }

        return false;
    }
    public static int findMinCoinsNeededToMakeAmount(int[] coins, int amount) {
        //Base case if amount is tiny
        if(amount ==0) {
            return 0;
        }
        // if we have reached the leaf of tree and did not find the correct number of coins return -1
        if(amount < 0) {
            return -1;
        }
        int minCoinsSoFar = -1;
        for(int coin : coins) {
            int subAmount = amount - coin;
            int tempCoins = findMinCoinsNeededToMakeAmount(coins, subAmount);
            //in above line we were able to find the coins needed to generate sub amount means at least one coin is needed
            if(tempCoins != -1) {
                tempCoins += 1;
                if(tempCoins < minCoinsSoFar || minCoinsSoFar == -1) {
                    minCoinsSoFar = tempCoins;
                }
            }
        }
        return minCoinsSoFar;
    }

    public static boolean ifSumPossibleTabulationMethod(int[] nums, int target) {
        boolean[] table = new boolean[target+1];
        Arrays.fill(table,false);
        table[0] = true;
        for(int i=0; i<=target; i++){
            if(table[i]) {
                for (int j = 0; j < nums.length; j++) {
                    if (i + nums[j] < table.length) {
                        table[i + nums[j]] = true;
                    }
                }
            }
        }
        return table[target];
    }

    public static Integer[] howSumPossible(int[] nums, int target){
        ArrayList<Integer>[] table = new ArrayList[target+1];
        Arrays.fill(table, null);
        table[0] = new ArrayList<>();

        for(int i=0; i<=target; i++){
            if(table[i] != null) {
                for (int num : nums) {
                    var temp = i + num;
                    if (temp <= target) {
                        var newArray = new ArrayList<Integer>();
                        newArray.addAll(table[i]);
                        newArray.add(num);
                        table[temp]= newArray;
                    }
                }

            }
        }
        return table[target].toArray(new Integer[0]);
    }
    public static Integer[] bestSumPossible(int[] nums, int target){
        ArrayList<Integer>[] table = new ArrayList[target+1];
        Arrays.fill(table, null);
        table[0] = new ArrayList<>();
        for(int i=0; i<=target; i++) {
            if(table[i] != null) {
                for(int num: nums){
                    if(i+num <= target){
                        var temp = new ArrayList<Integer>();
                        temp.addAll(table[i]);
                        temp.add(num);
                        if(table[i+num] == null || table[i + num].size() > temp.size()){
                            table[i+num] = temp;
                        }
                    }
                }
            }
        }
        return table[target].toArray(new Integer[0]);
    }
}
