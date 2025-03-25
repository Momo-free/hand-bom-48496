package org.hzero.invoice;

import org.hzero.autoconfigure.invoice.EnableHZeroInvoice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroInvoice
@EnableDiscoveryClient
@SpringBootApplication
public class DemoinvoiceApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(DemoinvoiceApplication.class, args);
        }

}