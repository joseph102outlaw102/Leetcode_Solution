package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:00
 **/

public class Solution108 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(0);
        ListNode h1 = h;
        while(head!=null){
            if(head.val!=val){
                h.next=head;
                h = h.next;
            }
            head = head.next;
        }
        h.next=null;
        return h1.next;
    }
}
