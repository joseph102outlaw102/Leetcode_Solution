package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 19:03
 **/

public class Solution60 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
