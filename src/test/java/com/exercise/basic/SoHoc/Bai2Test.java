package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai2Test {

    @Test
    void sumDigits() {
        final var bai2 = new Bai2();

        assertEquals(10 , bai2.sumDigits(91));
        assertEquals(10 , bai2.sumDigits(82));
        assertEquals(-10 , bai2.sumDigits(-82));
        assertEquals(1 , bai2.sumDigits(1));
    }
}
