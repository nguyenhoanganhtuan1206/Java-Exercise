package com.exercise.basic.SoHoc;

public class Bai2 {

    public int sumDigits(final int number) {
        int sum = 0;
        int numberTemp = number;

        while (numberTemp != 0) {
            sum += numberTemp % 10;
            numberTemp /= 10;
        }

        return sum;
    }
}
