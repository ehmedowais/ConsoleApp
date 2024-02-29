package com.leetcode.trees;

import com.leetcode.arrays.trees.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementTest {
    static com.leetcode.arrays.trees.TreeNode root = new com.leetcode.arrays.trees.TreeNode(1);
    @BeforeAll
    static void  setup(){
        root.left = new com.leetcode.arrays.trees.TreeNode(2);
        root.left.left = new com.leetcode.arrays.trees.TreeNode(4);
        root.left.right = new com.leetcode.arrays.trees.TreeNode(5);
        root.right = new com.leetcode.arrays.trees.TreeNode(3);
        root.right.left = new com.leetcode.arrays.trees.TreeNode(6);
        root.right.right= new TreeNode(7);

    }
    @Test
    void kthSmallest() {
        assertEquals(3, KthSmallestElement.kthSmallest(root, 6));
    }
}