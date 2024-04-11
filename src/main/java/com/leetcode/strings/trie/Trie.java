package com.leetcode.strings.trie;



public class Trie {
    private static TrieNode root;
    public Trie() {
        root = new TrieNode();
        System.out.println("Trie has been initialized");
    }
    static{
        root = new TrieNode();
        System.out.println("Trie has been initialized");
    }
    public static void insert(String word){
        TrieNode curNode = root;
        for(Character c : word.toCharArray()){
            TrieNode temp = curNode.children.get(c);
            if(temp == null) {
                temp = new TrieNode();
                curNode.children.put(c, temp);
            }
            curNode = temp;
        }
        curNode.isEndOfString = Boolean.TRUE;
        System.out.printf("Word %s inserted successfully\n", word);
    }
    public static boolean search(String word){
        var currNode = root;
        for(Character c : word.toCharArray()){
            var temp = currNode.children.get(c);
            if( temp == null){
                System.out.println("We could not find the string "+ word);
            }
            currNode = temp;
        }
        if(currNode != null && currNode.isEndOfString) {
            System.out.println("We found the string "+ word);
            return currNode.isEndOfString;
        }
        else {
            System.out.println("It looks the word "+ word + " is a prefix of some other words");
            return false;
        }
    }

    public static void delete( String word){
        if(search(word)){
           var deleted = delete(root, word);
            System.out.println("Word "+word+" is deleted successfully");
        }else {
            System.out.println("Word "+word+" is not found.");
        }
    }
    private static boolean delete(TrieNode root, String word){
        // if by recursion we have reached to last character of word, we can return true as we have two condintions to check
        // 1. if the node is not a terminating node
        // 2. And the node do not have any children.
        // below as we are setting the terminating to false, so now we need to check if the node do not have any children
        // we can delete the node so return true
        if(word.isEmpty()){
            root.isEndOfString = false;
            return root.children.isEmpty();
        }
        //Now we will check recursively if a node can be deleted
        TrieNode tempNode = root.children.get(word.charAt(0));
        if(delete(tempNode, word.substring(1))){
            tempNode.children.remove(word.charAt(0));

        }
        if(tempNode.isEndOfString || !tempNode.children.isEmpty()){
            return false;
        }else {
            return true;
        }

    }
}
