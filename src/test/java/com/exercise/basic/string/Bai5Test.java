package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai5Test {

    @Test
    void checkIsBarcode() {
        final var bai5 = new Bai5();

        assertTrue(bai5.checkIsBarcode("8938505974194"));

        assertFalse(bai5.checkIsBarcode("893850597419"));
    }
}
