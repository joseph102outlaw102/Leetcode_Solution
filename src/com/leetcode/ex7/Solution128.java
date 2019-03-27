package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-09 15:48
 **/

/*
在一次遍历过程中，用双指针查询另外两个数字
 */

public class Solution128 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0||nums[i]>nums[i-1]){
                int sum = 0-nums[i];
                int l = i+1;
                int r = nums.length-1;
                while(l<r) {
                    if (nums[l] + nums[r] == sum) {
                        ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l]==nums[l+1]) l++;
                        l++;
                        while (l < r && nums[r]==nums[r-1]) r--;
                        r--;
                    } else if (nums[l] + nums[r] < sum) {
                        while (l < r && nums[l]==nums[l+1]) l++;
                        l++;
                    } else {
                        while (l < r && nums[r]==nums[r-1]) r--;
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}
