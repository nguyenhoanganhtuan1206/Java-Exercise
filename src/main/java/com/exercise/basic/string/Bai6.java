package com.exercise.basic.string;

public class Bai6 {

    public boolean isBarcode(final String str) {
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

    public int generatorLastNumBarcode(final String str) {
        int lastNumber = 0;

        for (int i = '0'; i <= '9'; i++) {
            if (isBarcode(str + i)) {
                lastNumber = i - '0';
            }
        }

        return lastNumber;
    }
}
