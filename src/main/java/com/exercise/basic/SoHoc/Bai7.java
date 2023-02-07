package com.exercise.basic.SoHoc;

public class Bai7 {

    public int getSum(final int n, final int pow) {
        final String numberStr = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            int numberTemp = Integer.parseInt(numberStr.charAt(i) + "");
            sum += Math.pow(numberTemp, pow);
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
