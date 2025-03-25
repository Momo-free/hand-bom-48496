package org.hzero.oauth;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroOauth
@EnableDiscoveryClient
@SpringBootApplication
public class DemooauthApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemooauthApplication.class, args);
        }

}