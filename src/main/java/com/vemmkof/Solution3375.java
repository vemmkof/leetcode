package com.vemmkof;

import java.util.HashSet;
import java.util.Set;

public class Solution3375 {
    public int minOperations(int[] nums, int k) {
        Set<Integer> greaterThanK = new HashSet<>();
        for (int number : nums) {
            if (number < k) return -1;
            if (number > k) greaterThanK.add(number);
        }
        return greaterThanK.size();
    }
}
