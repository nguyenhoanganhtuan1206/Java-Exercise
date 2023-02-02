package com.anhtuan.exercise;

public class Bai3 {

    public static boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String handleAnalysisNumber(final int number) {
        final StringBuilder resultStr = new StringBuilder();

        int numberTemp = number;

        for (int i = 2; i < numberTemp; i++) {
            while (numberTemp % i == 0) {
                numberTemp /= i;
                resultStr.append(i + " * ");
            }
        }

        return resultStr.toString().substring(0, resultStr.length() - 2).trim();
    }
}
