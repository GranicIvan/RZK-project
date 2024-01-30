package com.ig.rzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class KolaListingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KolaListingServiceApplication.class, args);
	}

}
