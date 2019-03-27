package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-07 16:56
 **/

public class Solution51 {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(j)==' '){
                StringBuilder cur = new StringBuilder(s.substring(i,j));
                ans.append(cur.reverse());
                ans.append(' ');
                i=j+1;
            }
            j++;
        }
        StringBuilder cur = new StringBuilder(s.substring(i,j));
        ans.append(cur.reverse());
        return ans.toString();
        //将return new String(ans)换成return ans.toString()，时间从28ms降低至12ms.
    }
}
