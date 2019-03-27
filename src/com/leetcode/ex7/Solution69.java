package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 12:54
 **/

public class Solution69 {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        if(n==0)return 0;
        int pre = -1;  //pre指单词前面的空格的位置, i指单词后面的空格的位置, 所以i可以等于n
        int ans = 0;
        for(int i=0;i<=n;i++){
            while(i<n&&s.charAt(i)!=' '){
                i++;
            }
            ans = i-pre-1>0?i-pre-1:ans;
            pre = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
