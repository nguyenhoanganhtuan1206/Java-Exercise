package com.exercise.basic.SoHoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Bai1Test {

    @Test
    void testXuLyUocChungLonNhat() {
        final var bai1 = new Bai1();

        assertEquals(10, bai1.xuLyUocChungLonNhat(10, 0));
        assertEquals(10, bai1.xuLyUocChungLonNhat(0, 10));
        assertEquals(5, bai1.xuLyUocChungLonNhat(15, 20));
        assertEquals(1, bai1.xuLyUocChungLonNhat(15, 13));
    }

    @Test
    void testXuLyBoiChungNhoNhat() {
        final var bai1 = new Bai1();

        assertEquals(0, bai1.xuLyBoiChungNhoNhat(20, 0));
        assertEquals(0, bai1.xuLyBoiChungNhoNhat(0, 20));
        assertEquals(20, bai1.xuLyBoiChungNhoNhat(20, 5));
        assertEquals(60, bai1.xuLyBoiChungNhoNhat(15, 20));
        assertEquals(36, bai1.xuLyBoiChungNhoNhat(12, 18));
    }
}
