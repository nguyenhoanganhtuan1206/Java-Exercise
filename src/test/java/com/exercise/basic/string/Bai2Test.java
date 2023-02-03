package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai2Test {

    @Test
    void testSymmetrical() {
        final var bai2 = new Bai2();

        assertEquals(true, bai2.checkSymmetrical("abcdcba"));
        assertEquals(false, bai2.checkSymmetrical("abcdcba1"));
        assertEquals(false, bai2.checkSymmetrical(""));
    }
}
