package com.vemmkof;

public class Solution3356 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int sum = 0, k = 0;
        int[] diffArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            while (sum + diffArray[i] < nums[i]) {
                k++;
                if (k > queries.length) return -1;

                int left = queries[k - 1][0];
                int right = queries[k - 1][1];
                int value = queries[k - 1][2];

                if (right >= i) {
                    diffArray[Math.max(left, i)] += value;
                    if (right + 1 < diffArray.length) {
                        diffArray[right + 1] -= value;
                    }
                }
            }
            sum += diffArray[i];
        }
        return k;
    }
}
