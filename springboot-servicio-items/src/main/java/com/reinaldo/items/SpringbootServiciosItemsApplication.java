package com.reinaldo.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServiciosItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiciosItemsApplication.class, args);
	}

}
