package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 12:22
 **/

public class Solution102 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            list.add((int)func(rowIndex,i));
        }
        return list;
    }
    public long func(int rowIndex, int i){
        int k = Math.min(rowIndex-i,i);
        int n = rowIndex;
        long sum = 1;
        for(int j=1; j<=k; j++){
            sum *= n--;
            sum /= j;
        }
        return sum;
    }
}
