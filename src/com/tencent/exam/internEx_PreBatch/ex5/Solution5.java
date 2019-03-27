package com.tencent.exam.internEx_PreBatch.ex5;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-10 15:51
 **/

public class Solution5 {
    public int permutation(int n, int L, int[] color){
        return func(0, 0,n-1,L,color);
    }
    public int func(int precolor, int l,int r,int L,int[] color){
        //首先针对不可表示的情况，返回零
        if(r-l+1<L){
            return 0;
        }

        //此处要格外注意，

        //其次针对只有一个元素的情况，返回1
        if(l==r){
            return 1;
        }
        int sum = 0;
        if(color[l]==precolor){
            //针对把color[l]放在第一个这种情况
            sum += func(precolor,l+1,r,L,color);
            //针对把color[l]放在任意一个节点后面这种情况，可以理解为绑定
            sum += (r-l)*func(precolor,l+1,r,L,color);
        }else{
            //针对把color[l]放在第一个这种情况
            sum += func(color[l],l+1,r,L-1,color);
            //针对把color[l]放在任意一个节点后面这种情况，可以理解为绑定
            sum += (r-l)*func(precolor,l+1,r,L,color);
        }
        return sum;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int ans = new Solution5().permutation(2,2,new int[]{1,2});
        int ans1 = new Solution5().permutation(4,3,new int[]{1,1,2,1});
        int ans2 = new Solution5().permutation(8,5,new int[]{1,2,2,3,3,3,1,4});
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
