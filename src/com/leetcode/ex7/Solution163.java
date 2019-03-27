package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 17:27
 *
 * 利用递归实现
 **/

public class Solution163 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if(l!=null&&r!=null){
            return root;
        }else if(l!=null){
            return l;
        }else if(r!=null){
            return r;
        }
        return null;
    }
}
