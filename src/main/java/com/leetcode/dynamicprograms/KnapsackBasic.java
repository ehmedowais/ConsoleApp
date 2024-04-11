package com.leetcode.dynamicprograms;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class KnapsackBasic {
    public static int maximizeProfit(int maxWeight, int[] weights, int[] prices){
        int rows = weights.length;
        int cols = maxWeight;
        int[][] matrix = new int[rows+1][cols+1];

        for(int row=1; row <= rows; row++) {
            for(int col =1; col <= cols; col++) {
                int price = prices[row -1];
                if(col < weights[row -1]) {
                    matrix[row][col] = matrix[row -1][col];
                }else if(col == weights[row -1]){
                    matrix[row][col] = max(price, matrix[row -1][col]);
                }else {
                    //matrix[row -1][col],
                    matrix[row][col] = max(matrix[row -1][col], price  + matrix[row-1][abs(weights[row-1] - col)]);
                    //matrix[row][col] = max(price, matrix[row-1][abs(weights[row-1] - col)]);
                }

            }
        }
        return matrix[rows][cols];
    }
}
