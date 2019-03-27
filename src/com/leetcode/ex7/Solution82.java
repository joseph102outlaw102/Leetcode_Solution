package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-13 21:05
 * 常规方法：依次遍历数组内所有的数字，添加到ans中的所有list内，同时保存所有原list的拷贝
 **/

public class Solution82 {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> empty = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        ans.add(empty);
        one.add(nums[0]);
        ans.add(one);
        for(int i=1;i<nums.length;i++){
            addToAllSet(ans,nums[i]);
        }
        return ans;
    }
    public void addToAllSet(List<List<Integer>> ans,int x){
        int n = ans.size();
        for(int i=0;i<n;i++){
            List<Integer> tmpList = ans.get(i);
            List<Integer> newList = new ArrayList<>(tmpList);
            ans.add(newList);  //把原list的拷贝添加进去
            tmpList.add(x);
        }
    }
}
