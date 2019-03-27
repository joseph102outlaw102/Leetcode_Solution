package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 13:17
 **/

public class Solution103 {
    public int titleToNumber(String s) {
        int sum = 0;
        int base = 1;
        for(int i=s.length()-1;i>=0;i--){
            sum += (s.charAt(i)-'A'+1)*base;
            base *= 26;
        }
        return sum;
    }
}
