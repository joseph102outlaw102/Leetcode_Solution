package com.nowcoder.ex3;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-20 18:49
 **/

import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Stack<Integer> s = new Stack<>();
        while(x>0){
            s.push(x%10);
            x/=10;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.insert(0,s.pop());
        }
        System.out.println(sb.toString());
    }
}
