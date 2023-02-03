package com.exercise.basic.string;

public class Bai1 {

    public String reverseStr(final String str) {
        final StringBuilder strResult = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            strResult.append(str.charAt(i));
        }

        return strResult.toString();
    }
}
