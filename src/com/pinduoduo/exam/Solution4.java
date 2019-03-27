package com.pinduoduo.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-10 17:01
 **/

public class Solution4 {
    public int func(int n,int d,int[][] x){
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(x[j][0]-x[i][0]<d){
                    break;
                }else{
                    max = Math.max(max,x[i][1]+x[j][1]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
