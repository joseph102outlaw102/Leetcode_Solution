package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 16:41
 * 参考链接: https://blog.csdn.net/lanchunhui/article/details/51611970
 **/

public class Solution162 {
    List<Integer> l;
    public int lengthOfLIS(int[] nums) {
        if(nums==null){
            return 0;
        }else if(nums.length<=1){
            return nums.length;
        }
        l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int tmp = findIndex(nums[i]);
            if(tmp==l.size()) {
                l.add(nums[i]);
            }else{
                l.set(tmp,nums[i]);
            }
        }
        return l.size();
    }
    public int findIndex(int num){
        int i = 0,j = l.size();
        while(i<j){
            int mid = (i+j)/2;
            if(l.get(mid)<num){
                i = mid+1;
            }else{
                j = mid;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution162().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
