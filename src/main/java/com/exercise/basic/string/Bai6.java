package com.exercise.basic.string;

import java.security.InvalidAlgorithmParameterException;

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

    public int generatorLastNumBarcode(final String str) throws Exception {
        if (str.length() < 12) {
            throw new InvalidAlgorithmParameterException("Barcode must be larger than 12 length");
        }

        for (int i = 0; i < 10; i++) {
            if (isBarcode(str.concat(i + ""))) {
                return i;
            }
        }

        return -1;
    }
}
