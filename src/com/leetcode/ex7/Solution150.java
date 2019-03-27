package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 18:01
 *
 * 栈头有*和/ 先消化掉; 遇到op为+和-,消化掉栈内所有元素
 *
 **/

public class Solution150 {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int num = 0;
        s+='#';
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }else if(c==' '){

            }else{
                if(!s2.empty()&&s2.peek()=='*'){
                    s1.push(s1.pop()*num);
                    s2.pop();
                }else if(!s2.empty()&&s2.peek()=='/'){
                    s1.push(s1.pop()/num);
                    s2.pop();
                }else{
                    s1.push(num);
                }
                num = 0;
                if(c=='+'||c=='-'||c=='#'){
                    while(!s2.empty()){
                        switch (s2.pop()){
                            case '+':
                                s1.push(s1.pop()+s1.pop());
                                break;
                            case '-':
                                int tmp = s1.pop();
                                s1.push(s1.pop()-tmp);
                                break;
                        }
                    }
                }
                if(c=='#'){
                    return s1.peek();
                }
                s2.push(c);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution150().calculate("3+2*2"));
    }
}
