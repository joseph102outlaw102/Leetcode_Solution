package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 18:25
 **/

public class Solution55 {
    public boolean isPowerOfTwo(int n) {
        return n>0 && ((n&n-1)==0);
    }
}
