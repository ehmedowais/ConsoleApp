package com.leetcode.trees;

public class TreeNode {
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode() {}
    public TreeNode(int val){
        this.val = val;
    }

    int val;
    public TreeNode(int val, TreeNode l, TreeNode r) {
        this.leftNode =l;
        this.rightNode = r;
        this.val = val;
    }
}
