package com.exercise.basic.oop.Bai3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        final var student1 = Student.builder()
                .firstName("Nguyen Hoang")
                .lastName("Anh Tuan")
                .address("Da Nang")
                .birthday(LocalDate.of(2001, 06, 12))
                .email("nguyenhanhtuan@gmail.com")
                .gender(Gender.MALE)
                .className("ABC")
                .phone("090xxxxx");

        System.out.println(student1.build());
    }
}
