package com.leetcode.arrays.trees;

import java.util.ArrayDeque;

public class TreeTraversals {
    // There are four types of tree traversals
    // 1. In order traversal
    // 2. Postorder traversal
    // 3. Preorder traversal
    // 4. Level order traversal

    public static void inOrderTraversal(TreeNode root){
        if(root == null){
            System.out.println(" ");
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val+ " ");
        inOrderTraversal(root.right);
    }
    public static void postorderTraversal(TreeNode root){
        if(root == null){
            System.out.println(" ");
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.val+ " ");
    }

    public static void preorderTraversal(TreeNode root){
        if(root == null){
            System.out.println(" ");
            return;
        }
        System.out.print(root.val+ " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }
    public static void levelOrderTree(TreeNode root){
        if(root == null) {

            return;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while(!deque.isEmpty()){

                TreeNode node = deque.removeLast();
                System.out.print(node.val +" ");
                if(node.left != null){
                    deque.addFirst(node.left);
                }
                if(node.right != null){
                    deque.addFirst(node.right);
                }

        }
        System.out.println(" ");
    }
}
