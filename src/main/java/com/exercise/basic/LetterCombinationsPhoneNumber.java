package com.exercise.basic;

import java.util.*;

public class LetterCombinationsPhoneNumber {

    public List<String> handleLetterCombinations(final String str) {
        final Map<Character, String> lettersMap = new HashMap<>();
        final Queue<String> queue = new LinkedList<>();
        queue.add(" ");

        lettersMap.put('2', "abc");
        lettersMap.put('3', "def");
        lettersMap.put('4', "ghi");
        lettersMap.put('5', "jkl");
        lettersMap.put('6', "mno");
        lettersMap.put('7', "pqrs");
        lettersMap.put('8', "tuv");
        lettersMap.put('9', "wvyz");

        for (char ch : str.toCharArray()) {
            // abc
            String strFromMap = lettersMap.get(ch);

            // Avoid infinite loop
            int sizeQueue = queue.size();
            for (int i = 0; i < sizeQueue; i++) {
                String strFirst = queue.poll();

                for (int j = 0; j < strFromMap.length(); j++) {
                    String strTemp = strFirst.concat(strFromMap.charAt(j) + "").trim();
                    queue.add(strTemp);
                }
            }
        }

        return (List) queue;
    }
}
