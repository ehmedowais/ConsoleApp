package com.leetcode.trees;

import java.util.*;

public class BinaryTree {
    //DFS Binary tree to find the path node to leaf if sum equals to target
    public static boolean isPathExists(TreeNode root, int target) {
        System.out.println("target is "+ target);
        if(root == null) return false;
        if(root.val == target && root.left == null && root.right == null) return true;
        return isPathExists(root.left, target - root.val) || isPathExists(root.right, target - root.val);
    }
    public static void printNodesDFS(TreeNode root) {
        var stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            var currNode = stack.pop();
            if(currNode.left != null) {
                stack.push(currNode.left);
            }
            if(currNode.right != null) {
                stack.push(currNode.right);
            }
            System.out.println(currNode.val);
        }
    }
    public static void printNodesBFS(TreeNode root) {
        var stack = new LinkedList<TreeNode>();
        stack.add(root);
        while(!stack.isEmpty()){
            var currNode = stack.poll();
            if(currNode.left != null) {
                stack.add(currNode.left);
            }
            if(currNode.right != null) {
                stack.add(currNode.right);
            }
            System.out.print(currNode.val + ",");
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseRight(root, result);
        return result;
    }
    private static void traverseRight(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        traverseRight(node.right, list);
    }

}
