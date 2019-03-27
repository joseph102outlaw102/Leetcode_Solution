package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 14:08
 **/

public class Solution15 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode head = pre;
        int flag = 0;
        while(l1!=null||l2!=null){
            int x = l1!=null?l1.val:0;
            int y = l2!=null?l2.val:0;
            ListNode l = new ListNode(x+y+flag);
            flag = l.val/10;
            l.val %= 10;
            pre.next = l;
            pre = pre.next;
            if(l1!=null) {
                l1 = l1.next;
            }
            if(l2!=null) {
                l2 = l2.next;
            }
        }
        if(flag!=0){
            ListNode l = new ListNode(flag);
            pre.next = l;
        }
        return head.next;
    }
}
