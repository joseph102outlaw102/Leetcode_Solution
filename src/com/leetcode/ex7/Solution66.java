package com.leetcode.ex7;

import java.util.*;
import java.util.Map.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-08 11:54
 **/

public class Solution66 {
    Map<String, List<String>> map;
    public List<List<String>> groupAnagrams(String[] strs) {
        map = new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String str = strToStr(strs[i]);
            if(!map.containsKey(str)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }else{
                map.get(str).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        Iterator<List<String>> iterator = map.values().iterator();
        while(iterator.hasNext()){
            ans.add(iterator.next());
        }
//        for(Entry<String,List<String>> e:map.entrySet()){
//            ans.add(e.getValue());
//        }
        return ans;
    }
    public String strToStr(String str){
        int[] count = new int[26];
        Arrays.fill(count,0);
        int n=str.length();
        for(int i=0;i<n;i++){
            count[str.charAt(i)-'a']++;
        }
        return Arrays.toString(count);
    }
    public static void main(String[] args){
        Solution66 x = new Solution66();
        System.out.println(x.strToStr("bat"));
        System.out.println(x.strToStr("tab"));
        System.out.println(x.strToStr("tba"));
        System.out.println(x.strToStr("abt"));
    }
}
