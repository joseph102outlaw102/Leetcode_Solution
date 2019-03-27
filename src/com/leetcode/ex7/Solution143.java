package com.leetcode.ex7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-15 16:41
 **/

class Solution143 {
    int[] ori;
    public Solution143(int[] nums) {
        ori = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ori;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] target = Arrays.copyOf(ori, ori.length);
        int length = target.length;
        Random ran1 = new Random();
        for(int i=ori.length-1;i>0;i--){
            int randomIndex = ran1.nextInt(i+1);
            int temp = target[i];
            target[i] = target[randomIndex];
            target[randomIndex] = temp;
        }
        return target;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        Solution143 solution = new Solution143(nums);

// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
        solution.shuffle();

// 重设数组到它的初始状态[1,2,3]。
        solution.reset();

// 随机返回数组[1,2,3]打乱后的结果。
        solution.shuffle();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
