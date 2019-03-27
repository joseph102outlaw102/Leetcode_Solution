package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 15:49
 **/

public class Solution20 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode l, TreeNode r){
        if(l==null&&r==null){
            return true;
        }
        if(l==null||r==null){
            return false;
        }
        if(l.val==r.val){
            return isMirror(l.left,r.right)&&isMirror(r.left,l.right);
        }
        return false;
    }
}
