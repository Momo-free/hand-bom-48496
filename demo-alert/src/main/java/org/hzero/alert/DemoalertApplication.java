package org.hzero.alert;

import org.hzero.autoconfigure.alert.EnableHZeroAlert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroAlert
@EnableDiscoveryClient
@SpringBootApplication
public class DemoalertApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoalertApplication.class, args);
        }

}