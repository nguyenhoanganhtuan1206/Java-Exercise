package com.exercise.basic.string;

public class Bai6 {

    public int generatorLastBarcode(final String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sum += str.charAt(i) - '0';
            } else {
                sum += 3* (str.charAt(i) - '0');
            }
        }

        return 10 - (sum % 10);
    }
}
