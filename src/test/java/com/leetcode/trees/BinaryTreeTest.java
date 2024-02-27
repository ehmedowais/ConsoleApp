package com.leetcode.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void isPathExists() {
        var rootNode = new TreeNode(1);
        rootNode.leftNode = new TreeNode(2, new TreeNode(3), new TreeNode(5));
        rootNode.rightNode = new TreeNode(4);
        //assertTrue(BinaryTree.isPathExists(rootNode, 20));

        BinaryTree.printNodesDFS(rootNode);
        System.out.println();
        BinaryTree.printNodesBFS(rootNode);
    }
    @Test
    void traverseRightTest(){
        TreeNode node = new TreeNode(1);
        node.rightNode = new TreeNode(2);
        var result = BinaryTree.rightSideView(node);
        assertIterableEquals(result, List.of(1,2));
    }
}