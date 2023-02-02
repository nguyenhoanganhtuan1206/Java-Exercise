package com.anhtuan.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai5Test {

    @Test
    void subtractNumber() {
        final var bai5 = new Bai5();
        int[] arr = {2, 2, 3, 1, 2, 5, 4, 5, 6, 7, 8};

        assertEquals(7, bai5.subtractNumber(arr));
    }
}
