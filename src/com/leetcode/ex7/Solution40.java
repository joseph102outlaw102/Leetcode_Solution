package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 16:16
 **/

public class Solution40 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        for(int i=1;i<strs.length;i++){
            strs[0] = longestCommonP(strs[0],strs[i]);
        }
        return strs[0];
    }
    public String longestCommonP(String str1,String str2){
        int i=0;
        while(i<str1.length()&&i<str2.length()&&str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        if(i==0){
            return "";
        }
        return str1.substring(0,i);
    }
}
