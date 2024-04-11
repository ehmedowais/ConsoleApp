package com.leetcode.trees;

import static java.lang.Math.max;

public class MaxPathSum {
    private static int max = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root){
        if(root == null) return 0;
        dfs(root);
        return max;
    }
    private static int dfs(TreeNode root){
        if(root == null) return 0;
        int leftMax = max(dfs(root.left),0);
        int rightMax = max(dfs(root.right),0);
        //Retaining the max value including root
        max = max(max, leftMax + rightMax + root.val);
        // returning value from root to either left or right whichever is max
        return root.val + max(leftMax, rightMax);
    }
}
