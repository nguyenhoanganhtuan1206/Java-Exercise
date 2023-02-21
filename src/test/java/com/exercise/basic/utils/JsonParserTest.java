package com.exercise.basic.utils;

import com.exercise.basic.stream.District;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JsonParserTest {

    final String filePath = "src/main/resources/data.json";

    @Test
    void parse() {
        assertThrows(IOException.class, () -> {
            JsonParser.parse(District.class, filePath);
        });
    }
}
