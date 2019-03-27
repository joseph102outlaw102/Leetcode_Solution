package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 16:58
 **/

public class Solution96 {
    public int projectionArea(int[][] grid) {
        int[] x = new int[grid.length];
        int[] y = new int[grid.length];
        int sumxz = 0;
        int sumyz = 0;
        int sumxy = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                x[i] = Math.max(x[i],grid[i][j]);
                y[j] = Math.max(y[j],grid[i][j]);
                sumxy += grid[i][j]>0?1:0;
            }
        }
        for(int i:x){
            sumxz += i;
        }
        for(int i:y){
            sumyz += i;
        }
        return sumxy+sumxz+sumyz;
    }
}
