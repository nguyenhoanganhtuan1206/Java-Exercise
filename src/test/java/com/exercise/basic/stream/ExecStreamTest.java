package com.exercise.basic.stream;

import com.exercise.basic.utils.ParseDataUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExecStreamTest {

    @Test
    void testParseVietnameseAddress() throws IOException {
        final VietnameseAddress vietnameseAddress = ParseDataUtils.parseData(VietnameseAddress.class, "src/main/java/com/exercise/basic/stream/data.json");

        final var execStream = new ExecStream();

        assertEquals(execStream.parseVietnameseAddress().toString(), vietnameseAddress.toString());
    }

    @Test
    void testFindCommuneByName() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> expected = execStream.findCommunesByName("Phúc");

        assertEquals(expected.toString(), execStream.findCommunesByName("Phúc").toString());
    }

    @Test
    void findDistrictByCommunes() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> communes = execStream.findCommunesByName("Phúc");
        final List<District> districts = execStream.findDistrictsByCommunes(communes);

        assertEquals(districts.toString(), execStream.findDistrictsByCommunes(communes).toString());
    }

    @Test
    void findProvinceByDistricts() throws IOException {
        final var execStream = new ExecStream();

        final List<Commune> communes = execStream.findCommunesByName("Phúc");
        final List<District> districts = execStream.findDistrictsByCommunes(communes);
        final List<Province> provinces = execStream.findProvincesByDistricts(districts);

        assertEquals(provinces.toString(), execStream.findProvincesByDistricts(districts).toString());
    }

    @Test
    void testFindVietnameseAddressByCommuneName() throws IOException {
        final var execStream = new ExecStream();

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
