package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 14:54
 **/

public class Solution77 {
    Map<Integer,List<Integer>> map;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int floor = 0; //root为第一层
        int depth = preSort(root,0); //返回树的深度
        map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=depth-1;i>=0;i--){
            ans.add(map.get(i));
        }
        return ans;
    }
    public int preSort(TreeNode root, int floor){
        if(root==null){
            return 0;
        }else{
            if(map.containsKey(floor)){
                map.get(floor).add(root.val);
            }else{
                List l = new ArrayList<Integer>();
                l.add(root.val);
                map.put(floor,l);
            }
            return Math.max(preSort(root.left,floor+1),preSort(root.right, floor+1))+1;
        }
    }
}
