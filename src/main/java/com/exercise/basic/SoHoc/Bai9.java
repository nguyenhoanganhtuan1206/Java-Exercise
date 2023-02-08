package com.exercise.basic.SoHoc;

public class Bai9 {

    public double calSqrt(final double number) throws Exception {
        if (number < 0) {
            throw new Exception("Number must be larger than 0");
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
