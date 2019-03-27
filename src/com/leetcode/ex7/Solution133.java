package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-11 19:29
 * 破坏性存储，保证前面的正确性即可
 **/

public class Solution133 {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j++] = nums[i++];
            }
        }
        while(j<nums.length){
            nums[j++] = 0;
        }
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}
