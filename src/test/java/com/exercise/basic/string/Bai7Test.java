package com.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai7Test {

    @Test
    void findSubstring() {
        final var bai7 = new Bai7();

        assertTrue(bai7.findSubstring("anh tuan", "tu"));
        assertTrue(bai7.findSubstring("anh tuan", "anh"));

        assertFalse(bai7.findSubstring("anh tuan", "asdasd"));
        assertFalse(bai7.findSubstring("asdasd", "anh tuan"));
        assertFalse(bai7.findSubstring("anh tuan", " "));
        assertFalse(bai7.findSubstring("anh tuan", ""));
        assertFalse(bai7.findSubstring("", "anh tuan"));
    }
}
