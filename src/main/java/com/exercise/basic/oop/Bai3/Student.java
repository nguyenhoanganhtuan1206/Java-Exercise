package com.exercise.basic.oop.Bai3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String className;
    private String address;
    private Gender gender;
    private String email;
    private String phone;
}
