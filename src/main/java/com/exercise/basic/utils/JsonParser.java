package com.exercise.basic.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;

@UtilityClass
public class JsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T parse(final Class<T> targetClass, final String url) throws IOException {
        return objectMapper.readValue(new File(url), targetClass);
    }
}
