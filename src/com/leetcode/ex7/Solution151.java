package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 18:54
 **/

public class Solution151 {
    Stack<Integer> s1;
    public int evalRPN(String[] tokens) {
        s1 = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int t2 = s1.pop();
                switch (s){
                    case "+":
                        s1.push(s1.pop()+t2);
                        break;
                    case "-":
                        s1.push(s1.pop()-t2);
                        break;
                    case "*":
                        s1.push(s1.pop()*t2);
                        break;
                    case "/":
                        s1.push(s1.pop()/t2);
                        break;
                }
            }else{
                s1.push(Integer.parseInt(s.trim()));
            }
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution151().evalRPN(new String[]{"2","1","+","3","*"}));
    }
}
