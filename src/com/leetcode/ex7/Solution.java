package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-24 19:03
 **/

class Solution {
    public int reverse(int x) {
        Integer i = new Integer(x);
        boolean flag = true;
        if(i<0){
            flag = false;
        }
        StringBuilder str = new StringBuilder(i.toString());
        try {
            if (flag) {
                return new Integer(new String(str.reverse()));
            } else {
                return new Integer(new String("-"+str.delete(0, 1).reverse()));
            }
        }catch(NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int ans = new Solution().reverse(-123456789);
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
    }
}

