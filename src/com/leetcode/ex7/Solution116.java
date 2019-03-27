package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 14:34
 **/

public class Solution116 {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length<=1){
            return ;
        }
        k = k>=nums.length?k%nums.length:k;
        int start = 0,end=nums.length-1;
        reverse(nums,start,end);
        reverse(nums,start,k-1);
        reverse(nums,k,end);
    }
    public void reverse(int[] n,int a,int b) {
        while(a<b){
            int temp = n[a];
            n[a] = n[b];
            n[b] = temp;
            a++;
            b--;
        }
    }
}
