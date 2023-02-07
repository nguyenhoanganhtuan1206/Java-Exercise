package com.exercise.basic.string;

public class Bai4 {

    public boolean checkDuplicate(final String str) {
        int lenStr = str.length();
        for (int i = lenStr / 2; i >= 1; i--) {
            String subStr = str.substring(0, i);
            StringBuilder repeatStr = new StringBuilder();

            for (int j = 0; j < lenStr / i; j++) {
                repeatStr.append(subStr);
            }

            if (str.equals(repeatStr.toString())) {
                return true;
            }
        }

        return false;
    }
}
