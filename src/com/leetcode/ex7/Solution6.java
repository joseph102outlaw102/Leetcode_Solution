package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 17:20
 **/

public class Solution6 {
    public int removeDuplicates(int[] nums) {
        int count=2;
        int i;
        for(i=1;i<nums.length;i++){
            while(nums[i]<=nums[i-1]&&count<nums.length){
                nums[i]=nums[count++];
            }
            if(i==count){
                count = i+1;
            }
            if(count==nums.length){
                if(nums[i]==nums[i-1]){
                    return i;
                }else{
                    return i+1;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution6().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(new Solution6().removeDuplicates(new int[]{0,1,2}));
    }
}
