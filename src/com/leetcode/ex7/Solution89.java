package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-15 21:29
 **/

public class Solution89 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0){
            return false;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n&&j<=i+k;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
