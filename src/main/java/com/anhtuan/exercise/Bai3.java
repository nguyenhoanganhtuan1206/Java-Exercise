package com.anhtuan.exercise;

public class Bai3 {

    public String handleAnalysisNumber(final int number) {
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

        if (number < 0) {
            resultStr.insert(0, "-");
        }

        return resultStr.toString().substring(0, resultStr.length() - 2).trim();
    }
}
