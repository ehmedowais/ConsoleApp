package com.leetcode.strings;

import java.util.*;

import static java.lang.Math.max;

public class SubArray {
    //Sub array is where the order of elements is not changed
    public static void subArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.println("");
                for (int k = i; k < j; k++) {
                    System.out.print(array[k] + " ");
                }
            }
        }
    }

    public static void subArray(String str) {
        var array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length; j++) {
                var tmpStr = "";
                for (int k = i; k < j; k++) {
                    tmpStr += array[k] + "";
                    set.add(tmpStr);
                }
                //System.out.println();
            }
        }
    }

    //A subsequence is the possible combinations from an array
    static LinkedHashSet set = new LinkedHashSet<String>();

    public static void subSequence(String str) {
        for (int i = 0; i < str.length(); i++) {
            //Iterate from end of string to generate substrings
            for (int j = str.length(); j > i; j--) {

                var subStr = str.substring(i, j);
                set.add(subStr);
                for (int k = 1; k < subStr.length() - 1; k++) {
                    var sb = new StringBuffer(subStr);
                    sb.deleteCharAt(k);
                    if (!set.contains(sb)) {
                        subSequence(sb.toString());
                    }
                }
            }
        }

    }

    /* In this question we are going to find the sub array with max length where no character is repeated*/
    public static int getMaxLenSubArrayWithoutRepeatingChar(String str) {
        var set = new HashSet<Character>();
        var strToArr = str.toCharArray();

        var maxLen = 0;
        var i = 0;
        var j = -1;
        var len = str.length();
        for (; i < len; i++) {
            var charToAq = strToArr[i];
            while (set.contains(charToAq)) {
                j++;
                set.remove(strToArr[j]);
            }
            set.add(charToAq);
            maxLen = max(maxLen, i - j);
        }
        return maxLen;
    }

    public static int[] rotateNTimes(int[] nums, int times) {
        var subArrayToRight = Collections.singletonList(nums).subList(nums.length - times, nums.length - 1);
        var subArrayToLeft = Collections.singletonList(nums).subList(0, nums.length - times - 1);
        var result = new ArrayList<Integer>();
        //result.addAll(Collections.singletonList(subArrayToRight.get(0)));
        return null;
    }

    public static boolean isStringConstructable(String str, ArrayList<String> subStrings, HashMap<String, Boolean> map) {
        if (map.get(str) != null) {
            return map.get(str);
        }
        if (str.isEmpty()) {
            return true;
        }
        if (subStrings.isEmpty()) {
            return false;
        }


        for (String s : subStrings) {
            if (str.startsWith(s)) {

                //set.remove(s);
                if (isStringConstructable(str.substring(s.length()), subStrings, map)) {
                    map.put(s, Boolean.TRUE);
                    return true;
                }
            }

        }
        map.put(str, Boolean.FALSE);
        return false;
    }

    public static int countWaysToConstructString(String target, String[] wordBank) {
        if (target.isEmpty()) {
            return 1;
        }
        int count = 0;

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                var subStr = target.substring(word.length());

                return count += countWaysToConstructString(subStr, wordBank);

            }
        }
        return count;
    }
    public static List<List<String>> possibleCombinations(String target, String[] wordBank, List<List<String>> result){

        if(target.isEmpty()){
            result.add(new ArrayList<String>());
            return result;
        }
        for(String word: wordBank){
            var temp = new ArrayList<String>();
            if(target.startsWith(word)){
                possibleCombinations(target.substring(word.length()),wordBank, result);
                temp.add(word);
            }
            if(!temp.isEmpty()){
                result.add(temp);
            }
        }
        return result;
    }

}
