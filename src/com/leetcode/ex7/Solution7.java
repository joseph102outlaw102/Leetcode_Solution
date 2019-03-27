package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 17:39
 *
 * 此题需要好好总结反思，关键点n!=nums[i-1]，举一反三，再重新看一下80题 Solution167
 **/

public class Solution7 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<1||n!=nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution7().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(new Solution7().removeDuplicates(new int[]{0,1,2}));
    }
}
