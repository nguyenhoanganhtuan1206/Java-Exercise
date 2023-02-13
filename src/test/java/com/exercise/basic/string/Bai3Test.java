package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai3Test {

    @Test
    void sumDigits() {
        final var bai3 = new Bai3();

        assertEquals(380, bai3.sumDigits("abc 123 def 33 mn 3.221"));
        assertEquals(156, bai3.sumDigits("abc 123 def 33"));
        assertEquals(0, bai3.sumDigits("abcdef"));
        assertEquals(0, bai3.sumDigits(" "));

        assertEquals(123, bai3.sumDigits("123"));
        assertEquals(123, bai3.sumDigits("123nnnnnnnnnnnnn"));
        assertEquals(213123213, bai3.sumDigits("n213123213n"));
    }
}
