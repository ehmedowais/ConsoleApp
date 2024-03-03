package com.leetcode.trees;
import java.util.*;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElement {
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        recursiveCall(root, nums);
        System.out.println(nums);
        return nums.get(k-1);

    }
    private static void recursiveCall(TreeNode node, List<Integer> nums) {
        if(node != null){
            recursiveCall(node.left, nums);
            nums.add(node.val);
            recursiveCall(node.right, nums);
        }
    }
}
