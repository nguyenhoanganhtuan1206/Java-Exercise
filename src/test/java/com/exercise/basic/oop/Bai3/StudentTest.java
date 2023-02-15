package com.exercise.basic.oop.Bai3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void testStudent() {
        final var student = Student.builder()
                .firstName("Nguyen Hoang")
                .lastName("Anh Tuan")
                .address("Da Nang")
                .birthday(LocalDate.of(2001, 06, 12))
                .email("nguyenhanhtuan@gmail.com")
                .gender(Gender.MALE)
                .className("ABC")
                .phone("090xxxxx")
                .build();


        assertEquals("Nguyen Hoang", student.getFirstName());
        assertEquals("Anh Tuan", student.getLastName());
        assertEquals("ABC", student.getClassName());
        assertEquals("nguyenhanhtuan@gmail.com", student.getEmail());
        assertEquals(LocalDate.of(2001, 06, 12), student.getBirthday());
        assertEquals("Da Nang", student.getAddress());
        assertEquals("090xxxxx", student.getPhone());
        assertEquals(Gender.MALE, student.getGender());
    }
}
