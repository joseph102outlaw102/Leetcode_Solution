package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 18:19
 **/

public class Solution54 {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n%2==0){
            n >>= 1;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}
