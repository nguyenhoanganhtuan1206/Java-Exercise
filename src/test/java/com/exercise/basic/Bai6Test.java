package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai6Test {

    @Test
    void testSearchBinary() {
        final var bai6 = new Bai6();

        final int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(2, bai6.searchBinary(arr, 3));
        assertEquals(4, bai6.searchBinary(arr, 5));
        assertEquals(-1, bai6.searchBinary(arr, 0));
        assertEquals(5, bai6.searchBinary(arr, 6));
    }
}
