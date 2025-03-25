package org.hzero.ocr;

import org.hzero.autoconfigure.ocr.EnableHZeroOcr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroOcr
@EnableDiscoveryClient
@SpringBootApplication
public class DemoocrApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoocrApplication.class, args);
        }

}