package com.leetcode.trees;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementTest {
    static TreeNode root = new TreeNode(1);
    @BeforeAll
    static void  setup(){
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right= new TreeNode(7);

    }
    @Test
    void kthSmallest() {
        assertEquals(3, KthSmallestElement.kthSmallest(root, 6));
    }
}