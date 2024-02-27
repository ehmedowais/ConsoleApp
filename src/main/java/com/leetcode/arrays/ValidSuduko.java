package com.leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//This class checks if a 9 x 9 soduko board is valid or not
public class ValidSuduko {
    public static boolean isValidBoard(Integer[][] board) {
        // validate if all rows has unique value
        var rowSet = new HashSet<Integer>();
        var colSet = new HashSet<Integer>();

        for(int row=0;row<9;row++){
            rowSet = new HashSet<>();
            for(int col=0;col<9;col++) {
                if(board[row][col] == null) {
                    continue;
                }
                if(rowSet.contains(board[row][col]) )
                {
                    return false;
                }else {
                    rowSet.add(board[row][col]);

                }
            }

        }
        for(int col=0;col<9;col++){
            colSet = new HashSet<>();
            for(int row=0;row<9;row++) {
                if(board[row][col] == null) {
                    continue;
                }
                if(colSet.contains(board[row][col]) )
                {
                    return false;
                }else {
                    colSet.add(board[row][col]);

                }
            }

        }
        Map<String, Set<Integer>> square = new HashMap<>();
        for(int row=0; row<9;row++){
            for(int col =0;col<9;col++){
                if(board[row][col] == null) continue;
                var key = (row/3)+","+(col/3);
                var set = square.getOrDefault(key, new HashSet<>());
                if(set.contains(board[row][col])){
                    return false;
                }else {
                    set.add(board[row][col]);
                    square.put(key,set);
                }
            }
        }
        return true;
    }
}
