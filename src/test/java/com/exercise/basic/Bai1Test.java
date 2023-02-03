package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {

    @Test
    void testFindMaxNumber() {
        final var bai1 = new Bai1();

        assertEquals(22, bai1.findMaxNumber(new int[]{1, 2, 4, 2, 5, 22, 2, 7, 8, 0}));
        assertEquals(-1, bai1.findMaxNumber(new int[]{-1, -2, -3, -4, -5}));
    }
}
