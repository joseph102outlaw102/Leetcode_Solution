package com.leetcode.ex7;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 20:54
 **/

public class Solution165 {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i<j){
            while(i<j&&!set.contains(sb.charAt(i))){
                i++;
            }
            while(i<j&&!set.contains(sb.charAt(j))){
                j--;
            }
            if(i<j){
                char tmp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,tmp);
            }
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
