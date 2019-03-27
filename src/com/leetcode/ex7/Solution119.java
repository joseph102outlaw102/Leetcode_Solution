package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 15:36
 **/

public class Solution119 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()){
            while(s1.size()>0){
                s2.add(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(s2.isEmpty()){
            while(s1.size()>0){
                s2.add(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */