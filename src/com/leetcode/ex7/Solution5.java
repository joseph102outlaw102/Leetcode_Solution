package com.leetcode.ex7;

import java.util.Arrays;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2018-12-28 16:11
 **/

public class Solution5 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int temp = 0;
        int i,j;
        for(i=1;i<nums.length;i++){
            while(nums[i]==nums[i-1]&&count<nums.length-1-i){
                temp = nums[i];
                for(j=i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[j] = temp;
                count++;
            }
            if(count==nums.length-1-i) {
                System.out.println(Arrays.toString(nums)+"    i:"+i+"    count:"+count);
                if (nums[i] != nums[i - 1]) {
                    return i+1;
                } else {
                    return i;
                }
            }
            System.out.println(Arrays.toString(nums)+"    i:"+i+"    count:"+count);
        }
        return 1;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println(new Solution5().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
