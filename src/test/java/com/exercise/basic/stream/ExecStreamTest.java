package com.exercise.basic.stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExecStreamTest {

    @Test
    void getCommuneByName() throws IOException {
        final var execStream = new ExecStream();

        assertEquals(execStream.getCommuneByName("Phường Phúc Xá").toString(),
                execStream.getCommuneByName("Phường Phúc Xá").toString());

        assertEquals(execStream.getCommuneByName("Phường Quyết Thắng").toString(),
                execStream.getCommuneByName("Phường Quyết Thắng").toString());
    }

    @Test
    void getDistrictById() throws IOException {
        final var execStream = new ExecStream();

        final Communes communes = execStream.getCommuneByName("Phường Phúc Xá");

        assertEquals(execStream.getDistrictByCommune(communes).toString(),
                execStream.getDistrictByCommune(communes).toString());
    }

    @Test
    void getProvinceById() throws IOException {
        final var execStream = new ExecStream();

        final Communes communes = execStream.getCommuneByName("Phường Phúc Xá");
        final Districts districts = execStream.getDistrictByCommune(communes);

        assertEquals(execStream.getProvinceByDistrict(districts).toString(),
                execStream.getProvinceByDistrict(districts).toString());
    }

    @Test
    void getVietnameseAddress() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();

        final String data = Files.readString(Paths.get("D:\\ThucTap\\JavaExercise\\src\\main\\java\\com\\exercise\\basic\\stream\\data.json"));
        VietnameseAddress vietnameseAddress = mapper.readValue(data, VietnameseAddress.class);

        final var execStream = new ExecStream();

        assertEquals(execStream.getVietnameseAddress().toString() , vietnameseAddress.toString());
    }
}
