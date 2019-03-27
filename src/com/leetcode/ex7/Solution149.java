package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 16:09
 **/

public class Solution149 {
    Stack<Integer> s1;
    Stack<Character> s2;
    public int calculate(String s) {
        //StringBuilder sb = new StringBuilder(s);
        s1 = new Stack<Integer>();
        s2 = new Stack<Character>();
        int i=0;
        int n=s.length();
        int loc = 0;
        while(i<n){
            if(s.charAt(i)==' '){
                i++;
                continue;
            }
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                s1.push(Integer.valueOf(s.substring(loc,i).trim()));
                loc = i+1;
                while(!s2.empty()){
                    switch (s2.pop()){
                        case '+':
                            s1.push(s1.pop()+s1.pop());
                            break;
                        case '-':
                            int tmp = s1.pop();
                            s1.push(s1.pop()-tmp);
                            break;
                        case '*':
                            s1.push(s1.pop()*s1.pop());
                            break;
                        case '/':
                            tmp = s1.pop();
                            s1.push(s1.pop()/tmp);
                            break;
                    }
                }
                s2.push(s.charAt(i));
            }else if(s.charAt(i)=='*'||s.charAt(i)=='/'){
                s1.push(Integer.valueOf(s.substring(loc,i).trim()));
                loc = i+1;
                if(!s2.isEmpty()){
                    if(s2.peek()=='/'){
                        int tmp = s1.pop();
                        s1.push(s1.pop()/tmp);
                        s2.pop();
                    }else if(s2.peek()=='*'){
                        s1.push(s1.pop()*s1.pop());
                        s2.pop();
                    }
                }
                s2.push(s.charAt(i));
            }
            i++;
        }
        s1.push(Integer.valueOf(s.substring(loc,i).trim()));
        while(!s2.empty()){
            switch (s2.pop()){
                case '+':
                    s1.push(s1.pop()+s1.pop());
                    break;
                case '-':
                    int tmp = s1.pop();
                    s1.push(s1.pop()-tmp);
                    break;
                case '*':
                    s1.push(s1.pop()*s1.pop());
                    break;
                case '/':
                    tmp = s1.pop();
                    s1.push(s1.pop()/tmp);
                    break;
            }
        }
        return s1.pop();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution149().calculate("1+2*5/3+6/4*2"));
    }
}
