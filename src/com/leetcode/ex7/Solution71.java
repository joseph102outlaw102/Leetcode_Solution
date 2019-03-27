package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-10 13:21
 **/

public class Solution71 {
    public int[] plusOne(int[] digits) {
        int flag = 1;//进位标志
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            int tmp = flag+digits[i];
            digits[i] = tmp%10;
            flag = tmp/10;
            if(flag==0){   //如果没有进位，则直接返回
                return digits;
            }
        }
        //运行到此，说明最高位有进位，需要重新申请数组空间
        int[] ans;
        ans = new int[n+1];
        ans[0]=1;
        for(int i=1;i<n+1;i++) {
            ans[i] = digits[i - 1];
        }
        return ans;
    }
}
