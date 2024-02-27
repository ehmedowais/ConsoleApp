package com.leetcode.strings;

import java.util.HashMap;

public class AnagramAndPalindrome {
    public static boolean isAnagram(String source, String destination) {
        if(source.length() != destination.length()) return false;
        source = source.replaceAll("\\s","");
        destination = destination.replaceAll("\\s", "");
        var mapOfCharCount = new HashMap<Character, Integer>();
        for(Character c: source.toCharArray()){
            mapOfCharCount.put(c,mapOfCharCount.getOrDefault(c,0)+1);
        }
        for(Character c: destination.toCharArray()){
            if(mapOfCharCount.containsKey(c)){
                mapOfCharCount.put(c, mapOfCharCount.get(c) -1);
            }else {
                return false;
            }
            if(mapOfCharCount.get(c) <=0) {
                mapOfCharCount.remove(c);
            }
        }
        return mapOfCharCount.isEmpty();
    }
}
