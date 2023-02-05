package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai2Test {

    @Test
    void testSumArr() {
        final var bai2 = new Bai2();

        assertEquals(27, bai2.sumArr(new int[]{1, 2, 4, 2, 5, 22, 2, 7, 8, 0}));
    }
}
