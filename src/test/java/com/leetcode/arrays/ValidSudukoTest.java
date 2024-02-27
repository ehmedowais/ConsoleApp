package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudukoTest {
    @Test
    public void isValidSudokuTest() {
        var board = new Integer[][]{
                {5,3,null,null,7,null,null,null,null},
                {6,null,null,1,9,5,null,null,null},
                {null,9,8,null,null,null,null,6,null},
                {8,null,null,null,6,null,null,null,3},
                {4,null,null,8,null,3,null,null,1},
                {7,null,null,null,2,null,null,null,6},
                {null,6,null,null,null,null,2,8,null},
                {null,null,null,4,1,9,null,null,5},
                {null,null,null,null,8,null,null,7,9}


        };
        //assertTrue(ValidSuduko.isValidBoard(board));
        board = new Integer[][]{
                {5,3,null,null,7,null,null,null,null},
                {6,null,null,1,9,5,null,null,null},
                {null,9,8,null,null,null,null,6,null},
                {8,null,null,null,6,null,null,null,3},
                {4,null,null,8,null,3,null,null,1},
                {7,null,null,3,2,null,null,null,6},
                {null,6,null,null,null,null,2,8,null},
                {null,null,null,4,1,9,null,null,5},
                {null,null,null,null,8,null,null,7,9}


        };
        assertFalse(ValidSuduko.isValidBoard(board));
    }
}