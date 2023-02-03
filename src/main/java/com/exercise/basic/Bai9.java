package com.exercise.basic;

public class Bai9 {

    public boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countNumbersPrime(final int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        return count;
    }
}
