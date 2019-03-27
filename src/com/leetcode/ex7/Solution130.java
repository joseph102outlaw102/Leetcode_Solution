package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-09 20:32
 * 具体思路参见https://github.com/Shellbye/Shellbye.github.io/issues/42
 * 大致思路为，动态规划的数组定义为 dp[i][j]为i个鸡蛋 j次移动最多可以确定多少楼层，动态规划方程为ans[i][j] = ans[i - 1][j - 1] + ans[i][j - 1]+1;
 **/

public class Solution130 {
    public int superEggDrop(int K, int N) {
        int[][] ans = new int[K+1][N+1];
        for(int j=0;j<=N;j++){
            ans[0][j] = 0;
            ans[1][j] = j;
        }
        for(int i=1;i<=K;i++){
            ans[i][0] = 0;
            ans[i][1] = 1;
        }
        for(int j=2;j<=N;j++){
            for(int i=2;i<=K;i++){
                ans[i][j] = ans[i - 1][j - 1] + ans[i][j - 1]+1;
                if (ans[i][j] >= N) {
                    return j;
                }
            }
        }
        return N;
    }
    public static void main(String[] args){
        System.out.println(new Solution130().superEggDrop(3,14));
    }
}
