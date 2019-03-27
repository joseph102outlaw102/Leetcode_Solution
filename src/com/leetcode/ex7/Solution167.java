package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 21:32
 *
 * 此题需要好好总结反思，关键点n>nums[i-2]，举一反三，再重新看一下26题 Solution7
 **/

public class Solution167 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2||n>nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        new Solution167().removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
}
