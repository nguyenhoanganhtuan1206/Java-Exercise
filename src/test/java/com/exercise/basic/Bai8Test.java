package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Bai8Test {

    @Test
    void handleCheckStr() {
        final var bai8 = new Bai8();

        assertFalse(bai8.handleCheckStr("(((())))()(,)"));
        assertFalse(bai8.handleCheckStr("(,)"));
        assertFalse(bai8.handleCheckStr(")"));
        assertFalse(bai8.handleCheckStr("("));

        assertTrue(bai8.handleCheckStr("(((())))()()"));
        assertTrue(bai8.handleCheckStr("()()()"));
    }
}
