package com.exercise.basic.string;

public class Bai9 {

    public String handleFormatStr(final String str) {
        final StringBuilder strFormatted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                strFormatted.append(Character.toUpperCase(str.charAt(i)));
            } else {
                strFormatted.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        return strFormatted.toString();
    }
}
