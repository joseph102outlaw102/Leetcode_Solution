package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-24 19:51
 **/

public class Solution1 {
    public int reverse(int x) {
        int rev = 0;
        int pop = 0;
        while(x!=0){
            pop = x%10;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&pop>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&pop<-8)){
                return 0;
            }
            rev = rev*10+pop;
            x/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int ans = new Solution1().reverse(-123456789);
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
    }
}
