package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-29 14:46
 **/

public class Solution17 {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        char[] c = s.toCharArray();
        int n = s.length();
        int[] ans = new int[n];
        ans[0] = 1;
        int max = 1;
        for(int i=1;i<n;i++){
            int temp = ans[i-1];
            ans[i] = temp+1;
            for(int j=1;j<=temp;j++){
                if(c[i]==c[i-j]){
                    ans[i] = j;
                    break;
                }
            }
            max = Math.max(max,ans[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution17().lengthOfLongestSubstring("pwwkew"));
    }
}
