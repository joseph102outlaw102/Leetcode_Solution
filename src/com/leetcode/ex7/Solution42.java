package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 14:50
 **/

public class Solution42 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m>n){
            int[] tempNums = nums1;
            nums1 = nums2;
            nums2 = tempNums;
            int temp = m;
            m = n;
            n = temp;
        }
        int iMax = m;
        int iMin = 0;
        int halfLength = (m+n+1)/2;
        while(iMin<=iMax){
            int i = (iMax+iMin)/2;
            int j = halfLength-i;
            if(i<iMax&&nums1[i]<nums2[j-1]){
                iMin = i+1;
            }else if(i>iMin&&nums1[i-1]>nums2[j]){
                iMax = i-1;
            }else{
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[i-1]; }
                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0;
    }
}
