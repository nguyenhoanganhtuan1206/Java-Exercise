package com.anhtuan.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai2Test {

    @Test
    void sum() {
        final var result = new Bai2();

        assertEquals(6, result.sumDigits(15));
        assertEquals(2, result.sumDigits(20));
    }
}
