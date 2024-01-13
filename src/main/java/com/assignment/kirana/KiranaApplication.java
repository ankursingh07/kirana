package com.assignment.kirana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KiranaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiranaApplication.class, args);
	}

}
