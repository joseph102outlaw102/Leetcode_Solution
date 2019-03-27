package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 12:09
 **/

public class Solution101 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return func(nums,0,nums.length-1);
    }
    public TreeNode func(int[] nums, int s, int e){
        if(s==e){
            return new TreeNode(nums[s]);
        }else if(s>e){
            return null;
        }else{
            int l = (s+e)/2;
            TreeNode t = new TreeNode(nums[l]);
            t.left = func(nums,s,l-1);
            t.right = func(nums,l+1,e);
            return t;
        }
    }
}
