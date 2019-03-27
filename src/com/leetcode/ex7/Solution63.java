package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-08 11:26
 **/

public class Solution63 {
    static Map<Character,Integer> map;
    static{
        map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public int romanToInt(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(i<n-1&&map.get(s.charAt(i+1))>map.get(c)){
                ans -= map.get(c);
            }else{
                ans += map.get(c);
            }
        }
        return ans;
    }
}
