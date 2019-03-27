package com.vmware.ex1;

import java.util.Scanner;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-12 19:48
 **/

public class Main {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ans;
        //int[][] x = new int[N][3];
        for(int i=0;i<N;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int ans_temp = new Func().func(m,s);
            if(n%2==0){
                ans_temp += 1;
            }
            if(ans_temp%2==0){
                ans = 'B';
            }else{
                ans = 'A';
            }
            System.out.println(ans);
        }
    }

}
class Func{
    public static int func(int l, int x){
        int count = 0;
        while(func1(l,x)!=-1){
            l /= func1(l,x);
            count += 1;
        }
        return count;
    }

    public static int func1(int l, int x){
        for(int i=x;i*2<=l;i++){
            if(l%i==0){
                return l/i;
            }
        }
        return -1;
    }
}
