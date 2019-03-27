package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 21:07
 **/

public class Solution136 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])) {
                if (map.get(nums2[i]) == 1) {
                    ans.add(nums2[i]);
                    map.remove(nums2[i]);
                } else if (map.get(nums2[i]) > 1) {
                    ans.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
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
