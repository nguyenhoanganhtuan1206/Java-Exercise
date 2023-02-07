package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai3Test {

    @Test
    void sumDigits() {
        final var bai3 = new Bai3();

        assertEquals(380 , bai3.sumDigits("abc 123 def 33 mn 3.221"));
        assertEquals(156 , bai3.sumDigits("abc 123 def 33"));
    }
}
