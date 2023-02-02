package com.anhtuan.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai2Test {

    @Test
    void sum() {
        final var rs = new Bai2();

        assertEquals(6, rs.sum(15));
        assertEquals(2, rs.sum(20));
    }
}
