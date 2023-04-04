package com.micro.demo.MicroServicesTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesTestApplication.class, args);
	}

}
