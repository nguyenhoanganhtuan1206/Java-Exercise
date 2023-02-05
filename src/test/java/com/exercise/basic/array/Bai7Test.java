package com.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Bai7Test {

    @Test
    void testInsertToArr() {
        final var bai7 = new Bai7();

        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5}, bai7.handleInsertToArr(new int[]{1, 2, 3, 4, 5}, 4));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5}, bai7.handleInsertToArr(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
