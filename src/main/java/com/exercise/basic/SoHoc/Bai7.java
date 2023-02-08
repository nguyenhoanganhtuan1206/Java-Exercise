package com.exercise.basic.SoHoc;

public class Bai7 {

    public int calculatePow(final int digit, final int pow) {
        int poweredDigit = 1;
        for (int i = 0; i < pow; i++) {
            poweredDigit *= digit;
        }

        return poweredDigit;
    }

    public int getSum(final int number, final int pow) {
        int numberTemp = number;
        int sum = 0;

        while (numberTemp != 0) {
            int digit = numberTemp % 10;

            sum += calculatePow(digit, pow);
            numberTemp /= 10;
        }


        return sum;
    }

    public boolean checkSum(final int n) {
        for (int j = 2; j <= 5; j++) {
            if (getSum(n, j) == n) {
                return true;
            }
        }

        return false;
    }
}
