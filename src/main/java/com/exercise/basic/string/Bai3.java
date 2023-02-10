package com.exercise.basic.string;

public class Bai3 {

    public int sumDigits(final String str) {
        int number = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                // nhân 10 lên hàng chục or trăm
                number = number * 10 + (c - '0');
            } else {
                // Check if there are characters and spaces, then add the sum to the previous sum
                sum += number;
                number = 0;
            }
        }

        return sum + number;
    }
}
