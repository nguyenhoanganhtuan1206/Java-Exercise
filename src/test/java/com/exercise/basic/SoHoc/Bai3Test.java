package com.exercise.basic.SoHoc;

import com.exercise.basic.SoHoc.Bai3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai3Test {

    @Test
    void handleAnalysisNumber() {
        final var bai3 = new Bai3();

        assertEquals("2 * 2 * 2 * 3 * 5 * 5", bai3.handleAnalysisNumber(600));
        assertEquals("2", bai3.handleAnalysisNumber(2));
        assertEquals("1", bai3.handleAnalysisNumber(1));
        assertEquals("0", bai3.handleAnalysisNumber(0));
        assertEquals("-1", bai3.handleAnalysisNumber(-1));
        assertEquals("-2", bai3.handleAnalysisNumber(-2));
    }
}
