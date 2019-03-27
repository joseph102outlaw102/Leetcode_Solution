package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 14:42
 **/

public class Solution75 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        preSort(p,s1);
        preSort(q,s2);
        return s2.toString().equals(s1.toString());
    }
    public void preSort(TreeNode p, StringBuilder s){
        if(p!=null){
            s.append(p.val);
            preSort(p.left,s);
            preSort(p.right,s);
        }else{
            s.append('0');
        }
    }
}
