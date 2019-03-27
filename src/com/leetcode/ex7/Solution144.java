package com.leetcode.ex7;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-17 21:33
 **/

public class Solution144 {
    PriorityQueue<Integer> p;
    public int kthSmallest(int[][] matrix, int k) {
        int i = 0, j=0;
        Comparator<Integer> ite = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        p = new PriorityQueue<Integer>(ite);
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(p.size()<k){
                    p.add(matrix[i][j]);
                }else if(p.size()>=k&&matrix[i][j]<p.peek()){
                    p.add(matrix[i][j]);
                    p.poll();
                }
            }
        }
        return p.peek();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
