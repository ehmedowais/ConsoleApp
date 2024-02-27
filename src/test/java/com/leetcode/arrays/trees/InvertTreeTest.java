package com.leetcode.arrays.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertTreeTest {
    @Test
    public void levelOrderValuesTest(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        var result = InvertTree.levelOrderValues(root);
        System.out.println(result);
    }

    @Test
    public void maxDiaMeterOfTree(){
        // 1,2,3,4,5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        InvertTree.traverseTreeNodes(root);
        assertEquals(4, InvertTree.diameterOfBinaryTree(root));
        //assertEquals(4, InvertTree.diameterOfBinaryTreeLinearApproach(root));

    }
    @Test
    public void isTreeBalancedTest() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        assertTrue(InvertTree.isBalancedTree(root));
        //assertTrue(InvertTree.isBalancedTreeWithStack(root));


    }

}