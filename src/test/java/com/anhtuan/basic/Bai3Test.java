package com.anhtuan.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai3Test {

    @Test
    void testSumDigits() {
        final var bai3 = new Bai3();

        assertEquals(5 , bai3.sumDigits(32));
        assertEquals(5 , bai3.sumDigits(23));
        assertEquals(8 , bai3.sumDigits(44));
        assertEquals(5 , bai3.sumDigits(5));
    }

    @Test
    void testSortArray() {
        final var bai3 = new Bai3();

        int []input = new int[]{22, 123, 45, 67, 89, 21, 56, 23};
        int []result = new int[]{21, 22, 23, 123, 45, 56, 67, 89};

        assertArrayEquals(result , bai3.handleSortArray(input));
    }
}
