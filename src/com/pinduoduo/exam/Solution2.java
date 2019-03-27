package com.pinduoduo.exam;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-10 16:45
 **/

public class Solution2 {
    public char func(String str){
        int ans = 0;
        char x = 'z';
        for(int i = 0;i<str.length();i++){
            int temp = x>96?x:x-32;
            if((int)str.charAt(i)<temp){
                x = str.charAt(i);
                ans = i;
            }
        }
        return str.charAt(ans);
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        String str = "BcXYfew";
        System.out.println(new Solution2().func(str));
    }
}
