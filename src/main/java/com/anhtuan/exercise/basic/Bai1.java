package com.anhtuan.exercise.basic;

public class Bai1 {
    public double xuLyUocChungLonNhat(final int a, final int b) {
        int numberA = a;
        int numberB = b;

        if(a == 0 || b == 0) {
            return a + b;
        }

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

        int i = 1;
        while (true) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
            i++;
        }
    }
}
