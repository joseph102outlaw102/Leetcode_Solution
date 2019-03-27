package com.vmware.ex2;

import java.util.Scanner;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-12 20:03
 **/

public class Main {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
        }
        System.out.println(VMware2(x));
    }

    public static int VMware2(int[] piles) {
        int N = piles.length;
        int[][] dp = new int[N+2][N+2];
        int sum = 0;
        for(int i=0;i<N;i++){
            dp[i][i] = -piles[i];
            sum += piles[i];
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
        sum = (sum-dp[0][N-1])/2+dp[0][N-1];
        return sum;
    }
}
