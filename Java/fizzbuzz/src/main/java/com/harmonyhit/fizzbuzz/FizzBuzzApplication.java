package com.harmonyhit.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOGGER.info("Fizz Buzz Test");
	}
}
