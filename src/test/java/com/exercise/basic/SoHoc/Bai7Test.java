package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai7Test {

    @Test
    void isCheck() {
        final var bai7 = new Bai7();

        assertTrue(bai7.checkSum(153));

        assertFalse(bai7.checkSum(23));
        assertFalse(bai7.checkSum(154));
    }
}
