package com.leetcode.ex7;

import javax.xml.stream.events.Characters;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 20:09
 **/

public class Solution152 {
    public int firstUniqChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(sb.indexOf(Character.toString(s.charAt(i)))==sb.lastIndexOf(Character.toString(s.charAt(i)))){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
