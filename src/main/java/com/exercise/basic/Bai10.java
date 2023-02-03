package com.exercise.basic;

import java.util.Stack;

public class Bai10 {

    public String handleFormatCode(final String str) {
        /* Có thể sử dụng replace all "//s+" */

        final StringBuilder strResult = new StringBuilder();
        final Stack<Character> stack = new Stack<>();

        for (char ch : str.trim().toCharArray()) {
            if (ch == ' ' && !stack.isEmpty() && stack.peek() != ' ') {
                stack.push(' ');
            } else if (ch != ' ') {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            strResult.append(stack.pop());
        }

        return strResult.reverse().toString();
    }
}
