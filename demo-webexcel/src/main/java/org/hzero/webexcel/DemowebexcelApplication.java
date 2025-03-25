package org.hzero.webexcel;

import org.hzero.autoconfigure.webexcel.EnableHZeroWebExcel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroWebExcel
@EnableDiscoveryClient
@SpringBootApplication
public class DemowebexcelApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemowebexcelApplication.class, args);
        }

}