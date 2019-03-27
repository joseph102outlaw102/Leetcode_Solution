package com.nowcoder.ex3;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-20 18:22
 **/

public class Solution1 {
    public boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        int i=0,j=0;
        for(i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>=48&&c<=57){
                sb.append(c);
            }else if(c>=65&&c<=90){
                sb.append(c);
            }else if(c>=97&&c<=122){
                sb.append((char)(c-'a'+'A'));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution1().isPalindrome("8 v888ee888 v8"));
    }
}
