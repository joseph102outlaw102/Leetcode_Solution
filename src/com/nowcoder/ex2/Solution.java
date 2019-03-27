package com.nowcoder.ex2;

import java.util.Scanner;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 19:33
 **/

public class Solution {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        int ans = 0;
        for(int i=0;i<n;i++){
            int tmp1 = ((int)a.charAt(i))%10;
            int tmp2 = ((int)b.charAt(i))%10;
            ans += Math.min((tmp2+10-tmp1)%10,(tmp1+10-tmp2)%10);
        }
        System.out.println(ans);
    }
}
