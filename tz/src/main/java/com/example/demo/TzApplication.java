package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TzApplication {

	@Bean
	public MessMapperDAO messMapper() throws Exception {
		return new MessMapperDAO() {
			@Override
			public String getMessage(String message) {
				return message;
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(TzApplication.class, args);
	}
}
