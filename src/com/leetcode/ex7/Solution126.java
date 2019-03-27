package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-26 23:19
 **/

public class Solution126 {
    public boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        while(num%2 == 0)
        {
            num >>= 1;
        }

        while(num%3 == 0)
        {
            num /= 3;
        }

        while(num%5 == 0)
        {
            num /= 5;
        }

        return (num == 1 || num == 2 || num == 3 || num == 5);
    }
}
