package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai4Test {

    @Test
    void checkDuplicate() {
        final var bai4 = new Bai4();

        assertTrue(bai4.checkDuplicate("abab"));
        assertFalse(bai4.checkDuplicate("abc"));
    }
}
