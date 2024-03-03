package com.leetcode.trees;



import java.util.*;

import static java.lang.Math.max;

public class InvertTree {
    public static TreeNode reverseTree(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode temp = root.right;
        root.right= root.left;
        root.left = temp;
        reverseTree(root.left);
        reverseTree(root.right);
        return root;
    }
    public static int maxDepth(TreeNode root) {
        //Doing a depth first search
        if(root == null) {
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static int maxDepthBFS(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int depthCounter = 0;
        while (!queue.isEmpty()){
            for(TreeNode node: queue){
                queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            depthCounter++;

        }
        return depthCounter;
    }

    public static int maxDepthDFS(TreeNode root){

        if(root != null){
            int curDepth = 0;
            Stack<TreeNode> nodes = new Stack<>();
            Stack<Integer> depth = new Stack<>();
            nodes.push(root);
            depth.push(curDepth +1);
            int result = 1;
            while(!nodes.isEmpty()){
                TreeNode temp = nodes.pop();
                curDepth = depth.pop();
                result = Math.max(result, curDepth);
                if(temp.left != null){
                    nodes.push(temp.left);
                    depth.push(curDepth+1);
                }
                if(temp.right != null){
                    nodes.push(temp.right);
                    depth.push(curDepth+1);
                }
            }
            return result;
        }else {
            return 0;
        }
    }
    // https://leetcode.com/problems/diameter-of-binary-tree/description/
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;

        int lhs=diameterOfBinaryTree(root.left);
        int rhs=diameterOfBinaryTree(root.right);

        return Math.max(height(root.left)+height(root.right)+2, Math.max(lhs, rhs));
    }
    private static int height(TreeNode root){
        if(root==null)return -1;
        System.out.println(root.val);
        int lhs=height(root.left);
        int rhs=height(root.right);

        return Math.max(lhs, rhs)+1;
    }
    private static int maxHeight = 0;
    public static int diameterOfBinaryTreeLinearApproach(TreeNode root){
        linearHeight(root);
        return maxHeight;
    }
    public static int linearHeight(TreeNode node) {
        if(node == null) return -1;
        int left = linearHeight(node.left);
        int right = linearHeight(node.right);
        maxHeight =  max(maxHeight, left+ right + 2);
        return 1 + max(left, right);
    }
    public static void traverseTreeNodes(TreeNode node){
        if(node != null) {

            //traverseTreeNodes(node.left);
            //traverseTreeNodes(node.right);
        }
    }
    private static boolean result = true;
    public static int maxEdges(TreeNode root) {
        //Doing a depth first search
        if(root == null) {
            return 0;
        }
        System.out.println(root.val);
        int left = maxEdges(root.left);
        int right = maxEdges(root.right);
        if(Math.abs(left - right) > 1) {
            result = false;
        }
        return 1+ Math.max(left, right);
    }
    public static boolean isBalancedTree(TreeNode node){
        if(node == null) return true;
        maxEdges(node);
        return result;
    }

    // https://leetcode.com/problems/binary-tree-level-order-traversal/description/
    // return lists of list of level nodes
    public static List<List<Integer>> levelOrderValues(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if(root == null) {
            return result;
        }
        result.add(List.of(root.val));
        if(root.left != null)
            deque.addFirst(root.left);
        if(root.right != null)
            deque.addFirst(root.right);
        while(!deque.isEmpty()){
            ArrayList<Integer> t = new ArrayList<>();
            int size = deque.size();
            for(int i=0; i< size; i++){

                TreeNode temp = deque.removeLast();
                t.add(temp.val);
                if(temp.left != null)
                    deque.addFirst(temp.left);
                if(temp.right != null)
                    deque.addFirst(temp.right);
            }
            result.add(t);
        }

        return result;
    }
    public static boolean areTreesEqual(TreeNode source, TreeNode target){
        if(source != null && target != null){
           if(source.val != target.val){
               return false;
           }else {
               return areTreesEqual(source.left, target.left) && areTreesEqual(source.right, target.right);
           }
        }else if(source == null && target == null){
            return true;
        }else {
            return false;
        }

    }

    public static boolean isSubTree(TreeNode root, TreeNode subRoot){
        if(root != null && subRoot != null){
            ArrayDeque<TreeNode> deque = new ArrayDeque<>();
            deque.addFirst(root);
            while(!deque.isEmpty()){
                TreeNode rootNode = deque.removeLast();
                if(areTreesEqual(rootNode, subRoot)){
                    return true;
                }else{
                    if(rootNode.left != null){
                        deque.addFirst(rootNode.left);
                    }
                    if(rootNode.right != null) {
                        deque.addFirst(rootNode.right);
                    }
                }
            }
        }
        return false;

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        TreeNode cur = root;
        while(cur != null) {
            if(p.val > cur.val && q.val > cur.val) {
                cur = cur.right;
            }else if(p.val < cur.val && q.val < cur.val) {
                cur = cur.left;
            }else {
                return cur;
            }
        }
        return cur;
    }
    private static int goodNodes = 0;
    public static int goodNodes(TreeNode root) {
        if (root == null)
            return 0;


        _goodNodes(root, root.val);
        return goodNodes;
    }
    private static void _goodNodes(TreeNode node, int prevMax) {
        if (node != null) {
            //checking if next node has equal or greater value
            if (node.val >= prevMax) {
                goodNodes++;
            }
            _goodNodes(node.left, Math.max(node.val, prevMax));
            _goodNodes(node.right, Math.max(node.val, prevMax));
        }

    }
    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int curVal = list.get(0);
        for(int i=1; i< list.size(); i++){
            if(curVal >= list.get(i)){
                return false;
            }
            curVal = list.get(i);
        }
        return true;
    }

    private static List<Integer> helper(TreeNode node, List<Integer> list){
        if(node == null){
            return list;
        }
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
        return list;
    }
}



