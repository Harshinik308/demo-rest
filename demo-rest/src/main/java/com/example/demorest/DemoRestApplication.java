package com.example.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);
		System.out.print("Harshini");
	}

}

