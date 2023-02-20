package com.exercise.basic.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseDataUtils {

    public static <T> T parseData(final Class<T> targetClass, final String url) throws IOException {
        final var objectMapper = new ObjectMapper();

        return objectMapper.readValue(new File(url), targetClass);
    }
}
