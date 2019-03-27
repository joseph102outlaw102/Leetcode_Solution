package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 11:39
 **/

public class Solution141 {
    public int findKthLargest(int[] nums, int k) {
        return quicksort(nums,0,nums.length-1,k-1);
    }
    public int quicksort(int[] nums, int l,int r,int k){
        int temp = nums[l];
        int i = l;
        int j = r;
        while(i!=j){
            while(nums[j]<=temp&&i<j){//顺序很重要，要先从右边开始找，顺序不对就错了
                j--;
            }
            while(nums[i]>=temp&&i<j){
                i++;
            }
            if(i<j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[l] = nums[i];
        nums[i] = temp;
        if(i==k) {
            return temp;
        }else if(i<k){
            return quicksort(nums, i + 1, r,k);
        }else {
            return quicksort(nums, l, i - 1,k);
        }
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
