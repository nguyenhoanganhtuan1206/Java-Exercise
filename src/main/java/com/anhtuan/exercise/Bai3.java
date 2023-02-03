package com.anhtuan.exercise;

public class Bai3 {

    public String handleAnalysisNumber(final int number) {
        if (number < 0) {
            return "-" + handleAnalysisNumber(-number);
        }

        final StringBuilder resultStr = new StringBuilder();

        if (number == -2 || number == -1 || number == 0) {
            return String.valueOf(number);
        }

        int numberTemp = Math.abs(number);

        for (int i = 2; i <= numberTemp; i++) {
            while (numberTemp % i == 0) {
                numberTemp /= i;
                resultStr.append(i + " * ");
            }
        }

        return resultStr.toString().substring(0, resultStr.length() - 2).trim();
    }
}
