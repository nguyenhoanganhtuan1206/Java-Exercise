package com.exercise.basic.oop.bai2;

import java.time.LocalDate;

public class Student {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final String className;
    private final String address;
    private final Gender gender;
    private final String email;
    private final String phone;

    public Student(String firstName, String lastName, LocalDate birthday, String className, String address, Gender gender, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.className = className;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Student{%s}, {%s}, {%s}, {%s}, {%s}, {%s}, {%s}, {%s}"
                , firstName, lastName, birthday, className, address, gender, email, phone);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
