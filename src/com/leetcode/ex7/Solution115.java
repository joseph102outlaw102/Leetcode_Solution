package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-18 15:55
 **/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Solution115 {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }else{
            if(root.children==null||root.children.size()==0){
                return 1;
            }
            int max = 0;
            for(int i=0;i<root.children.size();i++){
                max = Math.max(max,maxDepth(root.children.get(i))+1);
            }
            return max;
        }
    }

    public static void main(String[] args){
        Node a3 = new Node();
        List<Node> l2 = new ArrayList<>();
        l2.add(a3);
        Node a2 = new Node(2,l2);
        List<Node> l1 = new ArrayList<>();
        l1.add(a2);
        Node a1 = new Node(1,l1);
        System.out.println(new Solution115().maxDepth(a1));
    }
}
