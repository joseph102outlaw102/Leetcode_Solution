package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 13:50
 **/

public class Solution72 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        int i,j;
        for(i=a.length()-1,j=b.length()-1;i>=0||j>=0||flag>0;i--,j--){
            int a1 = i>=0?a.charAt(i)-'0':0;
            int b1 = j>=0?b.charAt(j)-'0':0;
            int tmp = a1+b1+flag;
            sb.append(tmp%2);
            flag = tmp/2;
        }
        return sb.reverse().toString();
    }
}
