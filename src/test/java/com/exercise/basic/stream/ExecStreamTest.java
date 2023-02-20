package com.exercise.basic.stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExecStreamTest {

    @Test
    void findVietnameseAddressByCommuneName() {
    }

    @Test
    void testParseVietnameseAddress() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();

        final String data = Files.readString(Paths.get("src/main/java/com/exercise/basic/stream/data.json"));
        VietnameseAddress vietnameseAddress = mapper.readValue(data, VietnameseAddress.class);

        final var execStream = new ExecStream();

        assertEquals(execStream.parseVietnameseAddress().toString(), vietnameseAddress.toString());
    }

    @Test
    void testFindCommuneByName() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> expected = execStream.findCommuneByName("Phúc");

        assertEquals(expected.toString(), execStream.findCommuneByName("Phúc").toString());
    }

    @Test
    void findDistrictByCommunes() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> communes = execStream.findCommuneByName("Phúc");
        final List<District> districts = execStream.findDistrictByCommunes(communes);

        assertEquals(districts.toString(), execStream.findDistrictByCommunes(communes).toString());
    }

    @Test
    void findProvinceByDistricts() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> communes = execStream.findCommuneByName("Phúc");
        final List<District> districts = execStream.findDistrictByCommunes(communes);
        final List<Province> provinces = execStream.findProvinceByDistricts(districts);

        assertEquals(provinces.toString(), execStream.findProvinceByDistricts(districts).toString());
    }

    @Test
    void testFindVietnameseAddressByCommuneName() throws IOException {
        final var execStream = new ExecStream();

        assertTrue(execStream.findVietnameseAddressByCommuneName("Phường Phúc Xá").contains("Phường Phúc Xá, Quận Ba Đình, Thành phố Hà Nội"));
        assertTrue(execStream.findVietnameseAddressByCommuneName("Phúc")
                .containsAll(execStream.findVietnameseAddressByCommuneName("Phúc")));

        assertFalse(execStream.findVietnameseAddressByCommuneName("Phúc")
                .contains(execStream.findVietnameseAddressByCommuneName("abc")));
    }
}
