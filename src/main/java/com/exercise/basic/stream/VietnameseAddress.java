package com.exercise.basic.stream;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class VietnameseAddress {

    private List<Communes> communes;
    private List<Provinces> provinces;
    private List<Districts> districts;
}
