package com.exercise.basic.string;

import java.util.HashSet;
import java.util.Set;

public class Bai4 {

    public boolean checkDuplicate(final String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        if (set.size() != str.length()) {
            return true;
        }
        return false;
    }
}
