package com.anhtuan.exercise.basic;

public class Bai1 {
    public static double xuLyUocChungLonNhat(final int a, final int b) {
        if(a == 0 || b == 0) {
            return a + b;
        }

        int numberA = a;
        int numberB = b;

        while (numberA != numberB) {
            if(numberA > numberB) {
                numberA -= numberB;
            } else {
                numberB -= numberA;
            }
        }
        return numberA;
    }

    public static double xuLyBoiChungNhoNhat(final int a, final int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return a * b / xuLyUocChungLonNhat(a, b);
    }
}
