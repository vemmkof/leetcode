package com.vemmkof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3356Test {
    final Solution3356 solution = new Solution3356();

    private static Stream<Arguments> getCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 0, 2}, new int[][]{{0, 2, 1}, {0, 2, 1}, {1, 1, 3}}, 2),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[][]{{1, 3, 2}, {0, 2, 1}}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getCases")
    void isCorrect_shouldHandleAllCases(int[] nums, int[][] queries, int expectedK) {
        assertEquals(expectedK, solution.minZeroArray(nums, queries));
    }
}