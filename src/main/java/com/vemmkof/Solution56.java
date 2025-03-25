package com.vemmkof;

import java.util.Arrays;

public class Solution56 {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int length = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];

        int[][] solutions = new int[10000][2];
        int solutionIndex = 0;

        for (int intervalIndex = 1; intervalIndex < length; intervalIndex++) {
            int nextStart = intervals[intervalIndex][0];
            int nextEnd = intervals[intervalIndex][1];

            if (nextStart <= end) {
                start = Math.min(start, nextStart);
                end = Math.max(end, nextEnd);
            } else {
                solutions[solutionIndex][0] = start;
                solutions[solutionIndex][1] = end;
                solutionIndex++;
                start = nextStart;
                end = nextEnd;
            }
        }

        solutions[solutionIndex][0] = start;
        solutions[solutionIndex][1] = end;
        solutionIndex++;

        return Arrays.copyOfRange(solutions, 0, solutionIndex);
    }

}
