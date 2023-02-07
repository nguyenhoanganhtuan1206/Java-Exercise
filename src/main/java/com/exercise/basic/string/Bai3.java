package com.exercise.basic.string;

public class Bai3 {

    public int sumDigits(final String str) {
        final StringBuilder strResult = new StringBuilder();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c) && c != ' ') {
                strResult.append(c);
            } else {
                // Check ở có kí tự và khoảng trắng thì cộng
                if (strResult.length() > 0) {
                    sum += Integer.parseInt(strResult.toString());
                }
                strResult.setLength(0);
            }
        }

        if (strResult.length() > 0) {
            sum += Integer.parseInt(strResult.toString());
        }

        return sum;
    }
}
