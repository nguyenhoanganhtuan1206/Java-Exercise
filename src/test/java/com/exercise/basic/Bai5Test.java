package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai5Test {

    @Test
    void testSubtractNumber() {
        final var bai5 = new Bai5();

        assertEquals(7, bai5.subtractNumber(new int[]{2, 2, 3, 1, 2, 5, 4, 5, 6, 7, 8}));
        assertEquals(-1, bai5.subtractNumber(new int[]{-1}));
        assertEquals(3, bai5.subtractNumber(new int[]{-1, 2}));
    }
}
