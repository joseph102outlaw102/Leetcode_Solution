package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:07
 **/

public class Solution109 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        int i=0;
        while(i++<32){
            int x = n&1;
            n>>>=1;
            ans<<=1;
            ans|=x;
        }
        return ans;
    }
}
