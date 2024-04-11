package com.leetcode.dynamicprograms;

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
}
