package com.example.xmltojson.service;

import com.example.xmltojson.model.TransformationResult;
import com.example.xmltojson.service.CsvAsyncWriterService;
import com.example.xmltojson.service.Pain001ToMt103TranslatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransformationIntegrationTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testTransformSingle() throws Exception {
        String xml = Files.readString(Path.of("src/main/resources/sample/pain001-sample.xml"));
        webTestClient.post()
                .uri("/api/transform/single")
                .contentType(MediaType.APPLICATION_XML)
                .bodyValue(xml)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.mt103Json").isNotEmpty()
                .jsonPath("$.startTime").isNotEmpty()
                .jsonPath("$.endTime").isNotEmpty()
                .jsonPath("$.totalTimeTakenMs").isNumber();
    }

    @Test
    public void testTransformBatch() throws Exception {
        webTestClient.post()
                .uri(uriBuilder -> uriBuilder.path("/api/transform/batch").queryParam("count", 1).build())
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$[0].mt103Json").isNotEmpty()
                .jsonPath("$[0].startTime").isNotEmpty()
                .jsonPath("$[0].endTime").isNotEmpty()
                .jsonPath("$[0].totalTimeTakenMs").isNumber();
    }
}
