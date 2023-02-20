package com.exercise.basic;

public class IsSubsequence {

    public boolean isSubsequence(final String str1, final String str2) {
        if (str1.length() == 0) {
            return true;
        }

        if (str2.length() == 0) {
            return false;
        }

        int j = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }

            if (j == str1.length()) {
                return true;
            }
        }

        return false;
    }
}
