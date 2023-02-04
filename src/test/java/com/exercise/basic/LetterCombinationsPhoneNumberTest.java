package com.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsPhoneNumberTest {

    @Test
    void handleLetterCombinations() {
        final var letterCombination = new LetterCombinationsPhoneNumber();

        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", letterCombination.handleLetterCombinations("23").toString());
        assertEquals("[a, b, c]", letterCombination.handleLetterCombinations("2").toString());
    }
}
