package org.hzero.kms;

import org.hzero.autoconfigure.kms.EnableHZeroKms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroKms
@EnableDiscoveryClient
@SpringBootApplication
public class DemokmsApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemokmsApplication.class, args);
        }

}