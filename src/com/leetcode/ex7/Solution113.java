package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:46
 **/

public class Solution113 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right =tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
