package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 13:47
 **/

public class Solution13 {
    public int maxArea(int[] height) {
        int i,j;
        int ans=0;
        for(i=0;i<height.length;i++){
            for(j=0;j<i;j++){
                int min = height[i]>height[j]?height[j]:height[i];
                ans = ans>min*(i-j)?ans:min*(i-j);
            }
        }
        return ans;
    }
}
