package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 21:02
 **/

public class Solution26 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int pre = prices[0];
        int cur = prices[0];
        int sum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>cur){
                cur = prices[i];
            }else{
                sum+=cur-pre;
                pre = prices[i];
                cur = prices[i];
            }
        }
        sum+=cur-pre;
        return sum;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
