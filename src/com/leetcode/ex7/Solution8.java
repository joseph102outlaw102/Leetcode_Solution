package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 19:58
 **/

public class Solution8 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        if(nums.length==0){
            return 0;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution8().removeElement(new int[]{0,0,1,1,1,2,2,3,3,4},2));
        System.out.println(new Solution8().removeElement(new int[]{3,2,2,3},3));
    }
}
