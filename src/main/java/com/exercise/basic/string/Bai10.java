package com.exercise.basic.string;

public class Bai10 {

    public String handleFormatCode(final String str) {
        /* Có thể sử dụng replace all "//s+" */
        final StringBuilder strResult = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                count = 0;
            }

            if (count < 2) {
                // nhiều hơn 1 khoảng trắng
                strResult.append(str.charAt(i));
            }
        }

        return strResult.toString().trim();
    }
}
