package com.leetcode.ex7;

import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 17:47
 **/

public class Solution131 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxWordLength = 0;
        for(int i=0;i<wordDict.size();i++){
            maxWordLength = Math.max(maxWordLength,wordDict.get(i).length());
        }
        boolean[] dp = new boolean [s.length()+1];
        dp[0] = true;
        for(int i=1;i<s.length()+1;i++){
            int x = i-maxWordLength>0?i-maxWordLength:0;
            for(int j=x;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution131().wordBreak("leetcode", Arrays.asList(new String[]{"leet","code"})));
    }
}
