package com.exercise.basic.utils;

import com.exercise.basic.stream.Commune;
import com.exercise.basic.stream.District;
import com.exercise.basic.stream.Province;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JsonParserTest {

    final String filePath = "data.json";

    @Test
    void parse() {
        assertThrows(IOException.class, () -> {
            JsonParser.parse(Commune.class, filePath);
        });

        assertThrows(IOException.class, () -> {
            JsonParser.parse(Province.class, filePath);
        });

        assertThrows(IOException.class, () -> {
            JsonParser.parse(District.class, filePath);
        });
    }
}
