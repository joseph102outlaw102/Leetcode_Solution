package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 18:42
 **/

public class Solution132 {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int imax=0,imin=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i],imax*nums[i]);
            imin = Math.min(nums[i],imin*nums[i]);
            max = Math.max(imax,max);
        }
        return max;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution132().maxProduct(new int[]{-2,0,-1}));
    }
}
