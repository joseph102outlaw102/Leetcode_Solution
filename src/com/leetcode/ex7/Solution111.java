package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:20
 **/

public class Solution111 {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    if(t.charAt(j)!=t.charAt(i)){
                        return false;
                    }
                }
                if(t.charAt(j)==t.charAt(i)){
                    if(s.charAt(j)!=s.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
