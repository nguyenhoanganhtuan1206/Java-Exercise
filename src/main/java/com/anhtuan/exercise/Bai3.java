package com.anhtuan.exercise;

import java.util.LinkedList;
import java.util.List;

public class Bai3 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String handleAnalysisNumber(int n) {
        final StringBuilder str = new StringBuilder();
        final List<Number> list = new LinkedList<>();

        int number = n;

        for (int i = 0; i < number; i++) {
            while (isPrime(i) && number % i == 0) {
                number /= i;
                list.add(i);
            }
        }

        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            str.append(list.get(i) + " * ");
        }

        str.append(list.get(size - 1));

        return str.toString();
    }
}
