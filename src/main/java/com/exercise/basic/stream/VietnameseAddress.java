package com.exercise.basic.stream;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class VietnameseAddress {

    private List<Commune> communes;
    private List<Province> provinces;
    private List<District> districts;
}
