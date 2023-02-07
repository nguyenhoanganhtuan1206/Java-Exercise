package com.exercise.basic.SoHoc;

public class Bai3 {

    public String handleAnalysisNumber(final int number) {
        if (number < 0) {
            return "-" + handleAnalysisNumber(-number);
        }

        if (number < 2) {
            return String.valueOf(number);
        }

        final StringBuilder resultStr = new StringBuilder();

        int numberTemp = number;

        for (int i = 2; i <= numberTemp; i++) {
            while (numberTemp % i == 0) {
                numberTemp /= i;
                resultStr.append(i);
                if (numberTemp != 1) {
                    resultStr.append(" * ");
                }
            }
        }

        return resultStr.toString();
    }
}
