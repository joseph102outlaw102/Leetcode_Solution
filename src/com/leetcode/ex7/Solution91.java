package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-16 20:59
 **/

public class Solution91 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null){
            return null;
        }
        int x = root.val;
        if(x<L){
            return trimBST(root.right, L, R);
        }else if(x<=R){
            root.left = trimBST(root.left, L, x);
            root.right = trimBST(root.right, x, R);
            return root;
        }else{
            return trimBST(root.left, L, R);
        }
    }
}
