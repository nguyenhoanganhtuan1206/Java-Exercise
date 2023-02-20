package com.exercise.basic.stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExecStream {

    public List<String> findVietnameseAddressByCommuneName(String communeName) throws IOException {
        final List<Commune> communes = findCommuneByName(communeName);
        final List<District> districts = findDistrictByCommunes(communes);
        final List<Province> provinces = findProvinceByDistricts(districts);

        final StringBuilder str = new StringBuilder();
        final List<String> result = new ArrayList<>();

        for (Commune commune : communes) {
            str.append(commune.getName() + ", ");

            final District district = districts.stream()
                    .filter(d -> d.getIdDistrict().equals(commune.getIdDistrict()))
                    .findFirst()
                    .orElse(null);

            str.append(district.getName() + ", ");


            final Province province = provinces.stream()
                    .filter(p -> p.getIdProvince().equals(district.getIdProvince()))
                    .findFirst()
                    .orElse(null);

            str.append(province.getName());
            result.add(str.toString());
            str.setLength(0);
        }

        return result;
    }

    public VietnameseAddress parseVietnameseAddress() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();

        final String data = Files.readString(Paths.get("src/main/java/com/exercise/basic/stream/data.json"));

        return mapper.readValue(data, VietnameseAddress.class);
    }

    public List<Commune> findCommuneByName(final String communeName) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        final List<Commune> commune = vietnameseAddress.getCommunes().stream()
                .filter(c -> c.getName().contains(communeName))
                .collect(Collectors.toList());

        return commune;
    }

    public List<District> findDistrictByCommunes(final List<Commune> communes) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        final List<District> districts = communes.stream()
                .flatMap(c -> {
                    String districtId = c.getIdDistrict();

                    return vietnameseAddress.getDistricts().stream()
                            .filter(d -> d.getIdDistrict().equals(districtId));
                })
                .collect(Collectors.toList());

        return districts;
    }

    public List<Province> findProvinceByDistricts(final List<District> districts) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        final List<Province> provinces = districts.stream()
                .flatMap(d -> {
                    String provinceId = d.getIdProvince();

                    return vietnameseAddress.getProvinces().stream()
                            .filter(p -> p.getIdProvince().equals(provinceId));
                }).collect(Collectors.toList());

        return provinces;
    }
}
