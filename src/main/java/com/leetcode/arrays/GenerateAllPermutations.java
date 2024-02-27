package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPermutations {
    public static void genAllPermutations(String str) {
        var allPermutations = new ArrayList<String>();
        genPermutation(allPermutations,"", str);
        System.out.println(allPermutations);
    }

    public static void genPermutation(List<String> permutations, String prefix, String str) {

        if(str.isEmpty()) {
            permutations.add(prefix);

        }else {

            for(int i=0;i<str.length(); i++) {
                System.out.printf("The parameters(prefix, str) are %s, %s with ith %d iteration\n", prefix, str,i);
                genPermutation(permutations,prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
            }
        }

    }

    public static void main(String[] args) {
        genAllPermutations("abc");
    }
}
