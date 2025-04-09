package com.vemmkof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3375Test {

    final Solution3375 solution = new Solution3375();

    private static Stream<Arguments> getCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 2, 5, 4, 5}, 2, 2),
                Arguments.of(new int[]{2, 1, 2}, 2, -1),
                Arguments.of(new int[]{9, 7, 5, 3}, 1, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getCases")
    void isCorrect_shouldHandleAllCases(int[] nums, int k, int operations) {
        assertEquals(operations, solution.minOperations(nums, k));
    }
}
