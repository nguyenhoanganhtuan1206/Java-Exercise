package com.exercise.basic;

public class Bai10 {

    public int[] reverseArray(int arr[]) {
        final int newArr[] = new int[arr.length];
        int lenNewArr = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[lenNewArr++] = arr[i];
        }

        return newArr;
    }
}
