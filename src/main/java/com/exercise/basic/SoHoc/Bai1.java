package com.exercise.basic.SoHoc;

public class Bai1 {

    public int findMaxNumber(final int []arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
