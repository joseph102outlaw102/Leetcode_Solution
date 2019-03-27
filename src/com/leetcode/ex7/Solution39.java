package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 15:34
 **/

public class Solution39 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        preSort(root1,a);
        preSort(root2,b);
        return a.equals(b);
    }
    public void preSort(TreeNode root, List l){
        if(root!=null) {
            if (root.left == null && root.right == null) {
                l.add(root.val);
            } else {
                preSort(root.left, l);
                preSort(root.right, l);
            }
        }
        return ;
    }
}
