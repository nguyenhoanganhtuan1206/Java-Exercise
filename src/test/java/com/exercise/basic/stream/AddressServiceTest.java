package com.exercise.basic.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {

    @Test
    void testFindCommuneByName() throws IOException {
        final var addressService = new AddressService();

        final List<Commune> expected = addressService.findCommunesByName("Phúc");

        assertEquals(expected.toString(), addressService.findCommunesByName("Phúc").toString());
    }

    @Test
    void findDistrictByCommunes() throws IOException {
        final var addressService = new AddressService();

        final List<Commune> communes = addressService.findCommunesByName("Phúc");
        final List<District> districts = addressService.findDistrictsByCommunes(communes);

        assertEquals(districts.toString(), addressService.findDistrictsByCommunes(communes).toString());
    }

    @Test
    void findProvinceByDistricts() throws IOException {
        final var addressService = new AddressService();

        final List<Commune> communes = addressService.findCommunesByName("Phúc");
        final List<District> districts = addressService.findDistrictsByCommunes(communes);
        final List<Province> provinces = addressService.findProvincesByDistricts(districts);

        assertEquals(provinces.toString(), addressService.findProvincesByDistricts(districts).toString());
    }

    @Test
    void testFindVietnameseAddressByCommuneName() throws IOException {
        final var execStream = new AddressService();

        assertTrue(execStream.findVietnameseAddressByCommuneName("Phường Phúc Xá")
                .contains("Phường Phúc Xá, Quận Ba Đình, Thành phố Hà Nội"));
        assertTrue(execStream.findVietnameseAddressByCommuneName("Phúc")
                .containsAll(execStream.findVietnameseAddressByCommuneName("Phúc")));

        assertFalse(execStream.findVietnameseAddressByCommuneName("123")
                .contains(execStream.findVietnameseAddressByCommuneName("")));
        assertFalse(execStream.findVietnameseAddressByCommuneName("Phúc")
                .contains(execStream.findVietnameseAddressByCommuneName("abc")));
        assertFalse(execStream.findVietnameseAddressByCommuneName("Phúc")
                .contains(execStream.findVietnameseAddressByCommuneName("")));
    }
}
