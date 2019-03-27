package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-09 19:42
 * 从右上角开始找，如果大于target，则往左，如果小于，则往下。
 **/

public class Solution129 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        for(int i=0,k=matrix[0].length-1;k>=0&&i<matrix.length;){
            if(matrix[i][k]==target){
                return true;
            }else if(matrix[i][k]>target){
                k--;
            }else{
                i++;
            }
        }
        return false;
    }
}
