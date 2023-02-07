package com.exercise.basic.SoHoc;

public class Bai7 {

    public boolean checkSum(int n) {
        final String numberStr = String.valueOf(n);

        for (int j = 2; j <= 5; j++) {
            int sum = 0;
            for (int i = 0; i < numberStr.length(); i++) {
                int numberTemp = Integer.parseInt(numberStr.charAt(i) + "");
                sum += Math.pow(numberTemp, j);
            }
            if (sum == n) {
                return true;
            }
        }

        return false;
    }
}
