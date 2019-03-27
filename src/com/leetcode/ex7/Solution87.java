package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-14 13:06
 **/

public class Solution87 {
    //nums
    public int findPeakElement(int[] arr) {
        if(arr==null||arr.length<=1)
            return arr==null||arr.length==0?-1:0;
        int L = 0,R = arr.length-1;
        while(L<R){
            int mid = L+((R-L)>>1);
            if(arr[mid]<arr[mid+1])
                L=mid+1;
            else
                R=mid;
        }
        return L;
    }
}
