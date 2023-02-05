package com.exercise.basic.array;

public class Bai6 {

    public int searchBinary(final int arr[], final int value) {
        if (arr.length == 0) {
            return -1;
        }

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            final int mid = (first + last) / 2;

            if (arr[mid] == value) {
                return mid;
            }

            if (arr[mid] > value) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return -1;
    }
}
