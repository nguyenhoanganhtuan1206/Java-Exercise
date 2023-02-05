package com.exercise.basic.array;

public class Bai3 {

    public int sumDigits(final int number) {
        int sum = 0;

        int numberTemp = number;

        while (numberTemp > 0) {
            sum += numberTemp % 10;
            numberTemp /= 10;
        }

        return sum;
    }

    public int[] handleSortArray(final int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (sumDigits(arr[i]) > sumDigits(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
