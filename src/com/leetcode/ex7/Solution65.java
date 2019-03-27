package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-08 11:51
 **/

public class Solution65 {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return n;
    }
}
