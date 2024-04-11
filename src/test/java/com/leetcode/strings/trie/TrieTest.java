package com.leetcode.strings.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void insert() {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");
    }
    @Test
    void search() {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");
        assertTrue(trie.search("API"));
        assertTrue(trie.search("APIS"));
        assertFalse(trie.search("AP"));
    }
    @Test
    void delete() {

        Trie.insert("API");
        Trie.insert("APPLE");
        Trie.delete("API");
        assertFalse(Trie.search("API"));
    }
}