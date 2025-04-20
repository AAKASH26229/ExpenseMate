package com.expensemate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ExpenseMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseMateApplication.class, args);
	}

}
