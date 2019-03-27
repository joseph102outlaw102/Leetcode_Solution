package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 12:25
 **/

public class Solution68 {
    static StringBuilder[] a;
    static{
        a = new StringBuilder[30];
        a[0]=new StringBuilder("1");
        for(int i=1;i<30;i++){
            StringBuilder s = a[i-1];
            StringBuilder s1 = new StringBuilder();
            int preLoc = 0;
            char preChar = s.charAt(0);
            for(int j=0;j<=s.length();j++){
                while(j<s.length()&&s.charAt(j)==preChar){
                    j++;
                }
                s1.append(j-preLoc);
                s1.append(preChar);
                preLoc=j;
                if(j==s.length()){
                    break;
                }
                preChar=s.charAt(j);
            }
            a[i]=s1;
        }
    }
    public String countAndSay(int n) {
        return a[n-1].toString();
    }
    public static void main(String[] args){
        System.out.println(Solution68.a);
    }
}
