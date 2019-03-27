package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 20:29
 **/

class Solution10 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>(0);
        }
        List<Integer> l = new ArrayList<Integer>(1);
        l.add(1);
        List<List<Integer>> l1 = new ArrayList<List<Integer>>(1);
        l1.add(l);
        for(int i=1;i<numRows;i++){
            List<Integer> li = new ArrayList<Integer>(i+1);
            for(int j=0;j<i+1;j++){
                if(j==0){
                    li.add(1);
                }else if(j<i){
                    li.add(l1.get(i-1).get(j)+l1.get(i-1).get(j-1));
                }else{
                    li.add(l1.get(i-1).get(j-1));
                }
            }
            l1.add(li);
        }
        return l1;
    }
    public static void main(String[] args){
        System.out.println(new Solution10().generate(0));
    }
}
