package com.vemmkof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2529Test {
    final Solution2529 solution = new Solution2529();

    private static Stream<Arguments> getNegativeCases() {
        return Stream.of(
                Arguments.of(new int[]{-2, -1, -1, -5}, 4),
                Arguments.of(new int[]{-3, -2, -1, -10, -5}, 5)
        );
    }

    private static Stream<Arguments> getPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 20, 66, 1314}, 4),
                Arguments.of(new int[]{2, 4, 6, 8, 10}, 5)
        );
    }

    private static Stream<Arguments> getZeroCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 0}, 0),
                Arguments.of(new int[]{0, 0, 0, 0}, 0)
        );
    }

    private static Stream<Arguments> getMixedCases() {
        return Stream.of(
                Arguments.of(new int[]{-2, -1, -1, 1, 2, 3}, 3),
                Arguments.of(new int[]{-3, -2, -1, 0, 0, 1, 2}, 3),
                Arguments.of(new int[]{-3, -2, -1, 0, 1, 2, 3}, 3)
        );
    }

    // Parameterized tests
    @ParameterizedTest
    @MethodSource("getNegativeCases")
    void isCorrect_shouldHandleNegativeCases(int[] nums, int expectedCount) {
        assertEquals(solution.maximumCount(nums), expectedCount);
    }

    @ParameterizedTest
    @MethodSource("getPositiveCases")
    void isCorrect_shouldHandlePositiveCases(int[] nums, int expectedCount) {
        assertEquals(solution.maximumCount(nums), expectedCount);
    }

    @ParameterizedTest
    @MethodSource("getZeroCases")
    void isCorrect_shouldHandleZeroCases(int[] nums, int expectedCount) {
        assertEquals(solution.maximumCount(nums), expectedCount);
    }

    @ParameterizedTest
    @MethodSource("getMixedCases")
    void isCorrect_shouldHandleMixedCases(int[] nums, int expectedCount) {
        assertEquals(solution.maximumCount(nums), expectedCount);
    }
}
