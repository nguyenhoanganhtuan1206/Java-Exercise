package com.exercise.basic.SoHoc;

public class Bai5 {

    public int findSum(final int number) {
        int total = 0;

        for (int i = 1; i <= number; i++) {
            total += i * (i + 1);
        }

        return total;
    }
}
