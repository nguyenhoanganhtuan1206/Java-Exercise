package com.exercise.basic.string;

public class Bai7 {

    public int findSubstring(final String str1, final String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (isSubstring(str1, str2, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isSubstring(final String str1, final String str2, final int pos) {
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(pos + i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
