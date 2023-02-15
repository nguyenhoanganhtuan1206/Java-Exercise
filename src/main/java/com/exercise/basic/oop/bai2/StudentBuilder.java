package com.exercise.basic.oop.bai2;

import java.time.LocalDate;

public interface StudentBuilder {

    StudentBuilder setFirstName(String firstName);

    StudentBuilder setLastName(String lastName);

    StudentBuilder setGender(Gender lastName);

    StudentBuilder setEmail(String email);

    StudentBuilder setBirthDay(LocalDate birthDay);

    StudentBuilder setClassName(String className);

    StudentBuilder setAddress(String address);

    StudentBuilder setPhone(String phone);

    Student build();
}
