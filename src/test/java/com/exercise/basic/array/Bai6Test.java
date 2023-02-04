package com.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai6Test {

    @Test
    void testSearchBinary() {
        final var bai6 = new Bai6();

        final int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13, 22, 28, 32, 33, 50, 88};

        assertEquals(-1, bai6.searchBinary(new int[]{}, 5));
        assertEquals(-1, bai6.searchBinary(new int[]{1}, 5));

        assertEquals(4, bai6.searchBinary(arr, 5));
        assertEquals(-1, bai6.searchBinary(arr, 0));
        assertEquals(5, bai6.searchBinary(arr, 6));
        assertEquals(12, bai6.searchBinary(arr, 28));
        assertEquals(14, bai6.searchBinary(arr, 33));
    }
}
