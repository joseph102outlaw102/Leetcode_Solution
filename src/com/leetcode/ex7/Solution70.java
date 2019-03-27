package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 13:04
 **/

public class Solution70 {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        if(n==0)return 0;
        s=s.trim();
        n = s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return n-1-i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
