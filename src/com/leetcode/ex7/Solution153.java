package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 20:28
 *
 * 解此题最快的方法
 *
 * 另一种方法：
 * 一个奇特的python解法： 开一个长度为26的字母表，所有的值都是n。扫描字符串。
 * 如果当前字母对应字母表中的值是n（说明还没有遇到过这个字母），就把字母表的这位置的值变成这个字母现在的index；
 * 如果对应的不是n（说明已经重复了），就把字母表的这位置的值变成n+1； 这样做的好处是，
 * 最后我们的字母表的最小值就是要求的索引，因为重复的和没出现的要么是n+1要么是n～～～
 *
 **/

public class Solution153 {
    public int firstUniqChar(String s) {
        int res = -1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                res = (res == -1 || res > index) ? index : res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
