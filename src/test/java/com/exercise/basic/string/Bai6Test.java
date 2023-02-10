package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai6Test {

    @Test
    void generatorLastNumBarcode() {
        final var bai6 = new Bai6();

        assertEquals(4, bai6.generatorLastBarcode("893850597419"));
        assertEquals(8, bai6.generatorLastBarcode("123456789012"));
        assertEquals(8, bai6.generatorLastBarcode("893850597411"));
        assertEquals(4, bai6.generatorLastBarcode("123456789023"));
        assertEquals(8, bai6.generatorLastBarcode("723456789023"));
    }
}
