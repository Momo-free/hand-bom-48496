package org.hzero.nlp;

import org.hzero.autoconfigure.nlp.EnableHZeroNlp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroNlp
@EnableDiscoveryClient
@SpringBootApplication
public class DemonlpsaasApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemonlpsaasApplication.class, args);
        }

}