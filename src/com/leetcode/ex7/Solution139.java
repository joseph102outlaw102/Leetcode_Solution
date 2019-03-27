package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-13 14:35
 **/

public class Solution139 {
    public boolean stoneGame(int[] piles) {
        int N = piles.length;
        int[][] dp = new int[N+2][N+2];
        for(int i=0;i<N;i++){
            dp[i][i] = -piles[i];
        }
        for(int size=2;size<=N;size++){
            for(int i=0;i+size<=N;i++){
                int j = i+size-1;
                if(size%2==0){
                    dp[i][j] = Math.max(dp[i+1][j]+piles[i],dp[i][j-1]+piles[j]);
                }else{
                    dp[i][j] = Math.min(dp[i+1][j]-piles[i],dp[i][j-1]-piles[j]);
                }
            }
        }
        return dp[0][N-1]>0;
    }

    public static void main(String args[]){
        System.out.println(new Solution139().stoneGame(new int[]{5,2,5,3}));
    }
}
