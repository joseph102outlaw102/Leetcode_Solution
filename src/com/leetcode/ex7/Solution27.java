package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 21:10
 **/

public class Solution27 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
