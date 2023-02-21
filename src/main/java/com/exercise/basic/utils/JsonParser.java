package com.exercise.basic.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class JsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T parse(final Class<T> targetClass, final String fileName) throws IOException {
        ClassLoader classLoader = targetClass.getClassLoader();
        InputStream file = classLoader.getResourceAsStream(fileName);

        return objectMapper.readValue(file, targetClass);
    }
}
