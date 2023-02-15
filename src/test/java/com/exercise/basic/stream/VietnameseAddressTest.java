package com.exercise.basic.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VietnameseAddressTest {

    @Test
    void testVietnameseAddress() throws IOException {
        final ExecStream execStream = new ExecStream();

        final String communeName = "Phường Phúc Xá";

        Communes communes = execStream.getCommuneByName(communeName);
        Districts districts = execStream.getDistrictByCommune(communes);
        Provinces provinces = execStream.getProvinceByDistrict(districts);

        assertEquals("Phường Phúc Xá, Quận Ba Đình, Thành phố Hà Nội", communes.getName() + ", " + districts.getName() + ", " + provinces.getName());
    }
}
