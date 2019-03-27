package com.leetcode.ex7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-03 13:33
 **/

public class Solution34 {
    public int numSpecialEquivGroups(String[] A) {
        int[] count = new int[52];
        Set<String> set = new HashSet<>();
        for(String s:A){
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a'+(i%2)*26]++;
            }
            set.add(Arrays.toString(count));
        }
        return set.size();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
