package com.leetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPathSumTest {

    @Test
    void maxPathSum() {
        var rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2, new TreeNode(3), new TreeNode(5));
        rootNode.right = new TreeNode(7);

        assertEquals(15, MaxPathSum.maxPathSum(rootNode));
    }
}