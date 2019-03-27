package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 19:46
 **/

public class Solution134 {
    public int[] productExceptSelf(int[] nums) {
        int l=1,r=1;
        int len = nums.length;
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            output[i] = l;
            l *= nums[i];
        }
        for(int j=len-1;j>=0;j--){
            output[j] *= r;
            r *= nums[j];
        }
        return output;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
