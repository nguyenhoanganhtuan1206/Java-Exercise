package com.exercise.basic.stream;

import com.exercise.basic.utils.JsonParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressService {

    final String filePath = "src/main/resources/data.json";
    private final VietnameseAddress address;

    public AddressService() throws IOException {
        address = JsonParser.parse(VietnameseAddress.class, filePath);
    }

    public List<String> findVietnameseAddressByCommuneName(final String communeName) throws IOException {
        final List<Commune> communes = findCommunesByName(communeName);
        final List<District> districts = findDistrictsByCommunes(communes);
        final List<Province> provinces = findProvincesByDistricts(districts);

        final List<String> result = new ArrayList<>();

        communes.stream()
                .forEach(c -> {
                    String districtId = c.getIdDistrict();

                    final District district = districts.stream()
                            .filter(d -> d.getIdDistrict().equals(districtId))
                            .findFirst().orElse(null);

                    final Province province = provinces.stream()
                            .filter(p -> p.getIdProvince().equals(district.getIdProvince()))
                            .findFirst().orElse(null);

                    if (district != null && province != null) {
                        final String resultStr = String.format("%s, %s, %s", c.getName(), district.getName(), province.getName());
                        result.add(resultStr);
                    }
                });

        return result;

    }

    public List<Commune> findCommunesByName(final String communeName) {
        return address.getCommunes().stream()
                .filter(c -> c.getName().contains(communeName))
                .collect(Collectors.toList());
    }

    public List<District> findDistrictsByCommunes(final List<Commune> communes) throws IOException {
        final VietnameseAddress vietnameseAddress = address;

        return communes.stream()
                .flatMap(d -> {
                    String districtId = d.getIdDistrict();

                    return vietnameseAddress.getDistricts().stream()
                            .filter(p -> p.getIdDistrict().equals(districtId));
                }).collect(Collectors.toList());
    }

    public List<Province> findProvincesByDistricts(final List<District> districts) throws IOException {
        final VietnameseAddress vietnameseAddress = address;

        return districts.stream()
                .flatMap(d -> {
                    String provinceId = d.getIdProvince();

                    return vietnameseAddress.getProvinces().stream()
                            .filter(p -> p.getIdProvince().equals(provinceId));
                }).collect(Collectors.toList());
    }
}
