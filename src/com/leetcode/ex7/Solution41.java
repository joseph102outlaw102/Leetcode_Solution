package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 12:57
 **/

public class Solution41 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>=n2){
            return findMedianSortedArrays1(nums1,0,n1-1, nums2,0,n2-1);
        }
        else{
            return findMedianSortedArrays1(nums2,0,n2-1, nums1,0,n1-1);
        }
    }
    public double findMedianSortedArrays1(int[] nums1, int a1, int b1, int[] nums2, int a2, int b2){
        int n1 = b1-a1+1;
        int n2 = b2-a2+1;
        if(n1==1&&n2==1){
            return (nums1[a1]+nums2[a2])/2;
        }else if(n2==1){
            if(n1%2==0){
                return findMedianFromThreeNumbers(nums2[a2],nums1[a1+n1/2-1],nums1[a1+n1/2]);
            }else{
                return findMedianFromFourNumbers(nums2[a2],nums1[a1+n1/2-2],nums1[a1+n1/2-1],nums1[a1+n1/2]);
            }
        }
        int pre = n2/2;
        int post = n2-n2/2-1;
        if(nums1[a1+post]<=nums2[pre]){
            return findMedianSortedArrays1(nums1, a1+post, b1, nums2, a2, pre);
        }else if(nums1[b1-1-pre]>=nums2[pre]) {
            return findMedianSortedArrays1(nums1, a1, b1 - 1 - pre, nums2, pre, a2);
        }
        return 0;
    }
    public double findMedianFromThreeNumbers(int a,int b,int c){
        return Math.min(Math.max(a,b),c);
    }
    public double findMedianFromFourNumbers(int a,int b,int c,int d){
        if(a<=b){
            return (b+c)/2;
        }else if(b<a&&a<=d){
            return (a+c)/2;
        }else{
            return (c+d)/2;
        }
    }
}
