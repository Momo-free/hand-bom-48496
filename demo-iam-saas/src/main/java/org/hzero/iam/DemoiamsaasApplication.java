package org.hzero.iam;

import org.hzero.autoconfigure.iam.saas.EnableHZeroIamSaas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroIamSaas
@EnableDiscoveryClient
@SpringBootApplication
public class DemoiamsaasApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoiamsaasApplication.class, args);
        }

}