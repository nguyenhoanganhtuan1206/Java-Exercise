package com.exercise.basic.oop.bai2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void testStudent() {
        StudentBuilder studentBuilder = new StudentConcreteBuilder()
                .setFirstName("Nguyen Hoang")
                .setLastName("Anh Tuan")
                .setAddress("Da Nang")
                .setClassName("ABC")
                .setEmail("nguyenhanhtuan@gmail.com")
                .setBirthDay(LocalDate.of(2001, 06, 12))
                .setPhone("090xxxxx")
                .setGender(Gender.MALE);

        assertEquals("Nguyen Hoang", studentBuilder.build().getFirstName());
        assertEquals("Anh Tuan", studentBuilder.build().getLastName());
        assertEquals("ABC", studentBuilder.build().getClassName());
        assertEquals("nguyenhanhtuan@gmail.com", studentBuilder.build().getEmail());
        assertEquals(LocalDate.of(2001, 06, 12), studentBuilder.build().getBirthDay());
        assertEquals("Da Nang", studentBuilder.build().getAddress());
        assertEquals("090xxxxx", studentBuilder.build().getPhone());
        assertEquals(Gender.MALE, studentBuilder.build().getGender());
    }
}
