package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 16:15
 **/

public class Solution46 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<n+m;i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
