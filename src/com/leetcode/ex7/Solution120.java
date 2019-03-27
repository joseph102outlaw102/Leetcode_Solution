package com.leetcode.ex7;

import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 15:52
 **/

public class Solution120 {
    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        Stack<Integer> s = new Stack();
        //求中间节点
        ListNode p = head,q=head;
        while(p!=null&&p.next!=null){
            p = p.next.next;
            q = q.next;
        }
        //此时q是中间节点
        while(q!=null){
            s.add(q.val);
            q=q.next;
        }
        while(!s.isEmpty()){
            if(head.val!=s.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
