package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 00:44
 **/

public class Solution100 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n=A.length;
        for(int i=n-1;i>1;i--){
            if(A[i-1]+A[i-2]>A[i]){
                return A[i-1]+A[i-2]+A[i];
            }
        }
        return 0;
    }
}
