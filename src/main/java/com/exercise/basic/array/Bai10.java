package com.exercise.basic.array;

public class Bai10 {

    public int[] reverseArray(final int arr[]) {
        final int newArr[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[newArr.length - i - 1] = arr[i];
        }

        return newArr;
    }
}
