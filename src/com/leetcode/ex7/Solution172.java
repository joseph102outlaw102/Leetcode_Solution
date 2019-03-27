package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-27 19:59
 * 先检查，后运算
 **/

public class Solution172 {
    List<String> ans;
    public List<String> wordBreak(String s, List<String> wordDict) {
        ans = new ArrayList<>();
        if(wordBreak_check(s,wordDict)==false){
            return ans;
        }
        Collections.sort(wordDict);
        int maxWordLen = 0;
        int minWordLen = Integer.MAX_VALUE;
        for(String tmpS:wordDict){
            maxWordLen = Math.max(maxWordLen,tmpS.length());
            minWordLen = Math.min(minWordLen,tmpS.length());
        }
        List<String> cur = new ArrayList<>();
        dfs(s, cur, wordDict, maxWordLen);
        return ans;
    }
    public void dfs(String last, List<String> pre, List<String> wordDict, int maxWordLen){
        if(Collections.binarySearch(wordDict,last)>=0){
            pre.add(last);
            ans.add(String.join(" ",pre));
            pre.remove(pre.size()-1);
        }
        int len = last.length();
        for(int i=1;i<len;i++){
            if(i>maxWordLen){
                return ;
            }
            String sub = last.substring(0, i);
            if(Collections.binarySearch(wordDict,sub)>=0){
                pre.add(sub);
                dfs(last.substring(i, len), pre,wordDict,maxWordLen);
                pre.remove(pre.size()-1);
            }
        }
    }
    public boolean wordBreak_check(String s, List<String> wordDict) {
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
}
