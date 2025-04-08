package com.vemmkof;

public class Solution3396 {
    public int minimumOperations(int[] nums) {
        int[] present = new int[101];
        int length = nums.length;
        int pivot = 0;
        for (int num : nums) {
            if (present[num] == 1) {
                while ((present[num] == 1) && (pivot < length)) {
                    present[nums[pivot++]]--;
                }
            }
            present[num]++;
        }
        return (int) Math.ceil(pivot / 3.0);
    }
}
