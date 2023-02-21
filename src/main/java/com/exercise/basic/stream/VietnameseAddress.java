package com.exercise.basic.stream;

import lombok.Getter;

import java.util.List;

@Getter
public class VietnameseAddress {

    private List<Commune> communes;
    private List<Province> provinces;
    private List<District> districts;
}
