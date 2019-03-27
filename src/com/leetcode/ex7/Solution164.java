package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 20:26
 **/

public class Solution164 {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int i=0,j=0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(j=0;j<nums.length;j++){
            sum += nums[j];
            if(sum>=s) {
                while (i < j && sum >= s) {
                    sum -= nums[i];
                    i++;
                }
                if (sum >= s) {
                    return 1;
                }
                min = Math.min(min, j - i + 2);
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
