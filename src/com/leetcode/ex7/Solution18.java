package com.leetcode.ex7;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 15:03
 **/

public class Solution18 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0,i=0,j=0;
        Set<Character> set = new HashSet<Character>();
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans,set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution18().lengthOfLongestSubstring("pwwkew"));
    }
}
