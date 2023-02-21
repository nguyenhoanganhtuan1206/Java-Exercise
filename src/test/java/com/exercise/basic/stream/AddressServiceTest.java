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
    void testFindVietnameseAddressByCommuneName() throws IOException {
        final var addressService = new AddressService();

        assertTrue(addressService.findVietnameseAddressByCommuneName("Phường Phúc Xá")
                .contains("Phường Phúc Xá, Quận Ba Đình, Thành phố Hà Nội"));
        assertTrue(addressService.findVietnameseAddressByCommuneName("Phúc")
                .containsAll(addressService.findVietnameseAddressByCommuneName("Phúc")));

        assertFalse(addressService.findVietnameseAddressByCommuneName("123")
                .contains(addressService.findVietnameseAddressByCommuneName("")));
        assertFalse(addressService.findVietnameseAddressByCommuneName("Phúc")
                .contains(addressService.findVietnameseAddressByCommuneName("abc")));
        assertFalse(addressService.findVietnameseAddressByCommuneName("Phúc")
                .contains(addressService.findVietnameseAddressByCommuneName("")));
    }
}
