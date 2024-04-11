package com.leetcode.strings.trie;
import java.util.HashMap;
public class TrieNode {
    HashMap<Character, TrieNode> children = new HashMap<>();
    Boolean isEndOfString;
    public TrieNode(){
        children = new HashMap<>();
        isEndOfString = Boolean.FALSE;
    }
}
