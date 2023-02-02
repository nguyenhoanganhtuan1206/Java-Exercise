package com.anhtuan.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {

    @Test
    void testXuLyUocChungLonNhat() {
        final var bai1 = new Bai1();

        assertEquals(5, bai1.xuLyUocChungLonNhat(15, 20));
        assertEquals(1, bai1.xuLyUocChungLonNhat(15, 13));
    }

    @Test
    void testXuLyBoiChungNhoNhat() {
        final var bai1 = new Bai1();

        assertEquals(20, bai1.xuLyBoiChungNhoNhat(20, 5));
        assertEquals(60, bai1.xuLyBoiChungNhoNhat(15, 20));
        assertEquals(36, bai1.xuLyBoiChungNhoNhat(12, 18));
    }
}
