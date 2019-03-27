package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 20:05
 **/



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution9 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while(l2!=null){
            if(l2.val!=l1.val){
                l1 = l1.next;
                l1.val = l2.val;
            }
            l2 = l2.next;
        }
        l1.next=null;
        return head;
    }
}
