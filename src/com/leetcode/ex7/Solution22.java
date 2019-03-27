package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 17:07
 **/

public class Solution22 {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int groupLength = numRows*2-2;
        int length = s.length();
        StringBuilder ret = new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;i+j<length;j+=groupLength) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && groupLength - i + j < length){
                    ret.append(s.charAt(j+groupLength-i));
                }
            }
        }
        return ret.toString();
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution22().convert("LEETCODEISHIRING",3));
        System.out.println(new Solution22().convert("LEETCODEISHIRING",4));
    }
}
