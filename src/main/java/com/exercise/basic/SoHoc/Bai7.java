package com.exercise.basic.SoHoc;

public class Bai7 {

    public int getSum(final int number, final int pow) {
        int numberTemp = number;
        int sum = 0;

        while (numberTemp != 0) {
            int digit = numberTemp % 10;
            int poweredDigit = 1;

            // pow = 5 -> i->5
            for (int i = 0; i < pow; i++) {
                poweredDigit *= digit;
            }
            sum += poweredDigit;
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
