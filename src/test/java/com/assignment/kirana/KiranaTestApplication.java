package com.assignment.kirana;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
public class KiranaTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(KiranaApplication::main)
				.run(args);
	}

}
