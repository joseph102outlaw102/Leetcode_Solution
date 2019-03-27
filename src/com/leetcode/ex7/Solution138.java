package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 21:26
 * fir sec分别代表递增的两个数，则出现大于sec的数字即返回true，min代表最小值，用于更新fir和sec。
 **/

public class Solution138 {
    public boolean increasingTriplet(int[] nums) {
        if(nums==null||nums.length<3){
            return false;
        }
        int i=1;
        while (i < nums.length && nums[i-1] >= nums[i]) {
            i++;
        }
        if (i == nums.length) {
            return false;
        }
        int fir = nums[i-1];
        int sec = nums[i];
        int min = nums[i-1];
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>sec){
                return true;
            }
            if(nums[j]<sec){
                if(nums[j]>min||nums[j]>fir){
                    sec = nums[j];
                }
            }
            min = Math.min(min,nums[j]);
        }
        return false;
    }
}
