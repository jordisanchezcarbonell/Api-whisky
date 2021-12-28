package com.example.Api.whisky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
public class ApiWhiskyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWhiskyApplication.class, args);
	}

}
