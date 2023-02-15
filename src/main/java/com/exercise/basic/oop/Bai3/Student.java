package com.exercise.basic.oop.Bai3;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Student {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final String className;
    private final String address;
    private final Gender gender;
    private final String email;
    private final String phone;
}
