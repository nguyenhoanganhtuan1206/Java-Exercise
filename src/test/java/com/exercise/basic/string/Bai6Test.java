package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai6Test {

    @Test
    void generatorLastNumBarcode() {
        final var bai6 = new Bai6();

        assertEquals(7, bai6.generatorLastNumBarcode("978020137962"));
        assertEquals(7, bai6.generatorLastNumBarcode("893850597419"));
        assertEquals(5, bai6.generatorLastNumBarcode("893850597411"));
    }
}
