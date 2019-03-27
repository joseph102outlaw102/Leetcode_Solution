package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 16:25
 **/

public class Solution121 {
    boolean isPalindrome(ListNode head) {//O(n)、O(1)
        ListNode slow = head,fast = head,  prev = null;
        while (fast!=null){//find mid node
            slow = slow.next;
            fast = fast.next!=null ? fast.next.next: fast.next;
        }
        while (slow!=null){//reverse
            ListNode ovn = slow.next;
            slow.next = prev;
            prev = slow;
            slow = ovn;
        }
        while (head!=null && prev!=null){//check
            if (head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
