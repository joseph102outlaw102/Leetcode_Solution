package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-06 13:35
 **/

public class Solution35 {
    public boolean lemonadeChange(int[] bills) {
        int[] a = new int[]{0,0,0};
        for(int i:bills){
            switch (i){
                case 5:
                    a[0]++;
                    break;
                case 10:
                    if(a[0]-->0){
                        a[1]++;
                    }else{
                        return false;
                    }
                    break;
                case 20:
                    if(a[0]>0&&a[1]>0){
                        a[0]--;
                        a[1]--;
                        a[2]++;
                    }else if(a[0]>2){
                        a[0]-=3;
                    }else{
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
