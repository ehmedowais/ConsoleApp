package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GridTravelerTest {
    @Test
    public void countWaysTest(){
        assertEquals(6, GridTraveler.noOfWaysToTravelGrid(3,3));
    }

    @Test
    public void zigZag(){
        int rows =-1;
        int counter =0;
        int col = 0;
        int maxRow = 5;
        int index = 0;
        int[][] grid = new int[5][5];
        for(int i=0; i<5;i++){
            Arrays.fill(grid[i],0);
        }
        while(index < maxRow) {
            for(rows = rows+1; rows< maxRow; rows++) {
                grid[rows][col]=++counter;
            }
            col++;
            for(rows = rows -1;rows>=col;rows--){
                grid[rows][col]=++counter;
            }
            col++;rows++;
            index = index+1;
        }
        for(int i=0; i<5; i++){
            for(int j=0;j<5;j++){
                if(grid[i][j] != 0)
                    System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }

}