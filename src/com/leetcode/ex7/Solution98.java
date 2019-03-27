package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 23:22
 **/

public class Solution98 {
    public boolean isMonotonic(int[] A) {
        if(A==null||A.length<=1){
            return true;
        }
        int i=1;
        int n=A.length;
        while(i<n&&A[i-1]==A[i]){
            i++;
        }
        if(i==n){
            return true;
        }
        if(A[i]>A[i-1]){
            while(i<n&&A[i]>=A[i-1]){
                i++;
            }
            if(i==n){
                return true;
            }else{
                return false;
            }
        }
        while(i<n&&A[i]<=A[i-1]){
            i++;
        }
        if(i==n){
            return true;
        }else{
            return false;
        }
    }
}
