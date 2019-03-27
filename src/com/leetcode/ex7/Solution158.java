package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 14:42
 **/

// Definition for a Node1.
// 为避免和Node重复，全部命名为Node1
class Node1 {
    public int val;
    public Node1 next;
    public Node1 random;

    public Node1() {}

    public Node1(int _val,Node1 _next,Node1 _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};

public class Solution158 {
    public Node1 copyRandomList(Node1 head) {
        Map<Node1,Node1> map = new HashMap<>();
        Node1 dummyHead = new Node1();
        Node1 n = dummyHead;
        Node1 l = head;
        while(l != null){
            n.next = new Node1(l.val,null,null);
            map.put(l,n.next);
            n = n.next;
            l = l.next;
        }
        l = head;
        n = dummyHead.next;
        while(l != null){
            Node1 randomNode = map.get(l.random);
            n.random = randomNode;
            n = n.next;
            l = l.next;
        }
        return dummyHead.next;
    }
}
