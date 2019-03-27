package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 16:33
 **/

public class Solution161 {
    public int lengthOfLIS(int[] nums) {
        if(nums==null){
            return 0;
        }else if(nums.length<=1){
            return nums.length;
        }
        int[] l = new int[nums.length];//记录最长上升子序列的长度-1(不算自己)
        int max = 0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    l[i] = Math.max(l[i],l[j]+1);
                }
            }
            max = Math.max(max,l[i]+1);
        }
        return max;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
