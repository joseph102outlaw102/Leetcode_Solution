package com.leetcode.ex7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 15:19
 **/

public class Solution118 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}

class MyStack {
    /**
     * 始终保持两个队列中一个为空，对非空队列进行取数存数操作
     */
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.isEmpty()){
            q2.add(x);
        }else{
            q1.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.isEmpty()){
            while(q2.size()>1){
                q1.add(q2.poll());
            }
            return q2.poll();
        }else{
            while(q1.size()>1){
                q2.add(q1.poll());
            }
            return q1.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if(q1.isEmpty()){
            while(q2.size()>1){
                q1.add(q2.poll());
            }
            int x = q2.poll();
            q1.add(x);
            return x;
        }else{
            while(q1.size()>1){
                q2.add(q1.poll());
            }
            int x = q1.poll();
            q2.add(x);
            return x;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */