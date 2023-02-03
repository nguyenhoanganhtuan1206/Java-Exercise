package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai4Test {

    @Test
    void testSumFibonacci() {
        final var bai4 = new Bai4();

        assertEquals(20, bai4.sumFibonacci(9));
        assertEquals(433494436, bai4.sumFibonacci(222222222));
    }
}
