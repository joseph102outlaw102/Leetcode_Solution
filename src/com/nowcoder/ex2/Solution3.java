package com.nowcoder.ex2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 20:04
 **/

public class Solution3 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b  = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=n-1,j=n-1;
        int count = 0;
        int ans = 0;
        while(i>=0&&j>=0){
            if(count%2==0){
                if(a[i]>b[j]){
                    ans += a[i--];
                }else{
                    j--;
                }
            }else{
                if(a[i]>b[j]){
                    i--;
                }else{
                    ans -= b[j--];
                }
            }
            count++;
        }
        while(i>0){
            if(count%2==0){
                    ans += a[i--];
            }else{
                    i--;
            }
            count++;
        }
        while(j>0){
            if(count%2==0){
                j--;
            }else{
                ans -= b[j--];
            }
            count++;
        }
        System.out.println(ans);
    }
}
