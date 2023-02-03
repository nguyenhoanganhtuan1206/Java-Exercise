package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai9Test {

    @Test
    void handleFormatStr() {
        final var bai9 = new Bai9();

        assertEquals("Anh tuan", bai9.handleFormatStr("aNh TuAN"));
        assertEquals("Nguyen hoang anh tuan", bai9.handleFormatStr("nguyen HOANG aNh TuAN"));
        assertEquals("", bai9.handleFormatStr(""));
    }
}
