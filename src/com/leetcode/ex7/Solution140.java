package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 11:31
 **/

public class Solution140 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int j = i+1;
            while(j>0&&nums[j]>nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        return nums[k-1];
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
