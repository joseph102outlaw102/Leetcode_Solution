package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 14:01
 **/

public class Solution73 {
    public int mySqrt(int x) {
        long i=0;
        while(i*i<=x){
            i++;
        }
        return (int)i-1;
    }
}
