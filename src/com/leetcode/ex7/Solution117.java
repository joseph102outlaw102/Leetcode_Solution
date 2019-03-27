package com.leetcode.ex7;

import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 14:43
 **/

public class Solution117 {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count = n-2; //除去1和n
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, true);
        for(int i=2;i*i<n;i++){
            while(i*i<n&&flag[i]==false){
                i++;
            }
            for(int j=i*i;j<n;j+=i){
                if(flag[j]==true) {
                    flag[j] = false;
                    count--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Solution117 x = new Solution117();
        System.out.println(x.countPrimes(20));
    }
}
