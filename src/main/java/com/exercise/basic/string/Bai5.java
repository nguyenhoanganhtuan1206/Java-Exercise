package com.exercise.basic.string;

public class Bai5 {

    public boolean checkIsBarcode(final String str) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sumEven += str.charAt(i);
            } else {
                sumOdd += str.charAt(i);
            }
        }

        return (sumEven + 3 * sumOdd) % 10 == 0;
    }
}
