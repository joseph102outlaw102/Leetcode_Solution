package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-14 00:06
 * 利用深度优先搜索算法
 **/

public class Solution83 {
    List<List<Integer>> ans;
    int length;
    int[] Nums;
    public List<List<Integer>> subsets(int[] nums) {
        length = nums.length;
        Nums = nums;
        ans = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<>();
        Count(0,l);
        return ans;
    }
    public void Count(int x, List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=x;i<length;i++){
            list.add(Nums[i]);
            Count(i+1,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args){
        System.out.println(new Solution83().subsets(new int[]{1,2,3}));
    }
}
