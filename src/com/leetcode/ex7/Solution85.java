package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-14 01:18
 **/

public class Solution85 {
    //数每个数因数5的个数
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n>=5){
            ans += n/5;
            n /= 5;
        }
        return ans;
    }
    public static void main(String[] args){
        for(int i=1;i<=30;i++){
            System.out.println(new Solution85().trailingZeroes(i));
        }
    }
}
