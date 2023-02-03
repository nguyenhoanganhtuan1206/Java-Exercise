package com.exercise.basic;

public class Bai7 {

    public int[] handleInsertToArr(final int arr[], final int number) {
        final int[] newArr = new int[arr.length + 1];

        int pos = 0;

        while (pos < arr.length - 1 && arr[pos] < number) {
            newArr[pos] = arr[pos];
            pos++;
        }

        newArr[pos] = number;

        for (int i = arr.length - 1; i >= pos; i--) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
