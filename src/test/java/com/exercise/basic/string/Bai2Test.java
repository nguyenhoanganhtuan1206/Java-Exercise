package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Bai2Test {

    @Test
    void testSymmetrical() {
        final var bai2 = new Bai2();

        assertTrue(bai2.checkSymmetrical("abcdcba"));

        assertFalse(bai2.checkSymmetrical("abcdcba1"));
        assertFalse(bai2.checkSymmetrical(""));
    }
}
