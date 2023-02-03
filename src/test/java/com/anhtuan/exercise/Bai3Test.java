package com.anhtuan.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai3Test {

    @Test
    void handleAnalysisNumber() {
        final var bai3 = new Bai3();

        assertEquals("2 * 2 * 2 * 3 * 5 * 5", bai3.handleAnalysisNumber(600));
        assertEquals("-2", bai3.handleAnalysisNumber(-2));
        assertEquals("2", bai3.handleAnalysisNumber(2));
        assertEquals("-2 * 5", bai3.handleAnalysisNumber(-10));
    }
}
