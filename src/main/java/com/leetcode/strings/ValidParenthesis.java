package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidString(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        var chars= str.toCharArray();
        for(Character c : chars){
            if(map.get(c) != null) {
                stack.push(map.get(c));
            }else if(c == stack.peek()) {
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
