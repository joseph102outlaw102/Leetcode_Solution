package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 14:06
 **/

public class Solution157 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] c = new char[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        char[] d = new char[26];
        for(int i=0;i<t.length();i++){
            d[t.charAt(i)-'a']++;
        }
        if(String.copyValueOf(c).equals(String.copyValueOf(d))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
