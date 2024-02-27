package com.leetcode.strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PossiblePinCodeCombinations {
    public static List<String> generatePossibleCombinations(String str) {
        var map = new HashMap<Character, List<Character>>();
        map.put('a', List.of('b','d'));
        map.put('b', List.of('a','c','e'));
        map.put('c', List.of('b','f'));
        map.put('d', List.of('a','e'));
        map.put('e', List.of('b','d','f','h'));
        map.put('f', List.of('d','h'));
        map.put('g', List.of('d','h'));
        map.put('h', List.of('e','g','i','j'));
        map.put('i', List.of('h','f'));
        map.put('j', List.of('h'));
        var set = new LinkedHashSet<String>();
        set.add(str);
        var strToArr = str.toCharArray();
        AtomicInteger i = new AtomicInteger(0);
        while( i.getAndAdd(1) < strToArr.length-1) {
            var strBuf = new StringBuffer(str);
            map.get(strToArr[i.get()]).forEach(character -> {
                strBuf.setCharAt(i.get(), character);
                set.add(strBuf.toString());
            });
        }
        return set.stream().toList();

    }
}
