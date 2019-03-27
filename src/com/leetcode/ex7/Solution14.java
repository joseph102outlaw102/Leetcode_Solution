package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 14:02
 **/

public class Solution14 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j) {
            ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
