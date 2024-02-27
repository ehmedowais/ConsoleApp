package com.leetcode.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringPermutations {
    public static ArrayList<String> generatePermutation(String str) {
        permute(str,"");
        return null;
    }
    public static void permute(String str, String permutations) {
        if(str.isEmpty()){
            System.out.println(permutations);
            return;
        }
        for(int i=0;i<str.length(); i++) {
            char currCharacter = str.charAt(i);
            var tempStr = str.substring(0,i)+str.substring(i+1);
            System.out.printf("i=  %d, currCharacter=  %s  ,tempString=  %s \n", i,currCharacter,tempStr);
            permute(tempStr, permutations+currCharacter);

        }
    }
    public static List<String> generatePermutations(String source) {
        var list = new ArrayList<String>();
        backtrack(source, 0, list);
        return list;
    }
    public static void backtrack(String str,int index, List<String> result){
        if(index == str.length()) {
            result.add(str);
            return;
        }
        for(int i=index; i<str.length(); i++){
            str = swapChars(str, i, index);
            backtrack(str, index+1, result);
            str = swapChars(str, i, index);
        }

    }
    public static String swapChars(String str, int i, int j) {
        var chars = str.toCharArray();
        var temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
    public static void main(String[] args) {

       var list = generatePermutations("abc");
        System.out.println(list);


    }
}
