package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 13:53
 **/

public class Solution37 {
    List<Integer> list = new ArrayList();
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n = A.length;
        for(int i=0;i<n;i++){
            list.add(A[i]);
        }
        int a=0;
        while(n>0){
            boolean flag = false;
            for(int i=0;i<n;i++){
                if(list.get(i)>B[a]){
                    A[a++]=list.get(i);
                    list.remove(i);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                A[a++]=list.get(0);
                list.remove(0);
            }
            n--;
        }
        return A;
    }

}
