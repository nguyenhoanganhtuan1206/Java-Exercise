package com.exercise.basic.string;

public class Bai8 {

    public boolean handleCheckStr(final String str) {
        // COV down
        int countLen = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                countLen++;
            } else if (str.charAt(i) == ')') {
                countLen--;
            } else {
                // Check other characters
                return false;
            }
        }

        if (countLen == 0) {
            return true;
        }

        return false;
    }
}
