package com.exercise.basic.oop.Bai3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void testStudent() {
        final var student1 = Student.builder()
                .firstName("Nguyen Hoang")
                .lastName("Anh Tuan")
                .address("Da Nang")
                .birthday(LocalDate.of(2001, 06, 12))
                .email("nguyenhanhtuan@gmail.com")
                .gender(Gender.MALE)
                .className("ABC")
                .phone("090xxxxx");


        assertEquals("Nguyen Hoang", student1.build().getFirstName());
        assertEquals("Anh Tuan", student1.build().getLastName());
        assertEquals("ABC", student1.build().getClassName());
        assertEquals("nguyenhanhtuan@gmail.com", student1.build().getEmail());
        assertEquals(LocalDate.of(2001, 06, 12), student1.build().getBirthday());
        assertEquals("Da Nang", student1.build().getAddress());
        assertEquals("090xxxxx", student1.build().getPhone());
        assertEquals(Gender.MALE, student1.build().getGender());
    }
}
