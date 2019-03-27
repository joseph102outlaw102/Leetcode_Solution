package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 16:42
 **/

public class Solution49 {
    public void reverseString(char[] s) {
        char tmp;
        int i=0,j=s.length-1;
        while(i<j){
            tmp = s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
    }
}
