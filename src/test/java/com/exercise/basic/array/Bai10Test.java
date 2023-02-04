package com.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Bai10Test {

    @Test
    void reverseArray() {
        final var bai10 = new Bai10();

        assertArrayEquals(new int[]{-2, 8, 12, 3, 9, 6, 1, 7, 4, 2}, bai10.reverseArray(new int[]{2, 4, 7, 1, 6, 9, 3, 12, 8, -2}));
        assertArrayEquals(new int[]{-2}, bai10.reverseArray(new int[]{-2}));
    }
}
