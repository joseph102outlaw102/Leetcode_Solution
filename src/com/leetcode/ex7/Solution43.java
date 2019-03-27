package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 15:35
 **/

public class Solution43 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = sum<0?nums[i]:sum+nums[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
