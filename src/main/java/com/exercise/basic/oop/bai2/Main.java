package com.exercise.basic.oop.bai2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        com.exercise.basic.oop.bai2.StudentBuilder studentBuilder = new com.exercise.basic.oop.bai2.StudentConcreteBuilder()
                .setFirstName("Nguyen Hoang")
                .setLastName("Anh Tuan")
                .setAddress("Da Nang")
                .setClassName("ABC")
                .setEmail("nguyenhanhtuan@gmail.com")
                .setBirthDay(LocalDate.now())
                .setPhone("090xxxxx")
                .setGender(Gender.MALE);

        System.out.println(studentBuilder.build());
    }
}
