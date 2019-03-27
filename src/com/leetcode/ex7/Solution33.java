package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-03 13:05
 **/

public class Solution33 {
    public int[] fairCandySwap(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<>();
        int sumA = 0;
        int sumB = 0;
        for(int i:A){
            sumA += i;
        }
        for(int i:B){
            sumB += i;
        }
        int gap = (sumA-sumB)/2;
        for(int i=0;i<A.length;i++){
            map.put(A[i]-gap,A[i]);
        }
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                return new int[]{map.get(B[i]),B[i]};
            }
        }
        return null;
    }

}
