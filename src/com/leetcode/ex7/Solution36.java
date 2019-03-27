package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 13:45
 **/

public class Solution36 {
    public int[][] transpose(int[][] A) {
        int row = A[0].length;
        int column = A.length;
        int[][] ans = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }
}
