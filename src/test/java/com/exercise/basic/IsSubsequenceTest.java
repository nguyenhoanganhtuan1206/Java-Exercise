package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        final var isSubsequence = new IsSubsequence();

        assertFalse(isSubsequence.isSubsequence("hna", "anhtuan"));
        assertFalse(isSubsequence.isSubsequence("at", ""));

        assertTrue(isSubsequence.isSubsequence("", "anhtuan"));
        assertTrue(isSubsequence.isSubsequence("atn", "anhtuan"));
    }
}
