package com.exercise.basic;

public class Bai4 {

    public int fibonacci(final int number) {
        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public int sumFibonacci(final int number) {
        int sum = 0;

        for (int i = 0; i < number && fibonacci(i) < number; i++) {
            sum += fibonacci(i);
        }
        return sum;
    }
}
