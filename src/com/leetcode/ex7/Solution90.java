package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-16 20:16
 **/

public class Solution90 {
    int sum;
    public int findTilt(TreeNode root) {
        calSumVal(root);
        return sum;
    }
    public int calSumVal(TreeNode t){
        if(t==null){
            return 0;
        }
        int l = calSumVal(t.left);
        int r = calSumVal(t.right);
        sum += Math.abs(l-r);
        return l+r+t.val;
    }
}
