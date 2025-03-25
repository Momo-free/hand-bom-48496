package org.hzero.rule.engine;

import org.hzero.autoconfigure.rule.engine.EnableHZeroRuleEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroRuleEngine
@EnableDiscoveryClient
@SpringBootApplication
public class DemoruleengineApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoruleengineApplication.class, args);
        }

}