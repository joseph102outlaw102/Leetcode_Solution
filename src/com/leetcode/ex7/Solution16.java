package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 14:36
 **/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution16 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;
        return 1+Math.max(maxDepth(l),maxDepth(r));
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
