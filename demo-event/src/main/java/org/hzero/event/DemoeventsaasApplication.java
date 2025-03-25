package org.hzero.event;

import org.hzero.autoconfigure.event.EnableHZeroEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroEvent
@EnableDiscoveryClient
@SpringBootApplication
public class DemoeventsaasApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoeventsaasApplication.class, args);
        }

}