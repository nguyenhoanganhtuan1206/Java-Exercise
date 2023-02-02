package com.anhtuan.exercise.basic;

public class Bai2 {
    public double sum(final int n) {
        final double s = 0;

        int nTemp = n;
        double rs = s;

        while (nTemp > 0) {
            rs += nTemp % 10;
            nTemp /= 10;
        }

        return rs;
    }
}
