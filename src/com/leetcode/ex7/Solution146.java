package com.leetcode.ex7;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 14:26
 **/

public class Solution146 {
    Queue<Integer> p;
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length<k||k==0){
            return new int[]{};
        }
        p = new PriorityQueue<>((a,b) -> b-a);
        int[] ans = new int[nums.length-k+1];
        int i;
        for(i=0;i<=nums.length-k;i++){
            if(i==0){
                for(int j=0;j<k;j++){
                    p.add(nums[j]);
                }
            }else{
                p.add(nums[i+k-1]);
            }
            ans[i] = p.peek();
            p.remove(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        //System.out.println(new Solution146().maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6},5));
        System.out.println(new Solution146().maxSlidingWindow(new int[]{1,-1},1));
    }
}
