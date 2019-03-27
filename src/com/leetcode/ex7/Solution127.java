package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-26 23:22
 **/

public class Solution127 {
    public int missingNumber(int[] nums) {
        int i=0;
        int ans = 0;
        while(i<nums.length){
            ans^=i;
            ans^=nums[i];
            i++;
        }
        return ans^i;
    }
    public static void main(String[] args){
        new Solution127().missingNumber(new int[]{3,0,1});
    }
}
