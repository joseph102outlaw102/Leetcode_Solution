package com.leetcode.ex7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 15:18
 **/

public class Solution78 {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null&&root.right==null){  //叶子节点
            return 1;
        }
        if(root.left==null){  //左空右非空
            return minDepth(root.right)+1;
        }
        if(root.right==null){  //右空左非空
            return minDepth(root.left)+1;
        }
        //左右都非空
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
