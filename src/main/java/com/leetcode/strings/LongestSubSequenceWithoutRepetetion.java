package com.leetcode.strings;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class LongestSubSequenceWithoutRepetetion {
    public static int lengthOfLongestSubstring(String A) {
        int numOfSubSeqs = (int)Math.pow(2, A.length());
        int maxLen = 0;
        for(int i =0; i< numOfSubSeqs; i++){
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for(int j=0;j<A.length(); j++) {
                if(BigInteger.valueOf(i).testBit(j)){
                    Character c = A.charAt(j);
                    if(set.contains(c)){
                        break;
                    }else {
                        set.add(c);
                        sb.append(c);
                        maxLen = Math.max(maxLen, sb.length());
                    }
                }
            }
        }
        return maxLen;
    }
}
