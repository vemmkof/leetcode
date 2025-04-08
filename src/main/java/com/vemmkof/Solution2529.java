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

        int low = 0;
        int high = nums.length - 1;
        int firstNonNegative = nums.length; // default to the length of the array

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                low = mid + 1; // move right to find a non-negative number
            } else {
                firstNonNegative = mid; // found a non-negative number, adjust upper bound
                high = mid - 1;
            }
        }

        // Count negatives and positives (ignoring zeros in positive count)
        int negativeCount = firstNonNegative;
        int positiveCount = nums.length - firstNonNegative;

        // We should exclude zeros from the positive count
        for (int i = firstNonNegative; i < nums.length; i++) {
            if (nums[i] == 0) {
                positiveCount--;
            }
        }

        return Math.max(negativeCount, positiveCount);
    }
}
