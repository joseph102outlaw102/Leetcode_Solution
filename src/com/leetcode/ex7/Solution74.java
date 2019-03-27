package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 14:19
 **/

public class Solution74 {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        long r = x;
        while(r>x/r){
            r = (r+x/r)/2;
        }
        return (int )r;
    }
}
