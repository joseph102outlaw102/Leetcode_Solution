package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 13:15
 **/

public class Solution145 {
    public static Comparator<Map.Entry<Integer,Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return o2.getValue()-o1.getValue();
        }
    };
    Map<Integer,Integer> map;
    PriorityQueue<Map.Entry<Integer,Integer>> p;
    public List<Integer> topKFrequent(int[] nums, int k) {
        map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        p = new PriorityQueue<>(comparator);
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            p.add(iterator.next());
        }
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(i++<k){
            l.add(p.poll().getKey());
        }
        return l;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
