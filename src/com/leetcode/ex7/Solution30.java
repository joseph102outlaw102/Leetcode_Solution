package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 21:45
 **/

public class Solution30 {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack();
        for(int i=0;i<ops.length;i++){
            switch (ops[i]){
                case "C":
                    s.pop();
                    break;
                case "D":
                    s.push(s.peek()*2);
                    break;
                case "+":
                    int a = s.pop();
                    int b = a+s.peek();
                    s.push(a);
                    s.push(b);
                    break;
                default:
                    s.push(Integer.valueOf(ops[i]));
            }
        }
        int sum = 0;
        for(int x:s){
            sum+=x;
        }
        return sum;
    }
}
