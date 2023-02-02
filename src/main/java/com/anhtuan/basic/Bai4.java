package com.anhtuan.basic;

import java.util.Arrays;

public class Bai4 {

    public int[] handleSortArray(final int arr[]) {
        Arrays.sort(arr);

        final int newArr[] = new int[arr.length - 1];
        int lenNewArr = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                newArr[lenNewArr++] = arr[i];
            }
        }

        // Insert the last element
        newArr[lenNewArr++] = arr[arr.length - 1];

        return newArr;
    }
}
