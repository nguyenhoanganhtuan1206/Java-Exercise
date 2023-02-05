package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai7Test {

    @Test
    void findSubstring() {
        final var bai7 = new Bai7();

        assertEquals(true, bai7.findSubstring("anh tuan", "tu"));
        assertEquals(true, bai7.findSubstring("anh tuan", "anh"));
        assertEquals(false, bai7.findSubstring("anh tuan", "asdasd"));
        assertEquals(false, bai7.findSubstring("anh tuan", " "));
        assertEquals(false, bai7.findSubstring("anh tuan", ""));
    }
}
