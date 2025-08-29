package com.example.xmltojson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class XmlToJsonApplication {
    public static void main(String[] args) {
        SpringApplication.run(XmlToJsonApplication.class, args);
    }
}
