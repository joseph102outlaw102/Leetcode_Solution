package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 20:54
 **/

public class Solution25 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int min = prices[0];
        int maxP = 0;
        for(int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxP = Math.max(maxP,prices[i]-min);
        }
        return maxP;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
