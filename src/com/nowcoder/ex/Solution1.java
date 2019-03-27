package com.nowcoder.ex;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 15:24
 * 牛客网 剑指offer 第一题：二维数组中的查找
 **/

public class Solution1 {
    public boolean Find(int target, int[][] array) {
        int m = array.length;
        int n = array[0].length;
        int i = 0,j=n-1;
        while(true){
            if(i>=m||j<0){
                return false;
            }
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
