package com.example.xmltojson.service;

import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StreamUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Pain001ToMt103TranslatorServiceTest {

    private Pain001ToMt103TranslatorService translatorService;
    private String sampleXml;

    @BeforeEach
    void setUp() throws Exception {
        translatorService = new Pain001ToMt103TranslatorService();
        // Load the sample XML file from test resources
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("sample/pain001-sample-1.xml")) {
            if (inputStream == null) {
                throw new IllegalStateException("Sample XML file not found in test resources");
            }
            sampleXml = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        }
    }

    @Test
    void translatePain001XmlToMt103Json_WithValidXml_ReturnsValidJson() throws Exception {
        // When
        String result = translatorService.translatePain001XmlToMt103Json(sampleXml);
        
        // Print the actual JSON for debugging
        System.out.println("Generated JSON:");
        System.out.println(result);

        // Then
        assertNotNull(result, "Result should not be null");
        assertFalse(result.isEmpty(), "Result should not be empty");
        
        // Verify some key MT103 fields in the JSON
        assertTrue(result.contains("FIToFICustomerCreditTransfer"), "Should contain MT103 root element");
        assertTrue(result.contains("MSG123456789"), "Should contain message ID from original XML");
        assertTrue(result.contains("1500.00"), "Should contain amount from original XML");
        assertTrue(result.contains("USD"), "Should contain currency from original XML");
        assertTrue(result.contains("John Doe"), "Should contain debtor name from original XML");
        assertTrue(result.contains("Jane Smith"), "Should contain creditor name from original XML");
    }

    @Test
    void translatePain001XmlToMt103Json_WithNullInput_ThrowsException() {
        assertThrows(NullPointerException.class, 
            () -> translatorService.translatePain001XmlToMt103Json(null),
            "Should throw NullPointerException for null input");
    }

    @Test
    void translatePain001XmlToMt103Json_WithEmptyInput_ThrowsException() {
        assertThrows(JAXBException.class, 
            () -> translatorService.translatePain001XmlToMt103Json(""),
            "Should throw JAXBException for empty input");
    }
}
