package com.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai8Test {

    @Test
    void testSumElements() {
        final var bai8 = new Bai8();

        assertEquals(91, bai8.sumElements(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(91, bai8.sumElements(new int[]{-1, -2, -3, -4, -5, -6}));
    }
}
