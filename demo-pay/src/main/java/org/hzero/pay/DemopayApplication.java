package org.hzero.pay;

import org.hzero.autoconfigure.pay.EnableHZeroPay;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroPay
@EnableDiscoveryClient
@SpringBootApplication(exclude = RabbitAutoConfiguration.class)
public class DemopayApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemopayApplication.class, args);
        }

}