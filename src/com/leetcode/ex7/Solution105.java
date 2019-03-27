package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 13:51
 **/

public class Solution105 {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) {
            return 0;
        }
        int n=nums.length;
        if(n==1){
            return nums[0];
        }else if(n==2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }else {
            nums[1] = nums[0]>nums[1]?nums[0]:nums[1];
            for (int i = 2; i < n; i++) {
                nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
            }
            return nums[n-1];
        }
    }
}
