package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai5Test {

    @Test
    void findSum() {
        final var bai5 = new Bai5();

        assertEquals(70, bai5.findSum(5));
        assertEquals(0, bai5.findSum(-1));
        assertEquals(0, bai5.findSum(-2));
    }
}
