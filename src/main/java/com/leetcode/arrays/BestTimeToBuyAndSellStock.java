package com.leetcode.arrays;

import static java.lang.Math.max;

public class BestTimeToBuyAndSellStock {
    public static int getMaximumProfit(int[] prices) {
        var maxProfit = 0;
        var minPrice = Integer.MAX_VALUE;
        for(int i =0; i< prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
