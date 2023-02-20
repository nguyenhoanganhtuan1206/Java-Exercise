package com.exercise.basic.stream;

import com.exercise.basic.utils.ParseDataUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExecStream {

    public List<String> findVietnameseAddressByCommuneName(final String communeName) throws IOException {
        final List<Commune> communes = findCommunesByName(communeName);
        final List<District> districts = findDistrictsByCommunes(communes);
        final List<Province> provinces = findProvincesByDistricts(districts);

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
        return ParseDataUtils.parseData(VietnameseAddress.class, "src/main/java/com/exercise/basic/stream/data.json");
    }

    public List<Commune> findCommunesByName(final String communeName) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        return vietnameseAddress.getCommunes().stream()
                .filter(c -> c.getName().contains(communeName))
                .collect(Collectors.toList());
    }

    public List<District> findDistrictsByCommunes(final List<Commune> communes) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        return communes.stream()
                .flatMap(c -> {
                    String districtId = c.getIdDistrict();

                    return vietnameseAddress.getDistricts().stream()
                            .filter(d -> d.getIdDistrict().equals(districtId));
                }).collect(Collectors.toList());
    }

    public List<Province> findProvincesByDistricts(final List<District> districts) throws IOException {
        final VietnameseAddress vietnameseAddress = parseVietnameseAddress();

        return districts.stream()
                .flatMap(d -> {
                    String provinceId = d.getIdProvince();

                    return vietnameseAddress.getProvinces().stream()
                            .filter(p -> p.getIdProvince().equals(provinceId));
                }).collect(Collectors.toList());
    }
}
