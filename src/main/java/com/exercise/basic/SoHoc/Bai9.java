package com.exercise.basic.SoHoc;

public class Bai9 {

    public double calSqrt(final double number) {
        if (number < 0) {
            return Double.NaN;
        }

        double start = 0;
        double end = number;
        double mid;
        while (end - start > 0.001) {
            mid = (start + end) / 2;
            if (mid * mid > number) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return start;
    }
}
