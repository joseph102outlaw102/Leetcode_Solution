package com.leetcode.ex7;

import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-26 22:48
 **/

public class Solution125 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467%n == 0;
    }
}
