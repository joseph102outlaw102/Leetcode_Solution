package com.leetcode.ex7;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 21:18
 **/

public class Solution28 {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode p = head;
        boolean flag = false;
        while(p!=null){
            if(set.contains(p)){
                flag = true;
                break;
            }else{
                set.add(p);
                p = p.next;
            }
        }
        return flag;
    }
}
