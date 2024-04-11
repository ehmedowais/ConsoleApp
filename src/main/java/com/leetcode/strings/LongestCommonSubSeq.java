package com.leetcode.strings;

import static java.lang.Math.max;

public class LongestCommonSubSeq {
    public static int lengthOfLongestCommonSubSeq(String str1, String str2){
        int rows = str1.length();
        int cols = str2.length();
        int matrix[][] = new int[rows+1][cols+1];
        for(int row=1; row <= rows; row++ ){
            for(int col=1;col<cols; col++){
                matrix[row][col] = -1;
            }
        }
        return helper(str1, str1, matrix);
    }
    public static int helper(String str1, String str2, int[][] matrix) {
        if(str1==null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            return 0;
        }
        if(matrix[str1.length()][str2.length()] > 0){
            return matrix[str1.length()-1][str2.length()-1];
        }
        if(str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1)){
            return matrix[str1.length()-1][str2.length()-1] = 1 + helper(str1.substring(0, str1.length()-1), str2.substring(0, str2.length()-1), matrix);
        }
        return  matrix[str1.length()-1][str2.length()-1] = max(helper(str1.substring(0, str1.length()-1), str2, matrix), helper(str1, str2.substring(0, str2.length()-1), matrix));
    }
}
