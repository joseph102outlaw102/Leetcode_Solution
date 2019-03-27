package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 18:40
 **/

public class Solution58 {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(count==0){
                res = nums[i];
            }
            if(res==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }
}
