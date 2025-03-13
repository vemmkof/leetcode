package com.vemmkof;

public class Solution3356 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int length = queries.length;
        int i = 0;
        int k = 0;
        while (!isZeroArray(nums) && i < length) {
            // decrement wisely
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];
            for (int j = l; j <= r; j++) {
                nums[j] = Math.max(0, nums[j] - val);
            }
            k++;
            i++;
        }
        return isZeroArray(nums) ? k : -1;
    }

    private boolean isZeroArray(int[] nums) {
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
