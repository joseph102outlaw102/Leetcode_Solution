package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 18:48
 **/

public class Solution59 {
    Stack<ListNode> stack;
    public ListNode reverseList(ListNode head) {
        stack = new Stack<>();
        ListNode cur = head;
        while(cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        ListNode ans = new ListNode(0);
        ListNode ans1 = ans;
        while(!stack.empty()){
            ListNode c = stack.peek();
            stack.pop();
            ans.next = c;
            ans = ans.next;
        }
        ans.next = null;
        return ans1.next;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;
        new Solution59().reverseList(a1);
    }
}
