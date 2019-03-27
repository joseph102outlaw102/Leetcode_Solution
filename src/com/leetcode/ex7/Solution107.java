package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 14:31
 **/

public class Solution107 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n>0){
            ans += n&1;
            n >>>= 1;
        }
        return ans;
    }
}
