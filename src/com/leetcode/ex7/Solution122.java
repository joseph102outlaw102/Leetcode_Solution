package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-19 16:28
 **/

public class Solution122 {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return new ArrayList<String>();
        }
        if(root.left==null&&root.right==null){
            List<String> ans = new ArrayList<String>();
            ans.add(Integer.toString(root.val));
            return ans;
        }
        else{
            List<String> ans = new ArrayList<String>();
            List<String> r = binaryTreePaths(root.right);
            List<String> l = binaryTreePaths(root.left);
            if(r.size()!=0)
            for(String s:r){
                ans.add(Integer.toString(root.val)+"->"+s);
            }
            if(l.size()!=0)
            for(String s:l){
                ans.add(Integer.toString(root.val)+"->"+s);
            }
            return ans;
        }
    }
}
