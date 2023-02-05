package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {

    @Test
    void testReverseStr() {
        final var bai1 = new Bai1();

        assertEquals("nauT hnA" , bai1.reverseStr("Anh Tuan"));
        assertEquals("" , bai1.reverseStr(""));
    }
}
