package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-13 18:37
 **/

public class Solution80 {
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        ans = true;
        getDepth(root);
        return ans;
    }

    public int getDepth(TreeNode t){
        if(t==null){
            return 0;
        }
        int l = getDepth(t.left);
        int r = getDepth(t.right);
        int x = Math.abs(l-r);
        if(x>1){
            ans = false;
        }
        return Math.max(l,r)+1;
    }
}
