package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 13:43
 **/

public class Solution93 {
    public ListNode middleNode(ListNode head) {
        ListNode p = head,q=head;
        while(p.next!=null){
            p = p.next;
            q = q.next;
            if(p.next==null){
                return q;
            }
            p = p.next;
        }
        return q;
    }
}
