package com.exercise.basic.string;

public class Bai7 {

    public boolean findSubstring(final String str1, final String str2) {
        if (str2.trim().length() == 0 || str1.trim().length() == 0) {
            return false;
        }

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (isSubstring(str1, str2, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubstring(final String str1, final String str2, final int pos) {
        int str2Len = str2.length();
        for (int j = 0; j < str2Len; j++) {
            if (str1.charAt(pos + j) != str2.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
