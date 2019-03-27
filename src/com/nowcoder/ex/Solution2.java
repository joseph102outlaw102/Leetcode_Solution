package com.nowcoder.ex;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 15:32
 **/

public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution2().replaceSpace(new StringBuffer("hello world")));
    }
}
