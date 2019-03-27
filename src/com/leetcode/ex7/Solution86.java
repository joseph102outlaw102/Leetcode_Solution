package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-14 12:31
 **/

public class Solution86 {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }else if(nums[n-1]>nums[n-2]){
            return n-1;
        }else{
            return findPeakIndex(nums,0,n-1);
        }
    }
    public int findPeakIndex(int[] nums, int start, int end){
        if(end-start==2){
            if(nums[start+1]>nums[start]&&nums[start+1]>nums[end]){
                return start+1;
            }else{
                return nums[start]>nums[end]?start:end;
            }
        }else if(end-start==1){
            return nums[start]>nums[end]?start:end;
        }
        int half = (start+end)/2;
        if(nums[half]>nums[half-1]){
            return findPeakIndex(nums,half,end);
        }else{
            return findPeakIndex(nums,start,half);
        }
    }
}
