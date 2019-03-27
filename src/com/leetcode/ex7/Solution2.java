package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-26 22:52
 **/

class Solution2 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }else {
            String str = Integer.toString(x);
            int l = str.length();
            boolean flag = true;
            char[] dst = new char[l];
            str.getChars(0,l,dst,0);
            for (int i = 0; i < (l/2);i++) {
                if (dst[i]==dst[l-i-1]) {
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(-121));
    }
}
