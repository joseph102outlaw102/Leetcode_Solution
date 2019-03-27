package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-08 12:30
 **/

public class Solution67 {
    int[] numS;
    public List<List<Integer>> permute(int[] nums) {
        numS = nums;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(numS);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numS.length;i++){
            list.add(numS[i]);
        }
        lists.add(list);
        while(getNextPerm()){
            list = new ArrayList<Integer>();
            for(int i=0;i<numS.length;i++){
                list.add(numS[i]);
            }
            lists.add(list);
        }
        return lists;
    }
    public boolean getNextPerm(){
        int flag = numS.length-1;
        int min;
        while(flag>0&&numS[flag-1]>numS[flag]){
            flag--;
        }
        if(flag==0){
            return false;
        }
        min = flag;
        flag--;
        for(int i=flag+1;i<numS.length;i++){
            if(numS[i]<numS[flag]){
                continue;
            }
            if(numS[min]>numS[i]){
                min=i;
            }
        }
        swap(flag,min);
        sort(flag+1,numS.length);
        return true;
    }
    public void sort(int a, int b){
        Arrays.sort(numS,a,b);
    }
    public void swap(int a,int b){
        int temp = numS[a];
        numS[a]=numS[b];
        numS[b]=temp;
    }
    public static void main(String[] args){
        new Solution67().permute(new int[]{1,2,3});
    }
}
