package com.exercise.basic.stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExecStream {

    public VietnameseAddress getVietnameseAddress() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();

        final String data = Files.readString(Paths.get("D:\\ThucTap\\JavaExercise\\src\\main\\java\\com\\exercise\\basic\\stream\\data.json"));
        VietnameseAddress vietnameseAddress = mapper.readValue(data, VietnameseAddress.class);

        return vietnameseAddress;
    }

    public Communes getCommuneByName(String communeName) throws IOException {
        final VietnameseAddress vietnameseAddress = getVietnameseAddress();

        Communes commune = vietnameseAddress.getCommunes().stream()
                .filter(c -> c.getName().equals(communeName))
                .findFirst()
                .orElse(null);

        return commune;
    }

    public Districts getDistrictByCommune(Communes communes) throws IOException {
        final VietnameseAddress vietnameseAddress = getVietnameseAddress();

        Districts district = vietnameseAddress.getDistricts().stream()
                .filter(d -> d.getIdDistrict().equals(communes.getIdDistrict()))
                .findFirst()
                .orElse(null);

        return district;
    }

    public Provinces getProvinceByDistrict(Districts districts) throws IOException {
        final VietnameseAddress vietnameseAddress = getVietnameseAddress();

        Provinces provinces = vietnameseAddress.getProvinces().stream()
                .filter(p -> p.getIdProvince().equals(districts.getIdProvince()))
                .findFirst()
                .orElse(null);

        return provinces;
    }
}
