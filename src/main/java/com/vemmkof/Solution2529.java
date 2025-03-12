package com.vemmkof;

public class Solution2529 {
    public int maximumCount(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0; // no positives - no negatives
        if (nums[0] == 0 && nums[length - 1] == 0)
            return 0; // no positives - no negatives
        if (nums[0] < 0 && nums[length - 1] < 0)
            return length; // no positives
        if (nums[0] > 0 && nums[length - 1] > 0)
            return length; // no negatives
        int negativeCount = 0;
        int i = 0;
        while (nums[i] < 0 && i < length - 1) {
            negativeCount++;
            i++;
        }
        while (nums[i] == 0 && i < length - 1) {
            i++;
        }
        int positiveCount = length - i;
        return Math.max(negativeCount, positiveCount);
    }
}
