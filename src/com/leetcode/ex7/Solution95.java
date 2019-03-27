package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 13:59
 **/

public class Solution95 {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        List<String> r = new ArrayList<>();
        for(String a:A.split(" ")){
            map.put(a,map.containsKey(a)?map.get(a)+1:1);
        }
        for(String a:B.split(" ")){
            map.put(a,map.containsKey(a)?map.get(a)+1:1);
        }
        for(String a:map.keySet()){
            if(map.get(a)==1){
                r.add(a);
            }
        }
        String[] ss = new String[r.size()];
        return r.toArray(ss);
    }
}
