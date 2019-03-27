package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 19:46
 **/

public class Solution61 {
    List<ListNode> list;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        list = new ArrayList<>();
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null){
            list.add(a);
            a=a.next;
        }
        while(b!=null){
            if(list.contains(b)){
                return b;
            }else{
                b=b.next;
            }
        }
        return null;
    }
}
