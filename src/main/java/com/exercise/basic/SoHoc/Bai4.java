package com.exercise.basic.SoHoc;

public class Bai4 {

    public int sumFibonacci(final int number) {
        // 4 -> 1 + 1 + 2 + 3 -> 7
        int f1 = 1;
        int f2 = 1;
        int f3;
        int sum = 0;

        for (int i = 1; f1 <= number; i++) {
            sum += f1;
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return sum;
    }
}
