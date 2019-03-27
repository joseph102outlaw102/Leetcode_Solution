package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 21:14
 **/

public class Solution11 {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==0){
            return "";
        }
        int ans = 1;
        int location = 0;
        String s1 = new StringBuilder(s).reverse().toString();
        char[] c1 = s.toCharArray();
        char[] c2 = s1.toCharArray();
        int[][] max = new int[n][n];
        for(int i=0;i<n;i++){
            if(c1[0]==c2[i]){
                max[0][i]=1;
            }else{
                max[0][i]=0;
            }
        }
        for(int i=0;i<n;i++){
            if(c2[0]==c1[i]){
                max[i][0]=1;
            }else{
                max[i][0]=0;
            }
        }
        int i;
        for(i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(c1[i]!=c2[j]){
                    max[i][j]=0;
                }else {
                    max[i][j] = max[i - 1][j - 1] + 1;
                    if(ans<max[i][j]&&n-1-j==i-max[i][j]+1){
                        location = i;
                        ans = max[i][j];
                    }
                }
            }
        }
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                System.out.print(max[a][b]);
            }
            System.out.println();
        }
        System.out.println(location+"  "+ans);

        return s.substring(location-ans+1,location+1);
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution11().longestPalindrome("aacdefcaa"));
    }
}
