package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-26 23:43
 **/

public class Solution4 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] dst = new char[s.length()];
        s.getChars(0,s.length(),dst,0);
        for(char c:dst){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(stack.empty()){
                return false;
            }else{
                switch (c){
                    case ')':
                        if(stack.peek()=='('){
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                    case ']':
                        if(stack.peek()=='['){
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                    case '}':
                        if(stack.peek()=='{'){
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Solution4 s = new Solution4();
        System.out.println(s.isValid("{}[]([{}])"));
    }
}
