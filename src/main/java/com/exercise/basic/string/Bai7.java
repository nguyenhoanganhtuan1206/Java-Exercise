package com.exercise.basic.string;

public class Bai7 {

    public boolean findSubstring(final String str1, final String str2) {
        if (str2.trim().length() == 0 || str1.trim().length() == 0) {
            return false;
        }

        final String strLarge = str1.length() > str2.length() ? str1 : str2;
        final String strSmaller = str1.length() < str2.length() ? str1 : str2;
        final int largeLength = str1.length() > str2.length() ? str1.length() : str2.length();
        final int smallerLength = str1.length() < str2.length() ? str1.length() : str2.length();

        for (int i = 0; i <= largeLength - smallerLength; i++) {
            int j;
            // j used to check length with str2Len
            for (j = 0; j < smallerLength; j++) {
                if (strLarge.charAt(i + j) != strSmaller.charAt(j)) {
                    break;
                }
            }

            if (j == smallerLength) {
                return true;
            }
        }

        return false;
    }
}
