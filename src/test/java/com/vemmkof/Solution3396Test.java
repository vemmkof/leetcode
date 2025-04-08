package com.vemmkof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution3396Test {
    final Solution3396 solution = new Solution3396();

    private static Stream<Arguments> getCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7}, 2),
                Arguments.of(new int[]{4, 5, 6, 4, 4}, 2),
                Arguments.of(new int[]{6, 7, 8, 9}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getCases")
    void isCorrect_shouldHandleAllCases(int[] nums, int operations) {
        assertEquals(operations, solution.minimumOperations(nums));
    }

}
