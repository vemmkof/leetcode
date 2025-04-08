package com.vemmkof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution56Test {
    final Solution56 solution = new Solution56();

    private static Stream<Arguments> getInvalidCases() {
        return Stream.of(
                Arguments.of(List.of()),
                Arguments.of(List.of(new int[]{1, 2}))
        );
    }

    private static Stream<Arguments> getValidCases() {
        return Stream.of(
                Arguments.of(List.of(new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}),
                        List.of(new int[]{1, 6}, new int[]{8, 10}, new int[]{15, 18})), // solution
                Arguments.of(List.of(new int[]{1, 4}, new int[]{4, 5}),
                        List.of(new int[]{1, 5})), // solution
                Arguments.of(List.of(new int[]{1, 4}, new int[]{0, 4}),
                        List.of(new int[]{0, 4})) // solution
        );
    }

    @ParameterizedTest
    @MethodSource({"getInvalidCases"})
    void isCorrect_shouldHandleInvalidCases(List<int[]> intervals) {
        int[][] intervalsArray = intervals.toArray(new int[0][]);
        assertArrayEquals(intervalsArray, solution.merge(intervalsArray));
    }


    @ParameterizedTest
    @MethodSource({"getValidCases"})
    void isCorrect_shouldHandleInvalidCases(List<int[]> intervals, List<int[]> mergedInterval) {
        int[][] intervalsArray = intervals.toArray(new int[intervals.size()][]);
        int[][] mergedIntervalArray = mergedInterval.toArray(new int[mergedInterval.size()][]);
        assertArrayEquals(mergedIntervalArray, solution.merge(intervalsArray));
    }
}
