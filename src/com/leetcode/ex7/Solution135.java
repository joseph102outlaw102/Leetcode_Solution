package com.leetcode.ex7;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 19:53
 * 发现 List.toArray(T[] a)用不了，怎么都出错
 **/

public class Solution135 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])&&!ans.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] x = new int[ans.size()];
        for(int i=0;i<x.length;i++){
            x[i] = ans.get(i);
        }
        return x;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
