package com.exercise.basic;

public class Bai2 {

    public int sumArr(final int arr[]) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        return sumEven - sumOdd;
    }
}
