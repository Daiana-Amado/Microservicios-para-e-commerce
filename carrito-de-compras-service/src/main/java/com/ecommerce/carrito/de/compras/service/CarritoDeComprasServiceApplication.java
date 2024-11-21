package com.ecommerce.carrito.de.compras.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarritoDeComprasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoDeComprasServiceApplication.class, args);
	}

}
