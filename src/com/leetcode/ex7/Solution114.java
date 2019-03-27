package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:49
 **/

public class Solution114 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null){
                sum += root.left.val;
            }
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
