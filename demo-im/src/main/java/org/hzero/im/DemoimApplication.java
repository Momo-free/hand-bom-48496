package org.hzero.im;

import org.hzero.autoconfigure.im.EnableHZeroIm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroIm
@EnableDiscoveryClient
@SpringBootApplication
public class DemoimApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoimApplication.class, args);
        }

}