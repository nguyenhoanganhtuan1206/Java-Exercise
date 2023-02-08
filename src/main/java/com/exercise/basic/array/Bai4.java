package com.exercise.basic.array;

import java.util.Arrays;

public class Bai4 {

    public int[] handleSortArray(final int[] arr) {
        int maxLen = 0;
        int count = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
                if (count > maxLen) {
                    maxLen = count;
                    start = i + 2 - count;
                    end = i + 2;
                }
            } else {
                count = 1;
            }
        }

        return Arrays.copyOfRange(arr, start, end);
    }
}
