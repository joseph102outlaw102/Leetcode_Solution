package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 15:03
 **/

public class Solution38 {
    public int binaryGap(int N) {
        int gap = 0;
        int a=-1,b=1;
        while(N%2==0){
            N/=2;
        }
        while(N>0){
            if(N%2==1){
                if(a!=-1){
                    gap=Math.max(gap,b-a);
                }
                a=b;
            }
            b++;
            N/=2;
        }
        return gap;
    }
}
