package com.exercise.basic.array;

import java.util.Arrays;

public class Bai4 {

    public int[] handleSortArray(final int[] arr) {
        int lenNewArr = 0;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                if (count > lenNewArr) {
                    lenNewArr = count;
                }
                count = 1;
            }
        }

        if(count > lenNewArr) {
            lenNewArr = count;
        }

        final int[] newArr = new int[lenNewArr];


        for(int i = arr.length - lenNewArr ; i < arr.length ; i++) {
            newArr[arr.length - i - 1] = arr[i];
        }


        Arrays.sort(newArr);
        return newArr;
    }
}
