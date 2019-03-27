package com.nowcoder.ex2;

import java.util.Scanner;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 19:50
 **/

public class Solution2 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int k = sc.nextInt();
        long d = ((long)Math.pow(2,k)-n)/2;
        for(int i=0;i<k-1;i++){
            if(d%2==1){
                System.out.println((int)Math.pow(2,i)+" -");
            }else{
                System.out.println((int)Math.pow(2,i)+" +");
            }
            d/=2;
        }
        if(n%2==1){
            System.out.println((int)Math.pow(2,k-1)+" +");
        }else{
            System.out.println(((int)Math.pow(2,k-1)+1)+" +");
        }
    }
}
