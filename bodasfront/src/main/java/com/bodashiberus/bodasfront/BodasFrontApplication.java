package com.bodashiberus.bodasfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BodasFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodasFrontApplication.class, args);
	}

}
