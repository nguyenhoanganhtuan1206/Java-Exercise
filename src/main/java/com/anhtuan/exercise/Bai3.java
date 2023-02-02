package com.anhtuan.exercise;

import java.util.LinkedList;
import java.util.List;

public class Bai3 {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String handleAnalysisNumber(int number) {
        final StringBuilder resultStr = new StringBuilder();
        final List<Number> list = new LinkedList<>();

        int numberTemp = number;

        for (int i = 0; i < numberTemp; i++) {
            while (isPrime(i) && numberTemp % i == 0) {
                numberTemp /= i;
                list.add(i);
            }
        }

        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            resultStr.append(list.get(i) + " * ");
        }

        resultStr.append(list.get(size - 1));

        return resultStr.toString();
    }
}
