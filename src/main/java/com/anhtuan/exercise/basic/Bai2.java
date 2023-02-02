package com.anhtuan.exercise.basic;

public class Bai2 {
    public int sumDigits(final int number) {
        final int sum = 0;

        int tempNumber = number;
        int result = sum;

        while (tempNumber > 0) {
            result += tempNumber % 10;
            tempNumber /= 10;
        }

        return result;
    }
}
