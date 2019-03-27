package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-27 14:17
 *
 * 利用dfs深度搜索，最重要的是理解cur_list这个变量，为当前可用的List<String> cur_list
 * 另外注意，每次ans添加的时候，要添加cur_list的深拷贝，否则会出错
 *
 **/

public class Solution170 {
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans = new ArrayList<List<String>>();
        List<String> cur_list = new ArrayList<String>();
        if(s==null||s.length()<1){
            return ans;
        }
        dfs(s,cur_list);
        return ans;
    }

    public void dfs(String s,List<String> cur){
        if(isPalindrome(s)){
            cur.add(s);
            ans.add(copy(cur));
            cur.remove(cur.size()-1);
        }
        for(int i=1;i<s.length();i++){
            if(isPalindrome(s.substring(0,i))){
                cur.add(s.substring(0,i));
                dfs(s.substring(i,s.length()),cur);
                cur.remove(cur.size()-1);
            }
        }
    }

    public List<String> copy(List<String> ori){
        List<String> copyOfOri = new ArrayList<>();
        for(String s:ori){
            copyOfOri.add(s);
        }
        return copyOfOri;
    }

    public boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
