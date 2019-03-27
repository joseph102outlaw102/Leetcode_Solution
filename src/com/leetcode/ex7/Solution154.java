package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 13:11
 **/

public class Solution154 {
    Map<Integer,Integer> map1;
    Map<Integer,Integer> map2;
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        for(int i=0;i<C.length;i++){
            if(map2.containsKey(C[i])){
                map2.put(C[i],map2.get(C[i])+1);
            }else{
                map2.put(C[i],1);
            }
        }
        int sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int target = 0-A[i]-B[j];
                if(map1.containsKey(target)){
                    sum += map1.get(target);
                }else{
                    int temp = twoSumCount(D,target);
                    sum += temp;
                    map1.put(target,temp);
                }
            }
        }
        return sum;
    }
    public int twoSumCount(int[] D, int twoSum){
        int sum = 0;
        for(int i=0;i<D.length;i++){
            int target = twoSum - D[i];
            if(map2.containsKey(target)){
                sum += map2.get(target);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        new Solution154().fourSumCount(new int[]{1,2},new int[]{-2,-1},new int[]{-1,2},new int[]{0,2});
    }
}
