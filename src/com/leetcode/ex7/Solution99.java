package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 23:44
 **/

public class Solution99 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if(x>y){
            int temp = x;
            x = y;
            y = temp;
        }
        int i=0,j=0;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if(x==0){
            if(y==0){
                if(0<=bound)
                    list.add(0);
                return list;
            }else if(y==1){
                if(1<=bound)
                    list.add(1);
                return list;
            }else{
                while(Math.pow(y,j)<=bound){
                    set.add((int)(Math.pow(y,j)));
                    j++;
                }
            }
        }else if(x==1){
            if(y==1){
                if(2<=bound)
                    list.add(2);
                return list;
            }else{
                while (Math.pow(y, j) <= bound) {
                    set.add((int) (Math.pow(y, j) + 1));
                    j++;
                }
            }
        }
        else {
            while (Math.pow(y, j) <= bound) {
                i = 0;
                while (Math.pow(y, j) + Math.pow(x, i) <= bound) {
                    set.add((int) (Math.pow(y, j) + Math.pow(x, i)));
                    i++;
                }
                j++;
            }
        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }
}
