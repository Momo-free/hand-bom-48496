package org.hzero.bai;

import org.hzero.autoconfigure.bai.EnableHZeroBai;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroBai
@EnableDiscoveryClient
@SpringBootApplication
public class DemobaiApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemobaiApplication.class, args);
        }

}