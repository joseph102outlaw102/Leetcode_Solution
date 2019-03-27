package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-13 17:16
 **/

public class Solution79 {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()<=1){
            return true;
        }
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>=48&&c<=57){
                sb.append(c);
            }else if(c>=65&&c<=90){
                sb.append(c);
            }else if(c>=97&&c<=122){
                sb.append((char)(c-'a'+'A'));
            }
        }
        String s1 = sb.toString();
        int i = 0;
        int j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution79().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
