package com.exercise.basic;

public class Bai8 {

    public int sumElements(final int arr[]) {
        int sumResult = 0;

        for (int i = 0; i < arr.length; i++) {
            sumResult += Math.pow(arr[i], 2);
        }

        return sumResult;
    }
}
