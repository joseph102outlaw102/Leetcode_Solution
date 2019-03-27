package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 16:37
 **/

public class Solution48 {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int num:nums){
            a = num^a;
        }
        return a;
    }
}
