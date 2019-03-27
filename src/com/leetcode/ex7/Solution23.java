package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 17:19
 **/

public class Solution23 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode h1 = new ListNode(0);
        h1.next = head;
        ListNode p = h1;
        ListNode q = head;
        int temp = n;
        while(temp-->1){
            q = q.next;
        }

        while(q.next!=null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return h1.next;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
