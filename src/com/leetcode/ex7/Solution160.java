package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 15:09
 * 未满足此题关于空间复杂度的要求，本方法为将链表里面的全部数据取出重排序，然后重新赋值
 **/

public class Solution160 {
    List<Integer> l;
    public ListNode sortList(ListNode head) {
        l = new ArrayList<>();
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur = head;
        while(cur!=null){
            l.add(cur.val);
            cur=cur.next;
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        Arrays.sort(ans);
        cur = head;
        int i = 0;
        while(cur!=null){
            cur.val = ans[i++];
            cur=cur.next;
        }
        return head;
    }
}
