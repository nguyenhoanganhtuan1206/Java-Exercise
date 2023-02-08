package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Bai9Test {

    @Test
    void calSqrt() throws Exception {
        final var bai9 = new Bai9();

        assertThrows(Exception.class, () -> bai9.calSqrt(-5));
        assertEquals(3.1622314453125, bai9.calSqrt(10));
        assertEquals(4.4720458984375, bai9.calSqrt(20));
    }
}
