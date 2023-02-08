package com.exercise.basic.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Bai4Test {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 2, 1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 3, 2}, new int[]{1, 2, 3, 4, 5}));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void handleSortArray(int[] input, int[] expect) {
        final var bai4 = new Bai4();

        int[] actual = bai4.handleSortArray(input);
        Assertions.assertArrayEquals(expect, actual);
    }
}
