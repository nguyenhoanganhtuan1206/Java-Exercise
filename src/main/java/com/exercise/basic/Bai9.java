package com.exercise.basic;

public class Bai9 {

    public String handleFormatStr(String str) {
        if (str.length() <= 1) {
            return str.toUpperCase();
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
