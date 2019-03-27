package com.nowcoder.ex;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 15:53
 **/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution3 {
    Stack<ListNode> s;
    ArrayList<Integer> l;
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        s = new Stack();
        l = new ArrayList<>();
        while(listNode!=null){
            s.push(listNode);
            listNode = listNode.next;
        }
        while(!s.empty()){
            l.add(s.pop().val);
        }
        return l;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
