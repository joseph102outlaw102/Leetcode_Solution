package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-13 19:39
 **/

public class Solution81 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return getTarget(root, sum);
    }
    public boolean getTarget(TreeNode t, int x){
        int curValue = t.val;
        if(t.left==null&&t.right==null){ //是叶子节点
            return x==curValue?true:false;
        }
        if(t.left==null){
            return getTarget(t.right,x-curValue);
        }
        if(t.right==null){
            return getTarget(t.left,x-curValue);
        }
        return getTarget(t.left,x-curValue)||getTarget(t.right,x-curValue);
    }
}
