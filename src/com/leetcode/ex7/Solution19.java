package com.leetcode.ex7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 15:29
 **/

public class Solution19 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0,i=0,j=0;
        Map<Character,Integer> set = new HashMap<Character,Integer>();
        for(;j<n;j++){
            if(set.containsKey(s.charAt(j))){
                i=Math.max(i,set.get(s.charAt(j)));
            }
            ans = Math.max(ans,j-i+1);
            set.put(s.charAt(j),j+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution19().lengthOfLongestSubstring("pwwkew"));
    }
}
