package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:37
 **/

public class Solution112 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0)return true;
        int i=0;
        while(i<s.length()) {
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i)))
                return false;
            i++;
        }
        return true;
    }
}
