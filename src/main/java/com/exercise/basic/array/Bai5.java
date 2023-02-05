package com.exercise.basic.array;

public class Bai5 {

    public int subtractNumber(final int[] arr) {
        if(arr.length == 1) {
            return arr[arr.length - 1];
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int item : arr) {
            max = Math.max(max, item);
            min = Math.min(min, item);
        }

        return max - min;
    }
}
