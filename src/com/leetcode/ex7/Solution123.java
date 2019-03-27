package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-26 22:31
 **/

public class Solution123 {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int num1=0;
        while(num>0){
            num1+=num%10;
            num/=10;
        }
        return addDigits(num1);
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
