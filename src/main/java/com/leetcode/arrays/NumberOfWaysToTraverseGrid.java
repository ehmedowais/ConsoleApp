package com.leetcode.arrays;


// in this question we are traversing a grid of mXn matrix. in the matrix a cell c[m][n] could be blocked, so we cannot move there
public class NumberOfWaysToTraverseGrid {
    public static int countPaths(int[][] grid) {
        return countPaths(grid, 0,0);
    }

    public static int countPaths(int[][] grid, int row, int col) {
        if(grid.length -1 < row || grid[0].length -1 < col) {
            return 0;
        }
        if(grid[row][col] == 'X') {
            return 0;
        }
        if(grid.length -1 == row && grid[row].length -1 == col) {
            return 1;
        }

        return countPaths(grid, row+1, col) + countPaths(grid, row, col+1);
    }

    public static void main(String... args) {
        System.out.println(countPaths(new int[][]{{'O','X'},{'O','O'}}));
        System.out.println(countPaths(new int[][]{{'O','O'},{'O','O'},{'O','O'}}));
    }

}
