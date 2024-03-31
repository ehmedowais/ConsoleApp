package com.leetcode.strings;

public class LongestPrefixString {
    public static String findLongestCommonPrefix(String[] strings){
        if(strings == null || strings.length == 0) return "";
        StringBuilder sample = new StringBuilder(strings[0]);
        for(int i=1; i<strings.length; i++) {
            while(!sample.isEmpty() && !strings[i].startsWith(sample.toString())){
                    sample = sample.deleteCharAt(sample.length()-1);
                }

        }
        return sample.toString();
    }
}
