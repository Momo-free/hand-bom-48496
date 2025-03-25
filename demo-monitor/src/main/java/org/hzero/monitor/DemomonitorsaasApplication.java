package org.hzero.monitor;

import org.hzero.autoconfigure.monitor.EnableHZeroMonitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroMonitor
@EnableDiscoveryClient
@SpringBootApplication
public class DemomonitorsaasApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemomonitorsaasApplication.class, args);
        }

}