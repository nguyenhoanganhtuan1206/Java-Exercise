package com.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Bai4Test {

    @Test
    void handleSortArray() {
        final var bai4 = new Bai4();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bai4.handleSortArray(new int[]{3, 2, 1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 5, 6}, bai4.handleSortArray(new int[]{1, 2, 3, 5, 6, 1, 2, 3}));
    }
}
