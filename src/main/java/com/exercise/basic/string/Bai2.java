package com.exercise.basic.string;

public class Bai2 {

    public boolean checkSymmetrical(final String str) {
        if (str.length() == 0) {
            return false;
        }

        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
