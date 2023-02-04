package com.exercise.basic.string;

public class Bai8 {

    public boolean handleCheckStr(final String str) {
        int countOpenBracket = 0;
        int countCloseBracket = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                countOpenBracket++;
            } else if (str.charAt(i) == ')') {
                countCloseBracket++;
            } else {
                // Check other characters
                return false;
            }
        }

        if (countCloseBracket == countOpenBracket) {
            return true;
        }

        return false;
    }
}
