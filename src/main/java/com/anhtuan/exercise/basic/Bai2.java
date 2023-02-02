package com.anhtuan.exercise.basic;

public class Bai2 {
    public double sumDigits(final int number) {
        final double sum = 0;

        int tempNumber = number;
        double result = sum;

        while (tempNumber > 0) {
            result += tempNumber % 10;
            tempNumber /= 10;
        }

        return result;
    }
}
