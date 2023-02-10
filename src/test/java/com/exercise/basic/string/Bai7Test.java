package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai7Test {

    @Test
    void findSubstring() {
        final var bai7 = new Bai7();

        assertEquals(4, bai7.findSubstring("anh tuan", "tu"));
        assertEquals(0, bai7.findSubstring("anh tuan", "anh"));

        assertEquals(-1, bai7.findSubstring("anh tuan", "asdasd"));
        assertEquals(-1, bai7.findSubstring("asdasd", "anh tuan"));
        assertEquals(0, bai7.findSubstring("anh tuan", " "));
        assertEquals(0, bai7.findSubstring("", "anh tuan"));
        assertEquals(0, bai7.findSubstring("anh tuan", ""));
    }
}
