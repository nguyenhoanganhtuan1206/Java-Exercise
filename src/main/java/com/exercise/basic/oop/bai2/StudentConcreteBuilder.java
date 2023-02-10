package com.exercise.basic.oop.bai2;

import java.time.LocalDate;

public class StudentConcreteBuilder implements StudentBuilder {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String className;
    private String address;
    private Gender gender;
    private String email;
    private String phone;

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public com.exercise.basic.oop.bai2.Student build() {
        return new com.exercise.basic.oop.bai2.Student(firstName, lastName, birthDay, className, address, gender, email, phone);
    }
}
