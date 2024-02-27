package com.leetcode.arrays;

import java.util.Arrays;
import java.util.Map;

import static java.lang.Math.min;

public class MinCoinsToMakeAmount {

    public static int getMinCoinsToMakeAmount(int[] coins, int amount, Map<Integer, Integer> map) {
        if(amount == 0) {
            return 0;
        }
        if(amount < 0) {
            return -1;
        }
        if(map.containsKey(amount)) {
            return map.get(amount);
        }
        int minCoins = Integer.MAX_VALUE;
        for(int coin: coins) {
            int subAmount = amount - coin;
            int subCoins = getMinCoinsToMakeAmount(coins, subAmount, map) +1;
            if(subCoins > 0) {
                minCoins = min(minCoins, subCoins);
            }
        }
        if(minCoins == Integer.MAX_VALUE) return -1;
        map.put(amount, minCoins);
        return minCoins;
    }
    // a dp way to get min coins to obtain change
    public static int getMinCoinsToMakeAmountDPWay(int[] coins, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, target+1);
        dp[0] = 0;
        for(int coin: coins) {
            for(int i=coin; i<=target; i++) {
                dp[i] = min(dp[i], dp[i-coin]+1);
            }
        }
        return dp[target] > target ? -1: dp[target];
    }

}
