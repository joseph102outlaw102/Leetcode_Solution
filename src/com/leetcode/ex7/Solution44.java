package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 15:52
 **/

public class Solution44 {
    public int climbStairs(int n) {
        int l = n>2?n:2;
        int[] A = new int[l];
        A[0]=1;
        A[1]=2;
        for(int i=2;i<l;i++){
            A[i]=A[i-1]+A[i-2];
        }
        return A[n-1];
    }
}
