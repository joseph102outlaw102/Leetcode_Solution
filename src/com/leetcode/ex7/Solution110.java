package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:11
 **/

public class Solution110 {
    public boolean isIsomorphic(String s, String t) {
        if(func(s).equals(func(t))){
            return true;
        }
        return false;
    }
    public String func(String s){
        int n = s.length();
        char[] c = new char[n];
        for(int i=0;i<n;i++){
            c[i] = (char)('a'+i);
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    c[i] = c[j];
                }
            }
        }
        return new String(c);
    }
}
