package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 13:21
 **/

public class Solution104 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%26==0){
                sb.append('Z');
                n -= 26;
            }else {
                sb.append((char) ('A' + (n % 26) - 1));
            }
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
