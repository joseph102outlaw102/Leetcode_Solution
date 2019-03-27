package com.leetcode.ex7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-30 15:56
 **/

public class Solution21 {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int groupLength = numRows*2-2;
        int full = s.length()%(groupLength);
        if(full!=0){
            full = groupLength - full;
        }
        StringBuilder s1 = new StringBuilder(s);
        while(full-->0){
            s1.append('*');
        }
        char[] c = (new String(s1)).toCharArray();
        System.out.println(c);
        int groupNum = s1.length()/(groupLength);
        StringBuilder s2 = new StringBuilder("");
        for(int j=1;j<=numRows;j++){
            if(j==1) {
                for (int i = 0; i < groupNum; i++) {
                    s2.append((char)c[i*groupLength]);
                }
            }else if(j==numRows){
                for (int i = 0; i < groupNum; i++) {
                    char tempC = c[i*groupLength+numRows-1];
                    if(tempC!='*'){
                        s2.append(tempC);
                    }
                }
            }else{
                for (int i = 0; i < groupNum; i++) {
                    char tempC = c[i*groupLength+j-1];
                    if(tempC!='*'){
                        s2.append(tempC);
                    }
                    tempC = c[i*groupLength+2*numRows-j-1];
                    if(tempC!='*'){
                        s2.append(tempC);
                    }
                }
            }
        }
        return new String(s2);
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution21().convert("LEETCODEISHIRING",3));
        System.out.println(new Solution21().convert("LEETCODEISHIRING",4));
//        Map map1 = new Solution30().map(5);
//        Iterator iterator = map1.entrySet().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
