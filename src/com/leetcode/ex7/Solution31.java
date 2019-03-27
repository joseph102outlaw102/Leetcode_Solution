package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-02 19:11
 **/

public class Solution31 {
    public boolean buddyStrings(String A, String B) {
        int a = A.length();
        int b = B.length();
        if(a!=b||a<=1||b<=1){
            return false;
        }
        int[] x = new int[26];
        if(A.equals(B)){
            for(int i=0;i<a;i++){
                if(x[A.charAt(i)-'a']>0){
                    return true;
                }else{
                    x[A.charAt(i)-'a']=1;
                }
            }
        }
        int count = 0;
        int c1 = ' ',c2 = ' ';
        for(int i=0;i<a;i++){
            if(A.charAt(i)!=B.charAt(i)){
                count++;
                switch (count){
                    case 1:
                        c1 = i;
                        break;
                    case 2:
                        c2 = i;
                        break;
                    case 3:
                        return false;
                    default:
                        break;
                }
            }
        }
        if(count==2&&A.charAt(c1)==B.charAt(c2)&&A.charAt(c2)==B.charAt(c1)){
            return true;
        }
        return false;
    }
}
