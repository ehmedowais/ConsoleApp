package com.leetcode.arrays;

// This question is similar to NumberOfWaysToTraverseGrid question except that this question needs to get the max sum
// of the path. In this question it looks we will keep track of maxSumSoFar
public class MaxPathSum {
    public static int maxPathSum(int[][] grid) {
        return maxPathSum(grid, 0,0, 0,0);
    }

    public static int maxPathSum(int[][] grid, int row, int col, int sum, int maxSoFar) {
        // Let's set the base cases we have so far
        if(row > grid.length -1 || col > grid[0].length -1) {
            return 0;
        }

        sum += grid[row][col];
        maxSoFar = Math.max(sum, maxSoFar);
        if(grid.length -1 == row && grid[row].length -1 == col) {
            return Math.max(sum, maxSoFar);
        }
        return Math.max(maxPathSum(grid, row+1, col, sum, maxSoFar) , maxPathSum(grid, row, col+1, sum, maxSoFar));
    }

    public static void main(String[] args) {
        System.out.println(maxPathSum(new int[][]{{1,3,12},{5,16,2}}));
    }
}
