package com.nowcoder.ex3;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-20 18:33
 **/

public class Solution2 {
    Stack<Integer> s;
    public String Main(int x){
        s = new Stack<>();
        while(x>0){
            s.push(x%10);
            x/=10;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.insert(0,s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution2().Main(100));
    }
}
