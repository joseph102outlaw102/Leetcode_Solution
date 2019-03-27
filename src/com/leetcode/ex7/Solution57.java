package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 18:33
 **/

public class Solution57 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i:nums){
            if(map.containsKey(i)){
                int t = map.get(i);
                if(t+1>(n/2))
                    return i;
                map.put(i,t+1);
            }else{
                map.put(i,1);
            }
        }
        return 0;
    }
}
