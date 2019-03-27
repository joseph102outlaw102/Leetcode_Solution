package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 15:28
 **/

class Solution147 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return new int[0];
        int l = 0, r = k-1; // l=[0,nums.length-k] , r=[k-1,nums.length-1]
        int[] results = new int[nums.length-k+1];
        int max = Integer.MIN_VALUE;
        int loc = -1; // 最大值所在的位置
        while(l <= nums.length - k) {
            if (loc < l) { // [l,r]中寻找最大值
                max = Integer.MIN_VALUE;
                for (int i = l ; i <=r ; i++) {
                    if (max < nums[i]) {
                        max = nums[i];
                        loc = i;
                    }
                }
            } else { // 只需要将最大值同r位置的比
                if (max < nums[r]) {
                    max = nums[r];
                    loc = r;
                }
            }
            results[l] = max;
            l ++;
            r ++;
        }
        return results;
    }
}
