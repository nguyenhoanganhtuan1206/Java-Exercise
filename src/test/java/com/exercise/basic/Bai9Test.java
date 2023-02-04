package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai9Test {

    @Test
    void testIsPrime() {
        final var bai9 = new Bai9();

        assertEquals(false, bai9.isPrime(8));
        assertEquals(false, bai9.isPrime(-1));
    }

    @Test
    void testCountNumbersPrime() {
        final var bai9 = new Bai9();

        assertEquals(4, bai9.countNumbersPrime(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(0, bai9.countNumbersPrime(new int[]{4, 6, 8}));
    }
}
