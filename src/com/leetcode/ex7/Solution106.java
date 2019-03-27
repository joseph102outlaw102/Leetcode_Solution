package com.leetcode.ex7;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 14:17
 **/

/**
 * 不是快乐数的数称为不快乐数（unhappy number），
 * 所有不快乐数的数位平方和计算，
 * 最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中。
 */

public class Solution106 {
    Set<Integer> set;
    public boolean isHappy(int n) {
        //set = new HashSet<>();
        while(n!=1){
            //if(set.contains(n))return false;
            //set.add(n);
            if(n==4)return false;
            n = func(n);
        }
        return true;
    }
    public int func(int n){
        int sum = 0;
        while(n>0){
            sum += Math.pow((int)(n%10),2);
            n /= 10;
        }
        return sum;
    }
}
