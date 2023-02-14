package com.exercise.basic.oop.bai2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    final StudentBuilder studentBuilder = new StudentConcreteBuilder()
            .setFirstName("Nguyen Hoang")
            .setLastName("Anh Tuan")
            .setAddress("Da Nang")
            .setClassName("ABC")
            .setEmail("nguyenhanhtuan@gmail.com")
            .setBirthDay(LocalDate.of(2001, 06, 12))
            .setPhone("090xxxxx")
            .setGender(Gender.MALE);

    @Test
    void testStudent() {
        assertEquals("Nguyen Hoang", studentBuilder.build().getFirstName());
        assertEquals("Anh Tuan", studentBuilder.build().getLastName());
        assertEquals("ABC", studentBuilder.build().getClassName());
        assertEquals("nguyenhanhtuan@gmail.com", studentBuilder.build().getEmail());
        assertEquals(LocalDate.of(2001, 06, 12), studentBuilder.build().getBirthDay());
        assertEquals("Da Nang", studentBuilder.build().getAddress());
        assertEquals("090xxxxx", studentBuilder.build().getPhone());
        assertEquals(Gender.MALE, studentBuilder.build().getGender());
    }

    @Test
    void testToString() {
        assertEquals(studentBuilder.build().toString(), "Student{" +
                "firstName='" + studentBuilder.build().getFirstName() + '\'' +
                ", lastName='" + studentBuilder.build().getLastName() + '\'' +
                ", birthDay=" + studentBuilder.build().getBirthDay() +
                ", className='" + studentBuilder.build().getClassName() + '\'' +
                ", address='" + studentBuilder.build().getAddress() + '\'' +
                ", gender=" + studentBuilder.build().getGender() +
                ", email='" + studentBuilder.build().getEmail() + '\'' +
                ", phone='" + studentBuilder.build().getPhone() + '\'' +
                '}');
    }

    @Test
    void getFirstName() {
        assertEquals("Nguyen Hoang", studentBuilder.build().getFirstName());
    }

    @Test
    void setFirstName() {
        studentBuilder.setFirstName("Tuan");
        assertEquals("Tuan", studentBuilder.build().getFirstName());

    }

    @Test
    void getLastName() {
        assertEquals("Anh Tuan", studentBuilder.build().getLastName());
    }

    @Test
    void setLastName() {
        studentBuilder.setLastName("Tuan");
        assertEquals("Tuan", studentBuilder.build().getLastName());
    }

    @Test
    void getBirthDay() {
        assertEquals(LocalDate.of(2001, 06, 12), studentBuilder.build().getBirthDay());
    }

    @Test
    void setBirthDay() {
        studentBuilder.setBirthDay(LocalDate.of(2001, 05, 12));
        assertEquals(LocalDate.of(2001, 05, 12), studentBuilder.build().getBirthDay());
    }

    @Test
    void getClassName() {
        assertEquals("ABC", studentBuilder.build().getClassName());
    }

    @Test
    void setClassName() {
        studentBuilder.setClassName("ABCD");
        assertEquals("ABCD", studentBuilder.build().getClassName());
    }

    @Test
    void getAddress() {
        assertEquals("Da Nang", studentBuilder.build().getAddress());
    }

    @Test
    void setAddress() {
        studentBuilder.setAddress("Da Nang");
        assertEquals("Da Nang", studentBuilder.build().getAddress());
    }

    @Test
    void getGender() {
        assertEquals(Gender.MALE, studentBuilder.build().getGender());
    }

    @Test
    void setGender() {
        studentBuilder.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, studentBuilder.build().getGender());
    }

    @Test
    void getEmail() {
        assertEquals("nguyenhanhtuan@gmail.com", studentBuilder.build().getEmail());
    }

    @Test
    void setEmail() {
        studentBuilder.setEmail("nguyenhanhtuan123@gmail.com");
        assertEquals("nguyenhanhtuan123@gmail.com", studentBuilder.build().getEmail());
    }

    @Test
    void getPhone() {
        assertEquals("090xxxxx", studentBuilder.build().getPhone());
    }

    @Test
    void setPhone() {
        studentBuilder.setPhone("09033213");
        assertEquals("09033213", studentBuilder.build().getPhone());
    }
}
