package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-02 20:58
 **/

public class Solution32 {
    ArrayList<Integer>[] graph;
    int[] ans;
    int[] quiet;
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n1 = quiet.length;
        graph = new ArrayList[n1];
        ans = new int[n1];
        this.quiet = quiet;
        for(int i=0;i<n1;i++){
            graph[i] = new ArrayList<>();
        }
        Arrays.fill(ans,-1);
        int n2 = richer.length;
        for(int i=0;i<n2;i++){
            int a = richer[i][1];
            int b = richer[i][0];
            graph[a].add(b);
        }
        for(int i=0;i<n1;i++){
            dfs(i);
        }
        return ans;
    }
    public int dfs(int node){
        if(ans[node] == -1) {
            ans[node] = node;
            for (int j:graph[node]) {
                int temp = dfs(j);
                if (quiet[ans[node]] > quiet[temp]) {
                    ans[node] = temp;
                }
            }
        }
        return ans[node];
    }
    public static void main(String[] args){
        int[] q = new int[]{3,2,5,4,6,1,7,0};
        int[][] r = new int[][]{{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
        System.out.println(new Solution32().loudAndRich(r,q));
    }
}
