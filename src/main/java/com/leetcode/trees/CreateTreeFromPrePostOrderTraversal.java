package com.leetcode.trees;



import java.util.Stack;
import java.util.TreeMap;

public class CreateTreeFromPrePostOrderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;

    }

    private static TreeNode helperFunction(int[] preorder, int[] inorder, int lIndex, int rIndex){
        if(inorder.length != 0){
            Stack<Integer> stack = new Stack<>();
            for(int i = inorder.length; i>=0; i--){
                stack.push(inorder[i]);

            }
            int rootVal = stack.pop();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i = inorder.length; i>=0; i--){
                map.put(inorder[i],i);
            }
            int rootIndex = map.get(rootVal);
            TreeNode node = new TreeNode(rootVal);
            node.left = helperFunction(preorder,inorder,0, 0);

            //node.right = helperFunction(preorder,inorder, mid +1, length);

            return node;
        }

        return null;
    }

}
