package com.leetcode.arrays;

public class GridTraveler {
    public static int noOfWaysToTravelGrid(int r, int c) {
        var grid = new int[r+1][c+1];
        grid[1][1] =1;
        for(int row = 1; row<= r; row++){
            for(int col =1; col<=c; col++){
                if(col<c){
                    grid[row][col+1] += grid[row][col];
                }
                if(row< r) {
                    grid[row + 1][col] += grid[row][col];
                }
            }
        }
        return grid[r][c];
    }
}
