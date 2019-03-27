package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 13:36
 **/

public class Solution155 {
    Map<Integer,Integer> map1;
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        map1 = new HashMap<>();
        int sum = 0;
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int target = C[i] + D[j];
                if(map1.containsKey(target)){
                    map1.put(target,map1.get(target)+1);
                }else{
                    map1.put(target,1);
                }
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int target = 0-A[i]-B[j];
                if(map1.containsKey(target)){
                    sum += map1.get(target);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution154().fourSumCount(new int[]{1,2},new int[]{-2,-1},new int[]{-1,2},new int[]{0,2}));
    }
}
