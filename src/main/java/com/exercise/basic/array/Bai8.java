package com.exercise.basic.array;

public class Bai8 {

    public int sumElements(final int arr[]) {
        int sumResult = 0;

        for (int i = 0; i < arr.length; i++) {
            sumResult += arr[i] * arr[i];
        }

        return sumResult;
    }
}
