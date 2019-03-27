package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-26 23:24
 **/

class Solution3 {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }else if(x==0){
            return true;
        }else {
            int rev = 0;
            while(x>rev){
                rev = rev*10+x%10;
                x /= 10;
            }
            if(x==rev||x==rev/10){
                return true;
            }else{
                return false;
            }
        }
    }
}
