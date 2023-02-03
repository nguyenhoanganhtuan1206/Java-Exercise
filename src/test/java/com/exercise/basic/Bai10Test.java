package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai10Test {

    @Test
    void handleFormatCode() {
        final var bai10 = new Bai10();

        assertEquals("Anh Tuan", bai10.handleFormatCode("   Anh    Tuan  "));
        assertEquals("Anh", bai10.handleFormatCode("   Anh                            "));
        assertEquals("", bai10.handleFormatCode("                               "));
    }
}
