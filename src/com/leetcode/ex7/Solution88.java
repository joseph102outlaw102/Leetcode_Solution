package com.leetcode.ex7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-15 21:01
 **/

public class Solution88 {
    Queue<Integer> q;
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0){
            return false;
        }
        q = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(q.contains(nums[i])){
                return true;
            }
            if(q.size()<k){
                ((LinkedList<Integer>) q).add(nums[i]);
            }else{
                q.poll();
                q.add(nums[i]);
            }
        }
        return false;
    }
}
