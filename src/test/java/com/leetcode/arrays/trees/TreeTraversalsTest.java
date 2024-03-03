package com.leetcode.arrays.trees;

import com.leetcode.trees.TreeTraversals;
import com.leetcode.trees.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TreeTraversalsTest {
    /*
                      1
                 2          3
              4    5     6     7
     */
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
    void inOrderTraversalTest() {

        TreeTraversals.inOrderTraversal(root);
        System.out.println("inOrderTraversalTest");
    }

    @Test
    void postorderTraversalTest() {

        TreeTraversals.preorderTraversal(root);
        System.out.println("postorderTraversalTest");
    }
    @Test
    void preorderTraversalTest() {

        TreeTraversals.preorderTraversal(root);
        System.out.println("preorderTraversalTest");
    }
    @Test
    void levelOrderTraversalTest() {

        TreeTraversals.levelOrderTree(root);
        System.out.println("levelOrderTraversalTest");
    }
    @Test
    void test(){
        int x=2;
        foo(x);
        System.out.println(x);
    }
    void foo(int i){
        i=i+1;
    }
}