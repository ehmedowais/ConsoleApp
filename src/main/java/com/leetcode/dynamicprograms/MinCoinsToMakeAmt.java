package com.leetcode.dynamicprograms;

import java.util.Arrays;

import static java.lang.Math.min;

public class MinCoinsToMakeAmt {
    public static int minCoinsChange(int amt, int[] coins) {
        if(amt == 0) return 0;
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            if(amt - coin >= 0) {
                int curAns = minCoinsChange(amt - coin, coins);
                if (curAns != Integer.MAX_VALUE && curAns + 1 < minCoins) {
                    minCoins = curAns + 1;
                }
            }
        }
        return  minCoins;
    }
    //Bottom up approach
    public static int minCoinsChangeDP(int amt, int[] coins){
        int[] dp = new int[amt +1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i=1; i< amt+1; i++){
            for(int coin: coins){
                if(i - coin < 0 ){
                    continue;
                }
                dp[i] = dp[i] + dp[i - coin];

            }
        }
        return dp[amt];
    }
}
