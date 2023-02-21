package com.exercise.basic.stream;

import com.exercise.basic.utils.JsonParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressService {

    final String filePath = "data.json";
    private final VietnameseAddress address;

    public AddressService() throws IOException {
        address = JsonParser.parse(VietnameseAddress.class, filePath);
    }

    public List<String> findVietnameseAddressByCommuneName(final String communeName) {
        final List<Commune> communes = findCommunesByName(communeName);
        final List<String> result = new ArrayList<>();

        communes.stream()
                .forEach(c -> {
                    String districtId = c.getIdDistrict();

                    District district = address.getDistricts().stream()
                            .filter(d -> d.getIdDistrict().equals(districtId))
                            .findFirst().orElse(null);

                    Province province = address.getProvinces().stream()
                            .filter(p -> {
                                assert district != null;
                                return p.getIdProvince().equals(district.getIdProvince());
                            })
                            .findFirst().orElse(null);

                    if (district != null && province != null) {
                        final String resultStr = String
                                .format("%s, %s, %s", c.getName(), district.getName(), province.getName());

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
}
