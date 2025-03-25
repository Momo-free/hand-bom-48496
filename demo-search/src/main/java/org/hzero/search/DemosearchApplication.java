package org.hzero.search;

import org.hzero.autoconfigure.search.EnableHZeroSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroSearch
@EnableDiscoveryClient
@SpringBootApplication
public class DemosearchApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemosearchApplication.class, args);
        }

}